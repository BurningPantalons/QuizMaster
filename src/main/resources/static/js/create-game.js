$(function () {

        $('main').append(`<div class="loginContainer">
            <div class="newUserForm">
                <form>
                    <input type="text" id="name" placeholder="Enter username">  
                </form>
            </div>
            <div class="newUserButton">
                <button onclick="savePlayer()">ADD</button>
            </div>
        </div>`);


    function showPlayers(player) {
        $('.player-table').append(`<tr>
                                    <td><span>${player.name}</span></td>
                                    <td><input id="${player.id}" type="text"></td>
                                    <td><button onclick="changeName(${player.id})">Change name</button></td>
                                    <td><button onclick="deletePlayer(${player.id})" >Delete</button></td>
                                   </tr>`
        );
    }
        $.ajax({
            type: 'GET',
            url: '/players',
            success: function (players) {
                console.log('success', players);
                $.each(players, function (i, player) {
                    showPlayers(player);
                });
            },
            error: function () {
                alert('Error');
            }
        });
});

function savePlayer() {

    let player = {
        name: $('#name').val(),
    };

    $.ajax({
        type: 'POST',
        url: 'players',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        data: JSON.stringify(player),
        success: function () {
        location.reload();
        },
        error: function () {
            alert('Error!');
        }
    });
}

function changeName(value) {

    let newPlayer = {
        name: $(`#${value}`).val(),
    };

    $.ajax({
        type: 'PUT',
        url: 'players/' + value,
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        data: JSON.stringify(newPlayer),
        success: function () {
            location.reload();
        },
        error: function () {
            alert('Error!');
        }
    });
}


function deletePlayer(value){

    $.ajax({
        type: 'DELETE',
        url: 'players/' + value,
        success: function () {
            location.reload();
        },
    });
}