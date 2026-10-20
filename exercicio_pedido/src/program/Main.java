package program;

import entites.Client;
import entites.Order;
import entites.OrderItem;
import entites.Product;
import entites.enums.OrderStatus;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

import static entites.enums.OrderStatus.PENDING_PAYMENT;

public class Main {
    static void main(String[] args) throws ParseException {



        Scanner scanner = new Scanner(System.in);


        //var cliente
        String clientName;
        String clientEmail;
        String clientBirthDateStr;
        int dayOfBirthDay;
        int monthOfBirthDay;
        int yearOfBirthDay;

        //var order
        OrderStatus status;
        //item loop
        int n;

        // cliente
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        clientName = scanner.nextLine();


        System.out.println();
        System.out.print("E-mail: ");
        clientEmail = scanner.nextLine();


        System.out.println();
        System.out.print("Birth Date: DD/MM/YYYY ");
        clientBirthDateStr = scanner.nextLine();


        dayOfBirthDay = Integer.parseInt(clientBirthDateStr.substring(0, 2));
        monthOfBirthDay = Integer.parseInt(clientBirthDateStr.substring(3, 5));
        yearOfBirthDay = Integer.parseInt(clientBirthDateStr.substring(6, 10));

        Client client1 = new Client(clientName, clientEmail,
                LocalDate.of(yearOfBirthDay, monthOfBirthDay, dayOfBirthDay));

        System.out.println();

        //Order
        System.out.println("Order data: ");
        System.out.print("Status: ");
        status = OrderStatus.valueOf(scanner.next());
        Order order = new Order(status, client1);
        System.out.println();

        //Order itens
        System.out.print("How many itens to this order? :");
        n = scanner.nextInt();
        scanner.nextLine();
        //PROBLEMA FOR COM ENTER FANTASMA
        for (int i = 1; i <= n; i++) {
            String productName;
            Double productPrice;
            Integer productQuantity;
            System.out.printf("%dº item data: %n", i);
            System.out.println("Name: ");
            productName = scanner.nextLine();
            //scanner.nextLine();
            System.out.println();
            System.out.print("Price: ");
            productPrice = scanner.nextDouble();
            System.out.println();
            System.out.print("Quantity: ");
            productQuantity = scanner.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem orderItem = new OrderItem(productQuantity, product);
            order.addItem(orderItem);
            scanner.nextLine();
        }
        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println(order);

    }

}
