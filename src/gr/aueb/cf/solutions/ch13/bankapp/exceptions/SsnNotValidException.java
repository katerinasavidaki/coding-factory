package gr.aueb.cf.solutions.ch13.bankapp.exceptions;

import java.io.Serial;

public class SsnNotValidException extends Exception {

    @Serial
    private static final long serialVersionUID = -123456789L;

    public SsnNotValidException(String ssn) {
        super("Ssn: " + ssn + " not valid");
    }
}
