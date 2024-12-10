let player1Score = 0;
let player2Score = 0;

document.getElementById('button').addEventListener('click', playRound);

function playRound() {
    const player1Choice = getRandomChoice();
    const player2Choice = getRandomChoice();

    document.getElementById('player1Choice').src = `assets/${player1Choice}.png`;
    document.getElementById('player2Choice').src = `assets/${player2Choice}.png`;

    const result = determineWinner(player1Choice, player2Choice);

    if (result === 'player1') {
        player1Score++;
    } else if (result === 'player2') {
        player2Score++;
    }

    updateScores();
}

function getRandomChoice() {
    const choices = ['rock', 'paper', 'scissors'];
    return choices[Math.floor(Math.random() * choices.length)];
}

function determineWinner(player1, player2) {
    if (player1 === player2) {
        return 'draw';
    } else if (
        (player1 === 'rock' && player2 === 'scissors') ||
        (player1 === 'paper' && player2 === 'rock') ||
        (player1 === 'scissors' && player2 === 'paper')
    ) {
        return 'player1';
    } else {
        return 'player2';
    }
}

function updateScores() {
    document.getElementById('player1Score').textContent = player1Score;
    document.getElementById('player2Score').textContent = player2Score;
}