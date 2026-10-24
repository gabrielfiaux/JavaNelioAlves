package _2program.view;

import _2program.entites.Employee;
import _2program.entites.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        List<Employee> employeesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n;


        System.out.println("Enter de number of employees: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String isOutSourced;
            String name;
            Integer hour;
            Double valuePerHour;
            Double adicionalCharge;

            System.out.println("Outsourced? y/n");
            isOutSourced = scanner.next();


            scanner.nextLine();
            System.out.println("Name:");
            name = scanner.nextLine();


            System.out.println("Hour:");
            hour = scanner.nextInt();
            System.out.println("Value per hour:");
            valuePerHour = scanner.nextDouble();

            if (isOutSourced.equalsIgnoreCase("y")) {

                    System.out.println("Adicional Charge: ");
                    adicionalCharge = scanner.nextDouble();

                Employee employee = new OutSourcedEmployee(name, hour, valuePerHour, adicionalCharge);
                employeesList.add(employee);
            } else {
                Employee employee = new Employee(name, hour, valuePerHour);
                employeesList.add(employee);
            }


        }

        //Le os dados
        System.out.println("PAYMANTS");
        for (Employee e : employeesList) {
            System.out.printf("%s - $ %.02f%n", e.getName(), e.payment());
        }


    }

}
