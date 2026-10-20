package exercice;

import java.util.Scanner;

public class NegativeProblem {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNegatives = 0;
        System.out.println("How many values you want to type?");
        int vectPositiveAndNegative[] = new int[scanner.nextInt()];
        for (int i = 0; i < vectPositiveAndNegative.length; i++) {

            System.out.printf("type the %dº value", i + 1);
            vectPositiveAndNegative[i] = scanner.nextInt();

            if (vectPositiveAndNegative[i] < 0) {
                totalNegatives++;
            }
        }
        System.out.println("Total of negatives values: " + totalNegatives);
    }
}

