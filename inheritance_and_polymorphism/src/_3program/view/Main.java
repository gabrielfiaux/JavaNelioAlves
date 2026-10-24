package _3program.view;

import _3program.entites.ImportedProduct;
import _3program.entites.Product;
import _3program.entites.UsedProduct;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main() throws ParseException {
        // Cria um formatador que reconhece datas escritas
        // como dia/mês/ano.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");


        Scanner scanner = new Scanner(System.in);
        int n;
        List<Product> productList = new ArrayList<>();
        System.out.println("Enter de number of products:");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            String name;
            Double price;
            Double customsFee;
            Date manufacturedDate;

            System.out.printf("Product #%d data:%n", i);
            System.out.println("Common used or imported? (c/u/i/)");
            String selectproductType = scanner.next();
            switch (selectproductType) {
                case "i":
                    System.out.print("Name:");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println();
                    System.out.print("Price:");
                    price = scanner.nextDouble();
                    System.out.print("Customs fee:");
                    customsFee = scanner.nextDouble();
                    Product importedProduct = new ImportedProduct(name, price, customsFee);
                    productList.add(importedProduct);
                    break;
                case "u":
                    System.out.print("Name:");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println();
                    System.out.print("Price:");
                    price = scanner.nextDouble();
                    System.out.println("Manufactured date (DD/MM/YYYY)");
                    manufacturedDate = sdf.parse(scanner.next());
                    Product usedProduct = new UsedProduct(name, price, manufacturedDate);
                    productList.add(usedProduct);
                    break;

                case "c":
                    System.out.print("Name:");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println();
                    System.out.print("Price:");
                    price = scanner.nextDouble();
                    Product product = new Product(name, price);
                    productList.add(product);
                    break;
                default:
                    System.out.println("Invalid product type!");
                    i--;
                    break;

            }//switch
        }//for
        for (Product p : productList) {
            System.out.println(p.priceTag());
        }


    }
}
