package _3program.view;

import _3program.entites.ImportedProduct;
import _3program.entites.Product;
import _3program.entites.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date manufacturedDate = sdf.parse("15/03/2022");

        Product p1 = new Product("Arroz",3.3);
        System.out.println(p1.priceTag());

        Product p2 = new ImportedProduct("Rice",3.0, 20.0);
        System.out.println(p2.priceTag());

        Product p3 = new UsedProduct("Arroz vencido",1.0, manufacturedDate );
        System.out.println(p3.priceTag());
    }
}
