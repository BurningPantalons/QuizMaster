$(function () {

        $('body').append(`<div class="createGameContainer"></div>`)
        $('.createGameContainer').append(`<div class="addPlayerContainer">
            <div>
                <form>
                    <input class="addInput" type="text" id="name" placeholder="Enter playername">  
                </form>
            </div>
            <div>
                <button class="Btn" onclick="savePlayer()">Add player</button>
            </div>
        </div>`);

        $('.createGameContainer').append(`<table class="player-table">
                                            <thead>
                                            <tr>
                                                <th>Player name</th>
                                                <th>Change name</th>
                                                <th>Remove player</th>
                                            </tr>
                                            </thead>
                                            </table>`)


    function showPlayers(player) {
        $('.player-table').append(`<tr>
                                    <td class="currentName"><span>${player.name}</span></td>
                                    <td class="inputName"><input id="${player.id}" type="text"></td>
                                    <td class="saveName"><button class="Btn" onclick="changeName(${player.id})">Save name</button></td>
                                    <td class="editName"><button class="Btn" onclick="$('.inputName').show();$('.saveName').show();$('.editName').hide();$('.currentName').hide();" >Change name</button></td>
                                    <td><button class="Btn" onclick="deletePlayer(${player.id})" >Delete</button></td>
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