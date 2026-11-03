package main;

import java.io.FileWriter;
import java.io.IOException;

public class Inserir {
    static void main(String[] args) {
        try (FileWriter fileApend = new FileWriter("src/files/novo documento de texto.txt", true)) {
            for (int i = 0; i < 10; i++) {

                fileApend.write("\nVITÓRIA TE AMO TE QUERO");
                System.out.println("Texto inserido");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

