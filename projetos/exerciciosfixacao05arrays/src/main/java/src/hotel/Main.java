package src.hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *
         * Sistema de hotel
         * While true com opção de cadastrar e opção de fechar
         * vetor para armazenar os hospedes
         * ler o vetor inteiro
         * */
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        boolean k = true;
        int room;
        Customer[] customers = new Customer[9];
       /* for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer(i);
        }*/

        System.out.println("Sistema Hotel");
        while (k) {
            System.out.println("Oque gostarida de fazer? 1 Cadastrar Cliente, 2 Vagar quarto, 3 liste todos os quartos, 4 sair");
            while (true) {
                choice = scanner.nextInt();
                if (!(choice < 1 || choice > 3)) {
                    break;
                }
                System.out.println("Escolha uma opção valia");
            }

            switch (choice) {
                case 1:
                    System.out.println("Digite o quarto");
                    room = scanner.nextInt();
                    System.out.println("Digite o Email do hospede");
                    String email = scanner.next();
                    System.out.println("Digite o nome do Hospede");
                    String name = scanner.next();

                    customers[room] = new Customer(room, email, name);
                    break;
                case 2:
                    System.out.println("Digite o quarto a ser vagado");
                    room = scanner.nextInt();
                    customers[room].setEmail("none");
                    customers[room].setName("none");

                    break;
                case 3:
                    for (Customer customer : customers) {
                        if(customer != null){
                        System.out.println();
                        System.out.println("Quarto: " + customer.getRoom());
                        System.out.println("Nome: " + customer.getName());
                        System.out.println("E-mail: " + customer.getEmail());
                        System.out.println();}
                    }
                    break;
                case 4:
                    k = false;
                    break;

            }
        } //fim while
    }
}
