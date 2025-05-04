package src;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        float[] v;
        float sum = 0;
        float med = 0;
        System.out.println("Quantos numeros você vai digitar?");
        while (true) {
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Sómente numeros maiores que 0");
            } else {
                break;
            }
        }

        v = new float[n];
        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite um numero:");
            n = scanner.nextInt();
            v[i] = n;

        }

        System.out.println();
        System.out.print("VALORES =");
        for (int i = 0; i < v.length; i++) {
            if (i+1 == v.length) {
                System.out.print(" " + v[i]);
            } else {
                System.out.print(" " + v[i] + ",");
            }
        }
        System.out.println();
        System.out.print("SOMA =");
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        System.out.print(" " + sum);
        med = sum / n;
        System.out.println();
        System.out.println("MEDIA = " + med);
    }
}
