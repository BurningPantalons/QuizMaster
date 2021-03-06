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

        $('.createGameContainer').append(`<table>
                                            <thead>
                                            <tr>
                                                <th>Player name</th>
                                                <th>Change name</th>
                                                <th>Remove player</th>
                                            </tr>
                                            </thead>
                                            <tbody class="tableBody"></tbody>
                                            </table>`)
        $('.createGameContainer').append(`<div><button onclick="location.href = '/game';">Start game</button></div>`)

    function showPlayers(player) {
        $('.tableBody').append(`<tr>
                                    <td class="hide${player.id}"><span>${player.name}</span></td>
                                    <td style="display:none" class="show${player.id}"><input id="${player.id}" type="text"></td>
                                    <td style="display:none;" class="show${player.id}"><button class="Btn" onclick="changeName(${player.id})">Save</button></td>
                                    <td class="hide${player.id}"><button class="Btn" onclick="$('.show${player.id}').show();$('.hide${player.id}').hide();">Change</button></td>
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