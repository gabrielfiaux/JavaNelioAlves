package _1program.entites;

public class Charmander extends Pokemon {
    public Charmander(String name, int lifePoints) {
        super(name, lifePoints);
        this.specie = Specie.CHARMANDER;
        this.type = Type.FIRE;
    }
}
