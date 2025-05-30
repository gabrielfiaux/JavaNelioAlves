package src;

import src.methods.Person;
import src.methods.ValidaEntrada;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person[] person;
        Person[] underage;
        int n = 0;
        float med_height = 0;

        double underage_percent = 0;
        System.out.println("Quantas pessoas ira cadastrar?");
        n = ValidaEntrada.validaEntrada(n);
        person = new Person[n]; // Declara o tamanho do array
        underage = new Person[n]; // Declara o tamanho do array

        for (int i = 0; i < person.length; i++) {
            person[i] = new Person(); //Instacia uma pessoa no indice i
            String name = "";
            int age = 0;
            float height = 0.0f;

            System.out.println("Digite o nome da " + (1 + i) + "ª pessoa.");
            name = scanner.next();
            System.out.println("Digite a idade da " + (1 + i) + "ª pessoa.");
            age = scanner.nextInt();
            System.out.println("Digite a altura da " + (1 + i) + "ª pessoa.");
            height = scanner.nextFloat();

            person[i].setName(name);
            person[i].setAge(age);
            person[i].setHeight(height);
        }
        for (int i = 0; i < person.length; i++) {
            person[i].showPerson(person, i);
            System.out.println();
        }

        for (int i = 0; i < person.length; i++) {  // recebe as medias
            med_height += person[i].getHeight();

        }
        med_height = med_height / n;
        DecimalFormat decimalFormat = new DecimalFormat("0.00"); // faz com que o float mostre 2 numeros após a virugla
        System.out.println("A média das alturas é de : " + decimalFormat.format(med_height) + "m");
        System.out.println();
        //descobre quantas pessoas são < de 16 anos
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() < 16) {

                underage_percent++;
            }
        }
            underage_percent = (underage_percent / n) * 100;
            System.out.println("Pessoas com menos de 16 anos: " + decimalFormat.format(underage_percent) + "%");
        // percorre p array person e imprime o nome da posição que a age é menor que 16
            for (int i = 0; i < person.length; i++) {
                if (person[i].getAge() < 16) {
                    System.out.println(person[i].getName());

                }

        }
        System.out.println("Fim algoritmo");
    }

}

