$(function init(){
    $('body').append('<button onclick="questionWindow()" id="quest" >ÖPPNA FRÅGA</button>');

});

function questionWindow() {
    $('body').append(`<div class="question-container">
            <h1>${question}</h1>
            <button onclick="checkIfRight('${answer1}')">${answer1}</button>
            <button onclick="checkIfRight('${answer2}')">${answer2}</button>
            <button onclick="checkIfRight('${answer3}')">${answer3}</button>
            <button onclick="checkIfRight('${answer4}')">${answer4}</button>
            </div>`);
}

function checkIfRight(answer) {
    if (answer === correctAnswer){
        alert("CORRECT")
    } else {
        alert("WRONG")
    }
    location.reload()
}