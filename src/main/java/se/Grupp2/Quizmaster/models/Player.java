package se.Grupp2.Quizmaster.models;

public class Player {
    String userName;
    String password;
    int position;

    public Player(String userName, String password) {
        this.userName = userName;
        this.password = password;
        int position = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public void setPosition(int diceRoll) {
        position = this.position + diceRoll;
    }
}
