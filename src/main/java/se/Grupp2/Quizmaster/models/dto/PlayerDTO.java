package se.Grupp2.Quizmaster.models.dto;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class PlayerDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;


    public PlayerDTO(Integer id, String name) {
        this.name = name;
        this.id = id;

    }
    public PlayerDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
