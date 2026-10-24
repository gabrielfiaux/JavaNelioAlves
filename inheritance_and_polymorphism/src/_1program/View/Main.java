package _1program.View;

import _1program.entites.Charizard;
import _1program.entites.Charmander;
import _1program.entites.Charmeleon;
import _1program.entites.Pokemon;

public class Main {
    static void main(String[] args) {
        Pokemon c = new Charmander();
        Pokemon c1 = new Charmeleon();
        Pokemon c2 = new Charizard();
        System.out.println(c);
        c.Roar();
        System.out.println(c1);
        c1.Roar();
        System.out.println(c2);
        c2.Roar();

    }
}
