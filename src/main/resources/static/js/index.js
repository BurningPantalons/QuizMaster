/*Ska ta hand om:
* Klick-event för menyknappar
* pop-up ruta för inlogg
* funktion som kallar på dao-controller till log-in uppgifter
* */
window.onload = startScreen()


function startScreen(){
    $('main').empty();
    $('main').append(`<div class="container"></div`);
    $('.container').append(`
       <div class="menuContainer">
            <div class="menuOptions">
                <button onclick="location.href = '/create-game';" type="button" class="newGame">CREATE GAME</button>
                <button type="button" class="settings">SETTINGS</button>
                <button type="button" class="myProfile">MY PROFILE</button>
                <button type="button" class="quitGame">QUIT</button>
            </div>
        </div>`)
}




