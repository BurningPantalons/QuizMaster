$(function(){
    $('body').append('<button onclick="rolledDice()">ROLL DICE</button>');
    $('body').append(`<div class="question-container"><div class="question-content">
            <h1 style="color: white">${question}</h1>
            <div class="question-Btn-container">
            <button onclick="checkIfRight('${answer1}')">${answer1}</button>
            <button onclick="checkIfRight('${answer2}')">${answer2}</button>
            <button onclick="checkIfRight('${answer3}')">${answer3}</button>
            <button onclick="checkIfRight('${answer4}')">${answer4}</button>
            </div></div></div>`);
    $('body').append('<div class="tileContainer"></div>');
    tiles.forEach(function (tile) {
        $('.tileContainer').append(`                  
        <button class="tileBtn">${tile.position}</button>  
         `)
    });
});

$( document ).ready(function() {
    $(".tileBtn").on("click",function(){
        $(".question-container").toggle();
    });
});

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
