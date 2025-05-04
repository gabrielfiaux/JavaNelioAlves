package src;

import src.methods.ValidaEntrada;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int n = 0;
        int counter = 0;
        System.out.println("Quantos numeros numeros gostaria de digitar?");
        n = ValidaEntrada.validaEntrada(n);
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um numero:");
            array[i] = scanner.nextInt();

        }
        System.out.println("Conteudo do array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Quantidade de numeros pares = "+counter);
    }
}
