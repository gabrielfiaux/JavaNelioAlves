package src.methods;

import java.util.Scanner;

public class ValidaEntrada {
    public static int validaEntrada(int n) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            n = scanner.nextInt();

            if (n > 0) {
                return n;

            } else {
                System.out.println("Digite um Numero maior que zero");
            }
        }

    }
}
