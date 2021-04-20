window.onload = startScreen()


function startScreen(){
    $('main').empty();
    $('main').append(`<div class="container"></div`);
    $('.container').append(`
       <div class="menuContainer">
            <div class="menuOptions">
                <button class="myBtn" onclick="location.href = '/create-game';" type="button">CREATE GAME</button>
                <button class="myBtn" type="button">SETTINGS</button>
                <button class="myBtn" type="button">MY PROFILE</button>
                <button class="myBtn" type="button">QUIT</button>
            </div>
        </div>`)
}




