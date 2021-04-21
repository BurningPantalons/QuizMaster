$(function(){
    $('body').append('<button onclick="questionWindow()" id="quest" >ÖPPNA FRÅGA</button>');
    $('body').append('<button onclick="rolledDice()">ROLL DICE</button>');
    $('body').append('<div class="tileContainer"></div>');
    tiles.forEach(function (tile) {
        $('.tileContainer').append(`                  
        <button onclick="questionWindow()">${tile.position}</button>  
         `)
    });
});

function questionWindow() {
    $('body').prepend(`<div class="question-container">
            <h1 class="question">${question}</h1>
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

function rolledDice() {
    alert(dice)
    location.reload()
}
