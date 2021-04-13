package se.Grupp2.Quizmaster.models;

public class Player {
    String name;
    String password;
    int position;

    public Player(String name, String password) {
        this.name = name;
        this.password = password;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
