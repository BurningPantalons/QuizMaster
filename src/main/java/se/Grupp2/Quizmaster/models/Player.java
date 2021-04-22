package se.Grupp2.Quizmaster.models;

public class Player {
    String name;
    Integer id;
    int position;

    public Player(Integer id, String name) {
        this.name = name;
        this.id = id;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override public String toString() {
        return "name = " + name + " id = " + id ;
    }
}
