package se.Grupp2.Quizmaster.controller;


import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import se.Grupp2.Quizmaster.services.QuestionService;

@Controller
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @RequestMapping("/game/question")
    public String putQuestion(Model model) throws JSONException {
        model.addAttribute("question", questionService.getQuestion());
        return "question";
    }
}
