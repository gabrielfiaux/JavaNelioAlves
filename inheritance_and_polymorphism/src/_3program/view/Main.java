package _3program.view;

import _3program.entites.ImportedProduct;
import _3program.entites.Product;

public class Main {
    public static void main() {

        Product p1 = new Product("Arroz",3.3);
        System.out.println(p1.priceTag());

        Product p2 = new ImportedProduct("Rice",3.0, 20.0);
        System.out.println(p2.priceTag());
    }
}
