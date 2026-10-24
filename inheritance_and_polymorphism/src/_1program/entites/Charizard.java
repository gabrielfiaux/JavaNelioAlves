package _1program.entites;

public class Charizard extends Charmeleon{
    public Charizard() {
        super();
        this.lifePoints = getLifePoints()*2;
        this.type2 = Type.FLYING;
        this.name = "Charizard";
    }

    @Override
    public void Roar() {
        System.out.println("ROAAAAR");
    }
}
