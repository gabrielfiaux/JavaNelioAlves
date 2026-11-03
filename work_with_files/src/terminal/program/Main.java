package terminal.program;

import terminal.services.Terminal;
import terminal.enums.Options;

import java.io.File;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAMA DE GERENCIAMENTO DE ARQUIVOS INICIADO");
        boolean loop = true;
        while (loop) {
            String path;
            String input;
            Options option;

            System.out.println("Oque deseja fazer?");
            System.out.print("CREATE READ -UPDATE -DELETE -EXIT");
            System.out.println();
            input = scanner.next();
            option = Options.valueOf(input);
            switch (option) {
                case EXIT:
                    System.out.println("Saiu do programa");
                    loop = false;
                    break;
                case CREATE:
                    scanner.nextLine();
                    System.out.println("Digite o nome do arquivo que deseja criar");
                    path = scanner.nextLine();
                    Terminal.createFile(path);
                    break;
                case READ:
                    scanner.nextLine();
                    System.out.println("Digite o nome do arquivo que deseja ler");
                    path = scanner.nextLine();
                    Terminal.readFileWithNumberInLine(path);
                    break;
                case UPDATE:
                    scanner.nextLine();
                    System.out.println("Digite o nome do arquivo que deseja atualizar");
                    path = scanner.nextLine();
                    Terminal.updateFile(path);
                    break;
                case DELETE:
                    scanner.nextLine();
                    System.out.println("Digite o nome do arquivo que deseja deletar");
                    path = scanner.nextLine();
                    Terminal.deleteFile(path);
                    break;
            }


        }
        scanner.close();
        System.out.println("Fim do programa");
    }
}
