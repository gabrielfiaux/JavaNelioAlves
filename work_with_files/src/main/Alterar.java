package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Alterar {
    static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String name;
            String content;
            boolean option;
            System.out.println("Digite o nome do arquivo que deseja alterar");
            name = scanner.nextLine();

            FileWriter fileWriter = new FileWriter(name);
            System.out.println("Deseja adicior ou sobre-escrever o texto no arquivo? true para adicionar e false para sobre-escrever");
            option = scanner.nextBoolean();
            System.out.println("Digite oque desenha adicionar:");
            scanner.nextLine();
            content = scanner.nextLine();

            fileWriter.write(content + option);
            System.out.println("Deu boa");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Deu ruim");
            e.printStackTrace();
        }
    }
}
