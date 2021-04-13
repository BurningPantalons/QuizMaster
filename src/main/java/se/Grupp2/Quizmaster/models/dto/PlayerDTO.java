package se.Grupp2.Quizmaster.models.dto;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class PlayerDTO {

    @Id
    private String name;

    private String password;

    public PlayerDTO(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public PlayerDTO() {
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
}
