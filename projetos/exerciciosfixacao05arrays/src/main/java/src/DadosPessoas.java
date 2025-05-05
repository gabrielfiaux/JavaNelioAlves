package src;

import java.util.Locale;
import java.util.Scanner;

import src.dadopessoas.Person;
import src.methods.ValidaEntrada;

public class DadosPessoas {
    /*
     * scan
     * n
     * Person Array
     * maior
     * menor
     * media das mulheres
     * contagem de homens
     * */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        Person[] array;
        double smallest = 100;
        double bigger = 0;
        double female_med = 0;
        int male_cont = 0;
        System.out.println("Quantas pessoas serão cadastradas?");
        n = ValidaEntrada.validaEntrada(n);
        array = new Person[n];
        for (int i = 0; i < array.length; i++) {

            array[i] = new Person();
            System.out.println("Digite a altura");
            array[i].setHeight(scanner.nextDouble());

            if (array[i].getHeight() > bigger) {
                bigger = array[i].getHeight();
            }
            if (smallest > array[i].getHeight()) {
                smallest = array[i].getHeight();
            }

            System.out.println("Digite o sexo `F´ ou ´M`");
            while (true) {
                String sex = scanner.next().toUpperCase();
                array[i].setSex(sex);

                if (array[i].getSex().equalsIgnoreCase("F")) {
                    female_med += array[i].getHeight();
                    break;
                }

                if (array[i].getSex().equalsIgnoreCase("M")) {
                    male_cont++;
                    break;
                } else {
                    System.out.println("O sistem aceita somente 'F' ou 'M' maiusculos");
                }
            }


        }

        female_med /= n-male_cont;
        System.out.println("Media das alturas das mulheres = " + female_med);
        System.out.println("Numero de homens =" + male_cont);

    }
}
