
var consoles = [
    {name:"Playstation 3", cost:149},
    {name:"Sega Genesis", cost:49},
    {name:"Playstation 4 Pro", cost:349},
    {name:"Super Nintendo", cost:39},
    {name:"Nintendo Switch", cost:249}
]

var consolesSub200 = consoles.filter(function(console){
    return console.cost > 200;
})

console.log(consolesSub200);