package _1program.entites;

public class Charmander extends Pokemon {

    public Charmander(String name, int lifePoints) {
        super(name, lifePoints);
        this.specie = Specie.CHARMANDER;
        this.type = Type.FIRE;
    }

    public Charmander() {
        this.lifePoints = 15;
        this.name = "Charmander";
        this.specie = Specie.CHARMANDER;
        this.type = Type.FIRE;
    }


    @Override
    public void Roar(){
        System.out.println("Char Char!");
    }
}
