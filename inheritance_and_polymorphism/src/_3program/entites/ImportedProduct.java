package _3program.entites;

import com.sun.jdi.DoubleValue;

import java.util.Locale;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return (getName() + " $ " + (String.format(Locale.US, "%.2f", totalPrice()) + " (Customs fee: $ " + String.format(Locale.US, "%2.f", customsFee + ")")));
    }

    public Double totalPrice() {
        return getPrice() + getCustomsFee();
    }
}
