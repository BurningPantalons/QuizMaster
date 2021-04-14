package se.Grupp2.Quizmaster.services;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import se.Grupp2.Quizmaster.models.Question;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    RestTemplate restTemplate;

    public Question getQuestion() throws JSONException {
        String questions = null;
        List<String> answers = new ArrayList<>();
        String correctAnswer = null;

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        String result = restTemplate.exchange("https://opentdb.com/api.php?amount=1&difficulty=easy&type=multiple",
                HttpMethod.GET, entity, String.class, StandardCharsets.UTF_8).getBody();

        JSONObject jObj = new JSONObject(result);
        JSONArray jArray = jObj.getJSONArray("results");

        for (int i = 0; i < jArray.length(); i++) {
            JSONObject obj = jArray.getJSONObject(i);
            questions = convertString(obj.getString("question"));
            correctAnswer = convertString(obj.getString("correct_answer"));
            answers.add(convertString(obj.getString("correct_answer")));

            JSONArray incorrectAnswers = obj.getJSONArray("incorrect_answers");
            for (int j = 0; j < incorrectAnswers.length(); j++) {
                answers.add(convertString(incorrectAnswers.getString(j)));
            }
        }
        Collections.shuffle(answers);
        return new Question(questions, answers, correctAnswer);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    private String convertString(String string){
        return string.replace("&#039;", "'")
                .replace("&quot;", "\"")
                .replace("&ldquo;", "“")
                .replace("&rdquo;", "”")
                .replace("&iacute;","í");
    }
}
