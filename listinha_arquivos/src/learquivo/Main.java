package learquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    static void main() {
        String strPath = "C:\\Documentos\\cursos\\JavaNelioAlves\\listinha_arquivos\\src\\arquivos\\listinha.txt";
        Path path = Paths.get(strPath);

        try {
            List<String> lista = Files.readAllLines(path);
            lista.sort(null);
            for (String linha: lista){
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("ERRO");
        }
    }
}
