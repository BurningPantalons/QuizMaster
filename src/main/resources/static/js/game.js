$(function init(){
    $('body').append('<button onclick="initTileArr()" id="arrLen" >Arraylängd</button>');

});

function initTileArr() {
    tileArr.forEach(function (tile) {
        let pos = tile.position
        let startFinish = tile.startfinishtile
        let question = tile.questiontile
        let buff = tile.hasbuff
        let debuff = tile.hasdebuff


    })


    function renderTiles() {
        $('body').append(`<div class="tile">                  
        <button value="${mackie}">${tile.hasBuff}</button>  
        </div>                                              
     `)
    }

}