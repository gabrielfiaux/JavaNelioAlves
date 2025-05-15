package listagemfuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean loop4 = true;
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario(0, "Missingo", 1.0));

        System.out.println("Bem vindo ao sistema de Recursos Humanos");
        while (true) {
            System.out.println("O que gostaria de fazer?");
            System.out.println("1 Cadastrar Funcionarios");
            System.out.println("2 Listar Funcionarios");
            System.out.println("3 Excluir Funcionarios");
            System.out.println("4 Alterar Salario");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choice1;
                    System.out.println("Quantos usuarios gostaria de cadatrar?");
                    choice1 = scanner.nextInt();
                    for (int i = 0; i < choice1; i++) {
                        int id;
                        String name;
                        Double salary;
                        System.out.println("Digite o id");
                        id = scanner.nextInt();
                        System.out.println("Digite o nome");
                        name = scanner.next();
                        System.out.println("Digite o salario");
                        salary = scanner.nextDouble();
                        funcionarios.add(new Funcionario(id, name, salary));
                    }
                    System.out.println("Saindo tela de cadastro...");
                    break;
                case 2:
                    for (Funcionario f : funcionarios) {
                        System.out.println(f.toString());
                    }
                    System.out.println("-----------------");
                    break;
                case 4:
                    while (loop4) {
                        int idselected;
                        double percent;
                        System.out.println("Digite o id do funcionario ou -1 para sair");
                        idselected = scanner.nextInt();
                        if (idselected == -1) {
                            break;
                        } else {
                            for (Funcionario f : funcionarios) {
                                if (idselected == f.getId()) {
                                    System.out.println("Quantos % deseja aumentar?");
                                    percent = scanner.nextDouble();
                                    f.setSalary(f.getSalary() + (f.getSalary() * percent / 100));
                                    System.out.println("Salario aumentado com sucesso");
                                    loop4 = false;
                                    break;
                                }
                            }
                        }

                    }//loop4
            }
        }

    }


}// fim programa


