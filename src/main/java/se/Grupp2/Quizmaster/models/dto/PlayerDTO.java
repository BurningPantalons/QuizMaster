package se.Grupp2.Quizmaster.models.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "players")
public class PlayerDTO {

    @Id
    private String userName;

    private String password;

    public PlayerDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public PlayerDTO() {
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
}
