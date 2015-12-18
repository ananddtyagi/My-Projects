"use strict";
var prompt = require('prompt');

class Animal {
  constructor(mass, height, color) {
    this.mass = mass;
    this.height = height;
    this.color = color;
    this.isAlive = true;
  }

  die(){
    this.isAlive = false;
  }

  grow(){
    this.mass += 23;
    this.height += 2;
  }
}

class Dog extends Animal{
  constructor(mass, height, color, breed) {
    super(mass, height, color);
    this.breed = breed;
  }

  bark(){
    console.log("tree");
  }
}

let notmydog = new Dog(2, 3, "sdf", "maltese");
console.log(notmydog);
notmydog.grow();
notmydog.bark();
console.log(notmydog);
notmydog.die();
console.log(notmydog);

var bro = new Animal(2, 3, "blue");
console.log(bro);
bro.grow();
console.log(bro);



//------------------------------------------------------------------------------


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
while(prompt("done?", "") === "no"){
var comp = comp();
var human = human();
var check  = check(comp, human);
reply = prompt("done?", "");
}
