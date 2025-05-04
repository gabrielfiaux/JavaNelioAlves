package src;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import src.methods.PopulaArray;
import src.methods.ValidaEntrada;

public class MediaPares {
    /*
     *
     * locale(us)
     * var scan
     * var n
     * double array
     * var med
     * pritf(abaixo da media).decimalFormat(0.0)*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        int n = 0;
        double[] array;
        double med = 0;
        boolean checkmed = false;
        System.out.println("Defina a quantidade de itens");
        n = ValidaEntrada.validaEntrada(n);
        array = new double[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um numero");
            array[i] = scanner.nextDouble();
            if (array[i] % 2 == 0) {
                checkmed = true;
                med += array[i];
            }
        }
        med /= n;
        if(checkmed == true){
            System.out.println("A Media dos pares é de : "+df.format(med));
        }else{
            System.out.println("Nenhum numero par");
        }

    }
}
