package exercice;

import java.util.Scanner;

public class SumVect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vectA;
        int[] vectB;
        int[] vectC;
        int setVectLenghtVar;

        System.out.printf("What is the vector lenght?:");
        setVectLenghtVar = scanner.nextInt();
        vectA = new int[setVectLenghtVar];
        vectB = new int[setVectLenghtVar];
        vectC = new int[setVectLenghtVar];

        //Percorre vectA
        for (int i = 0; i < vectA.length; i++) {
            System.out.printf("Insert number for vector A %d/%d: %n ", i + 1, vectA.length);
            vectA[i] = scanner.nextInt();
        }
        //Percorre vect B
        for (int i = 0; i < vectB.length; i++) {
            System.out.printf("Insert number for vector B %d/%d: %n ", i + 1, vectB.length);
            vectB[i] = scanner.nextInt();
        }
        System.out.println("Sum A+B");
        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];

            System.out.printf("%d%n", vectC[i]);
        }
        scanner.close();

    }
}
