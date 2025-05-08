package src;

import src.methods.ValidaEntrada;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        /*
         *
         * Fazer 3 arrays e um para o nome e outros para as
         * notas
         * e sincroniza-los.*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String[] nome;
        double[] notaA;
        double[] notaB;

        System.out.println("Quantos alunos deseja digitar?");
        n = ValidaEntrada.validaEntrada(n);
        nome = new String[n];
        notaA = new double[n];
        notaB = new double[n];
        for (int i = 0; i < nome.length; i++) {

            System.out.println("Digite o nome.");
            nome[i] = sc.next();
            System.out.println("Digite a primeira nota.");
            notaA[i] = sc.nextDouble();
            System.out.println("Digite a segunda nota.");
            notaB[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados");


        for (int i = 0; i < nome.length; i++) {
            if(((notaA[i]+ notaB[i]) /2) >= 6.0 ){
                System.out.println(nome[i]);
            }
        }


    }
}
