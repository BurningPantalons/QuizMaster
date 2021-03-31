package se.Grupp2.Quizmaster.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.Grupp2.Quizmaster.dao.BoardDAO;

@Service
public class BoardService {

    private final BoardDAO boardDAO;

    @Autowired
    public BoardService(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
    }








}
