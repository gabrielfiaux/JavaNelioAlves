package exercice;

import java.util.Scanner;

public class BiggestPosition {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vect;
        int biggestPosition = 0;//deve ser inicializado pois será chamado fora do for

        System.out.println("Quantity of numbers");
        vect = new double[scanner.nextInt()];
        //preenche campos do vect
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Insert number %d/%d: %n ", i + 1, vect.length);
            vect[i] = scanner.nextDouble();

            // na primeira iteração essa condição será pulada mas o resultado sempre será 0
            // na segunda ja compara vect[1]>vect[0]
            if (vect[i] > vect[biggestPosition]) {
                biggestPosition = i; //Sabendo a posição consigo posteriormente localizar o maior número.
            }
        }
        //Mostrar os resultados
        System.out.printf("THE BIGGEST NUMBER: %.2f%n", vect[biggestPosition]);
        System.out.printf("IN THE POSITION %d%n", biggestPosition);
        scanner.close();
    }
}
