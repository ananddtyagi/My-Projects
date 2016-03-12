function func(){

  var userInput = document.input.choice.value;


  var CC = Math.floor((Math.random() * 3) + 1); //Rock = 1, Paper = 2, Scissors = 3

  if(CC === 1){
    alert("Rock");
  }
  if(CC === 2){
    alert("Paper");
  }
  if(CC === 3){
    alert("Scissors");
  }

  var uI;

  if(userInput.toUpperCase() === "ROCK"){
    uI = 1;
  } else if (userInput.toUpperCase() === "PAPER"){
    uI = 2;
  } else {
    uI = 3;
  }

  alert(uI);

  if((CC === 1 && uI === 2) || (CC === 2 && uI === 3) || (CC === 3 && uI === 1)){
    alert("User wins");
  } else if((CC === 1 && uI === 3) || (CC === 3 && uI === 2) || (CC === 2 && uI === 1)){
    alert("Computer wins");
  } else {
    alert("it's a tie");
  }
}
