package _1program.entites;

public class Pokemon {
    Specie specie;
    Type type;
    Type type2;
    String name;
    int lifePoints;
    boolean isLive = true;

    public Pokemon() {
    }

    public Pokemon(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public Specie getSpecie() {
        return specie;
    }

    public void setSpecie(Specie specie) {
        this.specie = specie;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType2() {
        return type2;
    }

    public void setType2(Type type2) {
        this.type2 = type2;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "specie=" + specie +
                ", type=" + type +
                ", type2=" + type2 +
                ", name='" + name + '\'' +
                ", lifePoints=" + lifePoints +
                ", lived=" + isLive +
                '}';
    }
}


