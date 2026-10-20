package rascunho;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    /*
    Fazer um programa para ler dois nimeros inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo numeros inteiros,
podendo haver repetigdes. Em seguida, ler um numero inteiro X que
pertence a matriz. Para cada ocorréncia de X, mostrar os valores a
esquerda, acima, a direita e abaixo de X, quando houver, conforme
exemplo.

Vai digitar o numero e fazer uma cruz ao redor dele,
se "y" for posição 0 então não haverá nada a cima
se y for a posição array[c][]" então não haverá nada abaixo
se x for a posição 0 não haverá nada a esquerda
se y for a posição array.lenght"-1" então não haverá nada a direita

ex de output:

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[][] arrayT = new int[ROW][COLUM];
        //[index do array][conteudo do array]
        //[0-1] [0-1]
        int[][] arrayM = { //[4][5]
                {11, 12, 13, 14, 15}
                , {21, 21, 21, 24, 25}
                , {31, 32, 33, 34, 35}
                , {41, 42, 43, 44, 45}
        };
        //for row ou seja do index dos arrays
        for (int row = 0; row < 4; row++) {
            for (int colum = 0; colum < 5; colum++) {
                System.out.print(arrayM[row][colum] + " ");

            }
            System.out.println();
        }
        System.out.println("Mostrando posição selecionada");

        String position = scanner.next();
        String[] splitPosition = position.split(",");
        int selectedRow = Integer.parseInt(splitPosition[0]);
        int selectedColum = Integer.parseInt(splitPosition[1]);
        //up
        if (selectedRow > 0) {
            System.out.println("   "+arrayM[selectedRow - 1][selectedColum]);
        }
        //left
        if(selectedColum>0){
            System.out.print(arrayM[selectedRow][selectedColum-1]+" ");
        }
        //middle
        System.out.print(arrayM[selectedRow][selectedColum]);
        //right
        if (selectedColum<4)
            System.out.println(" "+arrayM[selectedRow][selectedColum+1]);
        //down
        if(selectedRow<3){
            System.out.println(arrayM[selectedRow+1][selectedColum]);
        }


    }
}
