package main;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ler {
    static void main(String[] args) {
        File myObj = new File("arquivodetexto2.txt");

        try(Scanner myReader = new Scanner(myObj)){
            while (myReader.hasNextLine()){
            String data = myReader.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException e){
            System.out.println("Deu ruim");
            e.printStackTrace();
        }

    }
}
