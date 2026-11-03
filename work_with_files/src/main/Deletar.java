package main;

import java.io.File;
import java.util.Scanner;

public class Deletar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Qual o arquivo que deseja deletar?");
        name = sc.nextLine();
        File file = new File(name);
        if(file.delete()){
            System.out.println("Arquivo deletado");
        }else{
            System.out.println("Arquivo não localizado");
        }
        System.out.println("fim do pograma");
    }
}
