import React from 'react';

const IndianPlayers = () => {
  const allPlayers = ['Virat', 'Rohit', 'Dhoni', 'Pant', 'Jadeja', 'Bumrah', 'KL', 'Hardik'];

  // Destructuring Odd and Even Players
  const oddTeam = allPlayers.filter((_, index) => index % 2 === 0);
  const evenTeam = allPlayers.filter((_, index) => index % 2 !== 0);

  const T20players = ['Surya', 'Ishan', 'Deepak'];
  const RanjiTrophyPlayers = ['Pujara', 'Rahane', 'Karun Nair'];

  // Merge using ES6 spread operator
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((player, i) => <li key={i}>{player}</li>)}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((player, i) => <li key={i}>{player}</li>)}
      </ul>

      <h2>Merged T20 and Ranji Trophy Players</h2>
      <ul>
        {mergedPlayers.map((player, i) => <li key={i}>{player}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
