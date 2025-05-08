package src.hotel;

public class Customer {
    int room;
    String name;
    String email;


    public Customer(int i){
        this.room = i;
        this.email = "none";
        this.name = "none";
    }

    public Customer(int room, String email, String name) {
        this.room = room;
        this.email = email;
        this.name = name;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
