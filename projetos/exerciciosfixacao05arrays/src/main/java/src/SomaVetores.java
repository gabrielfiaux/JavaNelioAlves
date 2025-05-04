package src;

import src.methods.ValidaEntrada;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        //scan
        //n
        //array a, array b, loop pra popular, loop pra somar
        Scanner scanner = new Scanner(System.in);
        int n= 0;
        int[] arraya;
        int[] arrayb;
        System.out.println("Qual o tamanho do vetor desejado?");
        n = ValidaEntrada.validaEntrada(n);
        arraya = new int[n];
        arrayb = new int[n];
        System.out.println("Valors de A");
        for (int i = 0; i<arraya.length; i++){
            System.out.print("Digite um numero:");
            arraya[i] = scanner.nextInt();

        }
        System.out.println("Valores do B");
        for (int i = 0; i<arrayb.length; i++){
            System.out.print("Digite um numero:");
            arrayb[i] = scanner.nextInt();
        }
        System.out.println("Soma dos arrays");
        for (int i = 0; i<arrayb.length; i++){
            System.out.println(arraya[i]+arrayb[i]);
        }
    }
}
