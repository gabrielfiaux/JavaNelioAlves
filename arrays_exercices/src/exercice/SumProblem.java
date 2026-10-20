package exercice;

import java.util.Scanner;

public class SumProblem {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers you want to sum?:");
        double[] vect = new double[scan.nextInt()];
        double sum =0;
        for (int i=0; i<vect.length; i++){
            System.out.printf("Type the %dº number%n", i+1);
            vect[i] = scan.nextDouble();
        }
        System.out.println("The numbers typed");
        for (int i=0; i< vect.length; i++){
            System.out.printf("{%.2f}",vect[i]);
            sum += vect[i];
        }
        System.out.println();
        System.out.printf("The sum of values: %.2f",sum);

    }
}

