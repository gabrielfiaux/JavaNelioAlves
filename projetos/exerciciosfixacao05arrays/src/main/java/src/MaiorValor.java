package src;

import src.methods.ValidaEntrada;

import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        /*
        * var maior valor
        * var maior valor posição
        * var controle = maior valor
        * var n
        * var scanner
        *
        * perguntar quantos nmrs quer
        * loop pra escrever os nmrs dentro do array
        * loop percorrendo todo array  para setar a var maior valor
        * maior valor posição = i
        * */
        Scanner scanner = new Scanner(System.in);
        double bigger_value=-1000000;
        double control=bigger_value;
        int bigger_value_position=0;
        int n=0;
        double[] array;
        System.out.println("Quantos numeros gostaria de digitar?");
        n = ValidaEntrada.validaEntrada(n);
        array = new double[n];
        for (int i=0; i< array.length; i++){
            System.out.print("Digite um numero:");
            array[i] = scanner.nextInt();
            if (array[i]>bigger_value){
                bigger_value = array[i];
                bigger_value_position = i;
            }
        }
        System.out.println("Maior Valor = "+bigger_value);
        System.out.println("Posição do Maior valor = "+bigger_value_position);



    }
}
