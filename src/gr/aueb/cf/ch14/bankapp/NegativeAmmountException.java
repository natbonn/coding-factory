package gr.aueb.cf.ch14.bankapp;

public class NegativeAmmountException extends Exception {

    public NegativeAmmountException(String message) {
        super(message);
    }
}
