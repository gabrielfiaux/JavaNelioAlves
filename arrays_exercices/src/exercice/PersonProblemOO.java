package exercice;

import exercice.model.Person;

import java.util.Scanner;

public class PersonProblemOO {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float mediumHeight = 0;
        int less16YearsCounter = 0;
        float less16YearsPercent = 0;
        Person[] vect;

        System.out.println("type the quantity of people: ");
        vect = new Person[scanner.nextInt()];

        for (int i = 0; i < vect.length; i++) {
            String name;
            int age;
            float height;

            System.out.println("type name: ");
            name = scanner.next();
            System.out.println("Type age: ");
            age = scanner.nextInt();
            System.out.println("Type height: ");
            height = scanner.nextFloat();

            vect[i] = new Person(name, age, height);

            mediumHeight += vect[i].getHeight();

            if (vect[i].getAge() <= 16) {
                less16YearsCounter += vect[i].getAge();
            }

        }// for
        //percorre e mostra oque tem dentro de vect
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        // mostra a altura media das pessoas
        System.out.printf("The medium height of the people is : %.2f%n", mediumHeight / (vect.length));
        //mostra o nome das pessoas com 16 anos ou menos com o percentual.
        less16YearsPercent = ((float) less16YearsCounter / vect.length) * 100;
        System.out.printf("People with less 16 years old: %.2f%s %n", less16YearsPercent, "%");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() <= 16) {
                System.out.println(vect[i].getName() + " " + vect[i].getAge());
            }
        }
    }
}
