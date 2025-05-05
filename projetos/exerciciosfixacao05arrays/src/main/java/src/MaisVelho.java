package src;

import src.methods.ValidaEntrada;

import java.util.Scanner;

public class MaisVelho {
    /*
     * Scan
     * ArrayA
     * BrrayB
     * Posição mais velho*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        String[] name;
        int[] age;
        int older_age = 0;
        int older_age_position = 0;
        System.out.println("Defina a quantidade de pessoas a serem cadastradas");
        n = ValidaEntrada.validaEntrada(n);
        name = new String[n];
        age = new int[n];
        for (int i = 0; i < age.length; i++) {
            System.out.println("Digite o nome");
            name[i] = scanner.next();
            System.out.println("Digite a idade");
            age[i] = scanner.nextInt();
            if (older_age < age[i]) {
                older_age = age[i];
                older_age_position = i;
            }

        }

        System.out.println("Peessoa Mais velha: "+name[older_age_position]);
    }
}
