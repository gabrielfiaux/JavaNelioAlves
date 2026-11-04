package terminal.services;

import java.io.*;
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

    public static void updateFile(String fileName){
        try (FileWriter fileWriter = new FileWriter(fileName,true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            System.out.print(": ");
            Scanner scanner = new Scanner(System.in);
            String content = scanner.nextLine();
                bufferedWriter.newLine();
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void overWritingFile(String fileName){
        try (FileWriter fileWriter = new FileWriter(fileName)){
            System.out.print(": ");
            Scanner scanner = new Scanner(System.in);
            String content = scanner.nextLine();
            fileWriter.write(content);
            System.out.println(fileWriter.toString() + "is Updateded");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}//
