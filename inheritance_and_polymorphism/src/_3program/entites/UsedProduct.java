package _3program.entites;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UsedProduct extends Product {
    private DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
    private Date manufacturedDate;

    public UsedProduct(String name, Double price, Date manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }


    @Override
    public String priceTag() {
        return getName()
                + " (Used)"
                + " $ "
                + String.format(Locale.US, "%.2f", getPrice())
                + String.format(" (Manufactured Date: "
                + dateFormat.format(getManufacturedDate()))
                + ")";
    }
}
