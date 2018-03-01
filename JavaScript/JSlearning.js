"use strict";

var comp = function(){
  var x = (Math.random() * 100) % 3;
  return (x);
}
var human = function(){
  var x = promt("Enter 1, 2, or 3");
  return x;
}

var check = function(comp, human){
    if(comp > human){
      console.log("");
    }
    if(comp === human){
      console.log("It's a tie");
    }
    if(human < comp){
      console.log("comp wins");
    }

}

var reply = "no";

while(prompt("done?", ) = "no"){
  var comp = comp();
  var human = human();
  var check  = check(comp, human);
  reply = prompt("done?");
}


const printf = (thingy, next) => {
  console.log(thingy);
  next();
}

printf("WHAT UP, NAGA E MERU HANU HE", () => {
  console.log("Done");
});
