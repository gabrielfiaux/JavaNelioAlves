package exercice;

import exercice.model.Student;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pension {
    public static void main(String[] args) {
        // O programa le o numero de estudantes que tem que ser menor que10
        // percorre o array vectroom
        Scanner scanner = new Scanner(System.in);
        Student[] vectRooms = new Student[10];
        int studentQuantity;
        System.out.println("How many rooms will be rented?");
        studentQuantity = scanner.nextInt();
        //apenas consome o enter gerado pela chamada a cima.
        scanner.nextLine();
        for (int i = 0; i < studentQuantity; i++) {
            String name;
            String email;
            int roomNumber;
            //pede os dados do estudante, seta, pergunta o quarto e indexa ao quarto.
            System.out.println("Insert the student data:");
            System.out.println("Name:");
            name = scanner.nextLine();

            System.out.println("E-mail:");
            email = scanner.next();
            System.out.println("Room number:");

            while (true) {
                roomNumber = scanner.nextInt();
                if (roomNumber >= 0 && roomNumber <= 9) {
                    if (vectRooms[roomNumber] == null) {
                        vectRooms[roomNumber] = new Student(name, email);
                        System.out.println("Room successfully rented");
                        break;
                    } else {
                        System.out.println("The room is not empty, chose other room:");
                    }
                } else {
                    System.out.println("Only 0-9 numbers");
                }
            }


        }

        for (int i = 0; i < vectRooms.length; i++) {
            if (vectRooms[i] != null) {
                System.out.println("Rent #" + i);
                System.out.println("Name: " + vectRooms[i].getName());
                System.out.println("Email: " + vectRooms[i].getEmail());
                System.out.println();
            }
        }
        scanner.close();

    }
}
