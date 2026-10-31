package _2program.exceptions;

public class NoWithdrawLimitException extends RuntimeException {
    public NoWithdrawLimitException(String msg){
        super(msg);
    }
}
