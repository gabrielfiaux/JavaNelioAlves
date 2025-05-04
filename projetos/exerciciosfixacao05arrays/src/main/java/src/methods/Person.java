package src.methods;

public class Person {
    String name;
    int age;
    float height;

    public Person() {
        this.name = "";
        this.height = 0f;
        this.age = 0;
    }

    public Person(String name, float height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public void showPerson(Person[] person, int i){
        String person_name = person[i].getName();
        int person_age = person[i].getAge();
        float person_height = person[i].getHeight();
        System.out.println("Nome: "+person_name);
        System.out.println("Idade: "+person_age+" anos");
        System.out.println("Altura: "+person_height+"m");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
