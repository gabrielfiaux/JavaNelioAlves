package exercice;

import java.util.Scanner;

public class ArrayChalange {
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
        int[][] arrayM;
        int rowNumber;
        int columnNumber;

        String position;
        String[] splittedPosition;
        int rowPosition;
        int columnPosition;
        //int[][] arrayT = new int[ROW][COLUM];
        //[index do array][conteudo do array]
        //[0-1] [0-1]
        System.out.print("Type the number of rows: ");
        rowNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.println("Type the number of columns ");
        columnNumber = scanner.nextInt();
        scanner.nextLine();

        arrayM = new int[rowNumber][columnNumber];
        for (int actualRow = 0; actualRow < rowNumber; actualRow++) {
            for (int actualColumn = 0; actualColumn < columnNumber; actualColumn++) {
                System.out.printf("Type the content of the position %d,%d :", actualRow, actualColumn);
                arrayM[actualRow][actualColumn] = scanner.nextInt();
                scanner.nextLine();

            }
        }

        System.out.println("*Printing arraym*");
        for (int actualRow = 0; actualRow < rowNumber; actualRow++) {
            for (int actualColumn = 0; actualColumn < columnNumber; actualColumn++) {
                System.out.printf(" %d", arrayM[actualRow][actualColumn]);
            }
            System.out.println();
        }


        while (true) {
            System.out.print("Search content in array by position:");
            position = scanner.next();
            scanner.nextLine();
            splittedPosition = position.split(",");
            rowPosition = Integer.parseInt(splittedPosition[0]);
            columnPosition = Integer.parseInt(splittedPosition[1]);

            //TASK
            // imprimir o resultado das posições dentro do array,
            System.out.printf("Value in postion [%d,%d]:%d%n", rowPosition, columnPosition,
                    arrayM[rowPosition][columnPosition]);
            //up
            if (rowPosition > 0) {
                System.out.println("  " + arrayM[rowPosition - 1][columnPosition]);
            }
            //left
            if (columnPosition > 0)
                System.out.print(arrayM[rowPosition][columnPosition - 1] + " ");
            //center
            System.out.print(arrayM[rowPosition][columnPosition]);
            //right
            /*


             */
            if (columnPosition < columnNumber-1) {
                System.out.println(" " + arrayM[rowPosition][columnPosition + 1]);
            }
            //down
            if (rowPosition < rowNumber-1) {
                System.out.print("  " + arrayM[rowPosition + 1][columnPosition]);
                System.out.println();
            }

        }
        //TACAR DENTRO DE UM WHILE


        //LEGACY CODE
//        };
//        //for row ou seja do index dos arrays
//        for (int row = 0; row < 4; row++) {
//            for (int colum = 0; colum < 5; colum++) {
//                System.out.print(arrayM[row][colum] + " ");
//
//            }
//            System.out.println();
//        }
//        System.out.println("Mostrando posição selecionada");
//
//        String position = scanner.next();
//        String[] splitPosition = position.split(",");
//        int selectedRow = Integer.parseInt(splitPosition[0]);
//        int selectedColum = Integer.parseInt(splitPosition[1]);
//        //up
//        if (selectedRow > 0) {
//            System.out.println("   "+arrayM[selectedRow - 1][selectedColum]);
//        }
//        //left
//        if(selectedColum>0){
//            System.out.print(arrayM[selectedRow][selectedColum-1]+" ");
//        }
//        //middle
//        System.out.print(arrayM[selectedRow][selectedColum]);
//        //right
//        if (selectedColum<4)
//            System.out.println(" "+arrayM[selectedRow][selectedColum+1]);
//        //down
//        if(selectedRow<3){
//            System.out.println(arrayM[selectedRow+1][selectedColum]);
//        }


    }
}

