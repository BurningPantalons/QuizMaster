package se.Grupp2.Quizmaster.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {

    private static int[] DB;

    public int[] getDB() {
        return DB;
    }


}
