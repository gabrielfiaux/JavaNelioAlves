package _2program.exceptions;

public class InsuficientBalanceException extends RuntimeException {
    public InsuficientBalanceException(String msg) {
        super("Withdraw error: Notenoughbalance");
    }
}
