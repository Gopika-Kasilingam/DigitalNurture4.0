// src/Components/CalculateScore.js
import React, { useState } from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const [marks, setMarks] = useState('');
  const [grade, setGrade] = useState('');

  const calculateGrade = () => {
    const score = parseInt(marks);
    if (isNaN(score)) {
      setGrade("Please enter a valid number");
    } else if (score >= 90) {
      setGrade("A");
    } else if (score >= 80) {
      setGrade("B");
    } else if (score >= 70) {
      setGrade("C");
    } else if (score >= 60) {
      setGrade("D");
    } else {
      setGrade("F");
    }
  };

  return (
    <div className="container">
      <h2>Score Calculator</h2>
      <input
        type="number"
        placeholder="Enter your score"
        value={marks}
        onChange={(e) => setMarks(e.target.value)}
      />
      <button onClick={calculateGrade}>Calculate Grade</button>
      {grade && <h3>Your Grade: {grade}</h3>}
    </div>
  );
}

export default CalculateScore;
