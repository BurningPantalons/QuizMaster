/*Ska ta hand om:
* Klick-event för menyknappar
* pop-up ruta för inlogg
* funktion som kallar på dao-controller till log-in uppgifter
* */
window.onload = logInWindow()
function logInWindow() {
    $('main').empty();
    $('main').append(`<div class="loginContainer">
    <div class="loginForm">
        <form>
            <input type="text" id="name" placeholder="Username">
            <input type="password" id="password" placeholder="Password">
        </form>
    </div>
    <div class="buttonsContainer">
        <button onclick="loginUser()">LOGIN</button>
        <button onclick="createUserWindow()">SIGN UP</button>
    </div>
</div>`);
}

function createUserWindow(){
    $('main').empty();
    $('main').append(`<div class="loginContainer">
    <div class="newUserForm">
        <form>
            <input type="text" id="name" placeholder="Enter username">
            <input type="password" id="password" placeholder="Enter password">
            <input type="email" id="email" placeholder="Enter email">
        </form>
    </div>
    <div class="newUserButton">
        <button onclick="savePlayer()">REGISTER</button>
        <button onclick="logInWindow()">BACK</button>
    </div>
    </div>`);
}

function startScreen(){
    $('main').empty();
    $('main').append(`
       <div class="menuContainer">
            <div class="menuOptions">
                <button onclick="location.href = '/game';" type="button" class="newGame">NEW GAME</button>
                <button type="button" class="settings">SETTINGS</button>
                <button type="button" class="myProfile">MY PROFILE</button>
                <button type="button" class="quitGame">QUIT</button>
            </div>
        </div>`)
}
function savePlayer() {

        let player = {
            username: $('#name').val(),
            password: $('#password').val(),
            email: $('#email').val(),
            role: ["user"]
        };

        $.ajax({
            type: 'POST',
            url: '/api/auth/signup',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            data: JSON.stringify(player),
            success: function () {
                alert('Registered');
            },
            error: function () {
                alert('Error!');
            }

        });
}
function loginUser() {

    let user = {
        username: $('#name').val(),
        password: $('#password').val()
    };

    $.ajax({
        type: 'POST',
        url: '/api/auth/signin',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        data: JSON.stringify(user),
        success: function () {
           startScreen();
        },
        error: function () {
            alert('Error!');
        }

    });
}

