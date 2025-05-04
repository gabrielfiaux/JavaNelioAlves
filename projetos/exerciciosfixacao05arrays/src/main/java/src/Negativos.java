package src;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int[] a;
        System.out.println("Este programa le numeros e restorna os negativos");
        while (true) {
            System.out.println("Quantos numeros deseja digitar?");
            n = scanner.nextInt();
            if (n > 10 || n <= 0) {
                System.out.println("no maximo 10 numeros por vez, no minimo 1");
            } else {
                break;
            }

        }
        System.out.println("Digite " + n + " numeros.");
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            n = scanner.nextInt();
            a[i] = n;
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                System.out.println(a[i]);
            }
        }


    }
}
