package _1program.entites;

public class Charmeleon extends Charmander {


    public Charmeleon(String name, int lifePoints) {
        super(name, lifePoints);
    }


    public Charmeleon() {
        super();
        this.lifePoints = getLifePoints() * 2;
        this.name = "Charmeleon";
        this.specie = Specie.CHARMELEON;
    }

    @Override
    public void Roar() {
        System.out.println("Charmeleon");
    }
}
