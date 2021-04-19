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
                            <td><span>${player.name}</span><button onclick="editPlayerName()">Change name</button>
                           <button onclick="deletePlayer(value)" value="${player.name}">Delete</button></td>
                            
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

function deletePlayer(value){



    $.ajax({
        type: 'DELETE',
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