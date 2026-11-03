package terminal.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Terminal {

    public static void createFile(String fileName) {
        try {
            File file1 = new File(fileName);
            if (file1.createNewFile()) {
                System.out.println("File created");
            } else System.out.println("file already exists");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("File not founded");
        }
        ;


    }

    public static void readFile(String fileName) {
        File file = new File(fileName);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Deu ruim");
            e.getStackTrace();
        }
    }

    public static void readFileWithNumberInLine(String fileName) {
        File file = new File(fileName);
        int i = 1;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println("#" + i + " " + data);
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Deu ruim");
            e.getStackTrace();
        }
    }







}
