package gr.aueb.cf.ch18.bankapp.core.exceptions;

public class InsuffficientBalanceException extends Exception {

    public InsuffficientBalanceException(String message) {
        super(message);
    }
}
