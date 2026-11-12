package lercsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class lercsv {
    static void main() {
        String pathStr = "C:\\Documentos\\cursos\\JavaNelioAlves\\listinha_arquivos\\src\\arquivos\\funcionarios.csv";
        try (BufferedReader bfr = new BufferedReader(new FileReader(pathStr))) {
            String linha = bfr.readLine();
            List<String> lista = new ArrayList<>();
            while (linha != null) {
                lista.add(linha);
                linha = bfr.readLine();
            }
            try {
                lista.sort(null);
                for(String linha2 :  lista){
                    System.out.println(linha2);
                }
            }catch (RuntimeException e){
                System.out.println("Erro ao ler o arquivo");
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }


    }
}
