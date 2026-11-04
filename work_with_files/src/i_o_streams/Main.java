package i_o_streams;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    static void main(String[] args) {
        //declaração do file input com trywithrecurses
        try (FileInputStream inputStream = new FileInputStream("C:\\Documentos\\cursos\\JavaNelioAlves\\work_with_files\\src\\files\\Captura de tela 2026-10-20 141733.png")) {
            //variavel de controle
            int i;
            while ((i = inputStream.read()) != -1) {
                // Convert the byte to a character and print it to the console
                System.out.print((char) i);
            }


        } catch (IOException e) {
            System.out.println("DEU RUIM LENDO O ARQUIVO");
        }

    }
}
