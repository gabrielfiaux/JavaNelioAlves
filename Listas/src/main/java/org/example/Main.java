package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();

        lista.add("a");
        lista.add("b");
        lista.add("Xc");

        lista.add("X");
        lista.add(0, "x");
        lista.add(1, "x");
        System.out.println("Index of x: " + lista.indexOf(0));

        for (String x : lista) {
            System.out.println(x);
        }

        List<String> resultado = lista
                .stream()
                .filter(x -> Character.toLowerCase(x.charAt(0)) == 'x')
                .collect(Collectors.toList());
        System.out.println("Result---");

        for (String x : resultado) {
            System.out.println(x);
        }
        System.out.println("Search");
        String name = lista.stream().filter(x -> x.charAt(0) == 'z').findFirst().orElse(null);
        System.out.println(name);

    }
}