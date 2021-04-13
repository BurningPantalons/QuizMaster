
function questionWindow() {
    $('body').append(`<div class="questionContainer">
    <div class="question">
        <h1 style="color: white"> Question: <span th:text="${question.getQuestion()}"></span></h1>
    </div>
   <div class="buttonsContainer">
        <button class="Answer1" onclick="chooseAnswer()">th:text="${question.getAnswers().get(0)}"</button>
        <button class="Answer2" onclick="chooseAnswer()">th:text="${question.getAnswers().get(1)}"</button>
        <button class="Answer3" onclick="chooseAnswer()">th:text="${question.getAnswers().get(2)}"</button>
        <button class="Answer4" onclick="chooseAnswer()">th:text="${question.getAnswers().get(3)}"</button>
    </div>
</div>`);
}

function chooseAnswer(answer){
 //här kollar vi att svaret är korrekt
}
