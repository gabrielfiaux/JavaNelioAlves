package src;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import src.methods.ValidaEntrada;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        /*
         * var scan
         * var n
         * var media
         * double array
         *DecimalFormat format
         *
         * definir o n de elementos no vetor
         * media = soma dos elementos
         * media = media/n
         * loop com if(vetor[i]<media)*/
        DecimalFormat df = new DecimalFormat("0.000");
        Locale.setDefault(Locale.US); // Define o ponto como separador decimal em todo o programa
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        double med=0;
        double[] array;
        System.out.println("Quantos numeros deseja somar?");
        n = ValidaEntrada.validaEntrada(n);
        array = new double[n];
        for (int i = 0; i < array.length; i++){
            System.out.print("Digite um numero:");
            array[i] = scanner.nextDouble();
            med += array[i];
        }
        System.out.println();
        med = med/n;
        System.out.println("Media do vetor = "+df.format(med));
        System.out.println("Elementos abaixo da media:");
        for(int i = 0; i < array.length; i++){
            if (array[i]<med){
                System.out.println(array[i]);
            }
        }

    }
}
