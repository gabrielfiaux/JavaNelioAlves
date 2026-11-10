package services;

public interface OnlinePaymentServices {
    public Double paymantFee(Double amount);
    public Double interest(Double amount, Integer months);
}
