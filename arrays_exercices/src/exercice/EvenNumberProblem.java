package exercice;

import java.util.Scanner;

public class EvenNumberProblem {
    public static void main(String[] args) {
        int[] vect;
        Scanner scanner = new Scanner(System.in);
        int evenNumberQuantity=0;

        System.out.println("Insert the quantity of numbers what you want do type: ");
        vect = new int[scanner.nextInt()];
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Insert number %d/%d%n: ", i + 1, vect.length);
            vect[i] = scanner.nextInt();
            if (vect[i]%2 ==0){
                evenNumberQuantity++;
            }
        }
        System.out.println("EVEN NUMBERS:");
        for (int i = 0; i < vect.length; i++){
            if(vect[i]%2==0) {
                System.out.printf("%5d", vect[i]);
            }
        }
        System.out.println();
        System.out.printf("EVEN NUMBERS QUANTITY: %d",evenNumberQuantity);
    }
}
