package gr.aueb.cf.ch18.bankapp.service;

import gr.aueb.cf.ch14.bankapp.InsufficientBalanceException;
import gr.aueb.cf.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.bankapp.core.exceptions.NegativeAmountException;
import gr.aueb.cf.ch18.bankapp.core.mapper.Mapper;
import gr.aueb.cf.ch18.bankapp.dao.IAccountDAO;
import gr.aueb.cf.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountWithdrawDTO;
import gr.aueb.cf.ch18.bankapp.model.Account;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class AccountServiceImpl implements IAccountService {
    private final IAccountDAO accountDAO;                 // dependency injection

    public AccountServiceImpl(IAccountDAO accountDAO) {   // dependency injection
        this.accountDAO = accountDAO;
    }

    @Override
    public AccountReadOnlyDTO createNewAccount(AccountInsertDTO accountInsertDTO) {
        Account accountToReturn;

        Account account = Mapper.mapToModelEntity(accountInsertDTO);
        accountToReturn = accountDAO.saveOrUpdate(account);
        return Mapper.mapToReadOnlyDTO(accountToReturn);
    }

    @Override
    public void deposit(AccountDepositDTO depositDTO)
            throws AccountNotFoundException, NegativeAmountException {
        try {
            if (depositDTO.amount().compareTo(BigDecimal.ZERO) < 0) {
                throw new NegativeAmountException("The deposit amount cannot be less than zero");
            }
            Account account = accountDAO.findByIban(depositDTO.iban())          // καλή πρακτική το DAO να μας δίνει Optional
                    .orElseThrow(() ->
                            new AccountNotFoundException("Account with IBAN: " + depositDTO.iban() + " not found"));
            account.setBalance(account.getBalance().add(depositDTO.amount()));
            accountDAO.saveOrUpdate(account);
            // audit trail: who, when, what, initial balance, resulting balance
        } catch (NegativeAmountException e) {
            System.err.printf("%s. The amount %f is not allowed. \n", LocalDateTime.now(), depositDTO.amount());
            throw e;
        } catch (AccountNotFoundException e) {
            System.err.printf("%s. Account with IBAN %s not found. \n", LocalDateTime.now(), depositDTO.iban());
            throw e;
        }

    }

    @Override
    public void withdraw(AccountWithdrawDTO withdrawDTO)
            throws AccountNotFoundException, InsufficientBalanceException {
        try {
            Account account = accountDAO.findByIban(withdrawDTO.iban())          // καλή πρακτική το DAO να μας δίνει Optional
                    .orElseThrow(() ->
                            new AccountNotFoundException("Account with IBAN: " + withdrawDTO.iban() + " not found"));

            if (account.getBalance().compareTo(withdrawDTO.amount()) < 0) {
                throw new InsufficientBalanceException("Invalid amount " + withdrawDTO.amount() +
                        " for account with IBAN: " + account.getIban() + " is greater than the balance");
            }

            account.setBalance(account.getBalance().subtract(withdrawDTO.amount()));
            accountDAO.saveOrUpdate(account);
            // audit trail: who, when, what, initial balance, resulting balance
        } catch (InsufficientBalanceException e) {
            System.err.printf("%s. The amount %f is greater than the balance of the account with IBAN: . \n",
                    LocalDateTime.now(), withdrawDTO.amount(), withdrawDTO.iban());
            throw e;
        } catch (AccountNotFoundException e) {
            System.err.printf("%s. Account with IBAN %s not found. \n", LocalDateTime.now(), withdrawDTO.iban());
            throw e;
        }


    }

    @Override
    public void getBalance(String iban)
            throws AccountNotFoundException {

    }

    @Override
    public List<AccountReadOnlyDTO> getAllAccounts() {
        return List.of();
    }
}
