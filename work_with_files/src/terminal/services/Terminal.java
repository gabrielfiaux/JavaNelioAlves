package terminal.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Terminal {
    FileWriter fileWriter;
    Scanner scanner = null;


    public static void createFile(String fileName) throws IOException {
        try {
            File file1 = new File(fileName);
            if (file1.createNewFile()) {
                System.out.println("File created");
            }else System.out.println("file already exists");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if(file.delete()){
            System.out.println("File deleted");
        }else{
            System.out.println("File not founded");
        };


    }

}
