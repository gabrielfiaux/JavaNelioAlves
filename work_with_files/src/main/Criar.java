package main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Criar {
    static void main(String[] args) {
        File file1 = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do arquivo?");
        String name = sc.nextLine();
        try {
            file1 = new File("C:\\Documentos\\cursos\\JavaNelioAlves\\work_with_files\\src\\files\\" + name + ".txt");
            if (file1.createNewFile()) {
                System.out.println("Arquivo criado");
                System.out.println("Nome: " + file1.getName());
                System.out.println("Caminho: " + file1.getPath());
                System.out.println("Caminho absoluto: " + file1.getAbsolutePath());
            } else {
                System.out.println("Erro: arquivo existente");
            }
        } catch (IOException e) {
            System.out.println("Falha ao tentar criar o arquivo");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
        }

    }
}
