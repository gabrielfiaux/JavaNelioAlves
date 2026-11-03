package i_O_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
    static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("files/Captura de tela 2026-10-20 141733.png");
             FileOutputStream output = new FileOutputStream("files/copy.jpg") ) {

            int i;
            while ((i = input.read()) != -1) {
                output.write(i);
            }
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
