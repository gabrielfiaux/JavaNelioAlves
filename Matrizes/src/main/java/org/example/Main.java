package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz;
        int m;
        int n;
        System.out.println("Digite m:");
        m = sc.nextInt();
        System.out.println("Digite n:");
        n = sc.nextInt();
        matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int ii = 0; ii < matriz[i].length; ii++) {
                System.out.println("Add nmr:");
                matriz[i][ii] = sc.nextInt();
            }
        }

        for (int[] row: matriz){
            System.out.println();
            for (int table: row){
                System.out.print(table);
            }
        }




    }
}
