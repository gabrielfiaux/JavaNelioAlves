package services;

public class MercadoLivreService implements OnlinePaymentServices {
    private static final double FEE_PERCENTAGE = 0.01;
    private static final double MONTHLY_INTEREST = 0.02;

    @Override
    public Double interest(Double amount, Integer months) {
        return amount*MONTHLY_INTEREST*months;
    }

    @Override
    public Double paymantFee(Double amount) {
        return amount * FEE_PERCENTAGE;
    }
}
