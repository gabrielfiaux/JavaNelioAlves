package _1program.View;

import _1program.entites.Charmander;
import _1program.entites.Pokemon;

public class Main {
    static void main(String[] args) {
        Pokemon charmander1 = new Charmander("Zé", 15);
        System.out.println(charmander1.toString());
        System.out.println(charmander1.getLifePoints());
    }
}
