var superHeroes = [["Batman", "Bruce Wayne"], ["Green Lantern", "Jon Stewart"]];


let secretIdentity = superHeroes.map(function(revealArray){
    return revealArray.join(" is ");
});

console.log(secretIdentity.join('\n'))