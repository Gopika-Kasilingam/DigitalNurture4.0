import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState(null);
  const conversionRate = 0.011; // 1 INR = 0.011 EUR (sample)

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!rupees || isNaN(rupees)) {
      alert("Please enter a valid number in rupees");
      return;
    }
    setEuro((parseFloat(rupees) * conversionRate).toFixed(2));
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Amount in ₹ Rupees: &nbsp;
        <input
          type="text"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        />
      </label>
      &nbsp;
      <button type="submit">Convert</button>

      {euro && (
        <p>
          <strong>Converted Amount:</strong> € {euro}
        </p>
      )}
    </form>
  );
}

export default CurrencyConvertor;
