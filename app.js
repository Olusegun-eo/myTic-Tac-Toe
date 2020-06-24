const statusDiv = document.querySelector('.status');
const resetDiv = document.querySelector('.reset');
const cellDivs = document.querySelectorAll('.game-cell');

//GAME SYMBOLS: note-> these are symbols not real alphabets
const xSymbol = '×';
const oSymbol = '○';

let gameIsLive = true; 
let xIsNext = true; 
//let winner = null;

//functions
const letterToSymbol = (letter) => letter === 'x' ? xSymbol : oSymbol;

const handleWin = (letter) => {
  gameIsLive = false;
  //winner = letter;

  return (letter === 'x') ? statusDiv.innerHTML = `${letterToSymbol(letter)} has Won!` : statusDiv.innerHTML = `<span>${letterToSymbol(letter)} has Won!</span>`
}

const checkGameStatus = () =>{
  const topLeft = cellDivs[0].classList[1]
  const topMiddle = cellDivs[1].classList[1];
  const topRight = cellDivs[2].classList[1];
  const middleLeft = cellDivs[3].classList[1];
  const middleMiddle = cellDivs[4].classList[1];
  const middleRight = cellDivs[5].classList[1];
  const bottomLeft = cellDivs[6].classList[1];
  const bottomMiddle = cellDivs[7].classList[1];
  const bottomRight = cellDivs[8].classList[1];

  //check the Winner
  if(topLeft && topLeft === topMiddle && topLeft === topRight) {
    handleWin(topLeft);
    cellDivs[0].classList.add('won');
    cellDivs[1].classList.add('won');
    cellDivs[2].classList.add('won');
  }  else if (middleLeft && middleLeft === middleMiddle && middleLeft === middleRight) {
    handleWin(middleLeft);
    cellDivs[3].classList.add('won');
    cellDivs[4].classList.add('won');
    cellDivs[5].classList.add('won');
  } else if (bottomLeft && bottomLeft === bottomMiddle && bottomLeft === bottomRight) {
    handleWin(bottomRight);
    cellDivs[6].classList.add('won');
    cellDivs[7].classList.add('won');
    cellDivs[8].classList.add('won');
    //the end of 1st 3 Horizontal 1st logic Case
  }
  // 2nd 3Horizontal 2nd Case
  else if (topLeft&& topLeft === middleLeft && topLeft === bottomLeft) {
    handleWin(topLeft);
    cellDivs[0].classList.add('won');
    cellDivs[3].classList.add('won');
    cellDivs[6].classList.add('won');
  } else if (topMiddle && topMiddle === middleMiddle && topMiddle === bottomMiddle) {
    handleWin(topMiddle);
    cellDivs[1].classList.add('won');
    cellDivs[4].classList.add('won');
    cellDivs[7].classList.add('won');
  } else if (topRight && topRight === middleRight && topRight ===bottomRight) {
    handleWin(topRight);
    cellDivs[2].classList.add('won');
    cellDivs[5].classList.add('won');
    cellDivs[8].classList.add('won');
  }
  //  The two diagoal cases 3rdCase
  else if (topLeft && topLeft === middleMiddle && topLeft === bottomRight){
    handleWin(topLeft);
    cellDivs[0].classList.add('won');
    cellDivs[4].classList.add('won');
    cellDivs[8].classList.add('won');
  } else if (topRight && topRight === middleMiddle && topRight === bottomLeft) {
    handleWin(topRight);
    cellDivs[2].classList.add('won');
    cellDivs[4].classList.add('won');
    cellDivs[6].classList.add('won');
  }   else if (topLeft && topMiddle && topRight && middleLeft && middleMiddle && middleRight && bottomLeft && bottomMiddle && bottomRight) {
    gameIsLive = false;
    statusDiv.innerHTML = 'Game is tied'
  } else {
    xIsNext = !xIsNext;
    return (xIsNext) ? statusDiv.innerHTML = `${xSymbol} is next` : 
                   statusDiv.innerHTML = `<span>${oSymbol} is next</span>`
  }
};

  //Event Handlers  PART B
const handleRest = () =>{
xIsNext = true;
statusDiv.innerHTML = `${xSymbol} is next`;
//winner =  null;

for (const cellDiv of cellDivs) {
  cellDiv.classList.remove('x');
  cellDiv.classList.remove('o');
  cellDiv.classList.remove('won')
}
gameIsLive = true;
};

const handleCellClick = (e) => { 
const classList= e.target.classList;
//const location = classList[1];

if(!gameIsLive || classList[1] === 'x' || classList[1] === 'o') {
  return;
}

if(xIsNext) {
  classList.add('x');
  checkGameStatus();
  // xIsNext = !xIsNext; flip the logic
} else {
  classList.add('o');
  checkGameStatus();
 // xIsNext =!xIsNext; flip the logic
}

}


resetDiv.addEventListener('click', handleRest);

for (const cellDiv of cellDivs) {
cellDiv.addEventListener('click', handleCellClick);
}