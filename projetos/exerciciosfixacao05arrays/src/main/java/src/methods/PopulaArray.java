package src.methods;

import java.util.Scanner;

public class PopulaArray {

    public static int[] pop(int[] a,String msg){
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<a.length; i++){
            System.out.println(msg);
        a[i] = scanner.nextInt();
        }

        return a;
    }

    public static double[] pop(double[] a,String msg){
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<a.length; i++){
            System.out.print(msg);
            a[i] = scanner.nextDouble();
        }
        return a;
    }

    public static String[] pop(String[] a, String msg){
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<a.length; i++){
            System.out.print(msg);
            a[i] = scanner.next();
        }
        return a;
    }


}
