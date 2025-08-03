// src/ComplaintRegister.js
import React, { useState } from 'react';

function ComplaintRegister() {
  const [employeeName, setEmployeeName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!employeeName || !complaint) {
      alert("Please fill in both fields before submitting.");
      return;
    }

    // Generate a random reference number
    const referenceNumber = 'REF' + Math.floor(100000 + Math.random() * 900000);

    alert(`Complaint submitted successfully!\nReference Number: ${referenceNumber}`);

    // Reset form fields
    setEmployeeName('');
    setComplaint('');
  };

  return (
    <div className="complaint-form" style={{ padding: '20px' }}>
      <h2>Raise a Complaint</h2>
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: '10px' }}>
          <label>Employee Name:</label><br />
          <input
            type="text"
            value={employeeName}
            onChange={(e) => setEmployeeName(e.target.value)}
            placeholder="Enter your name"
            required
          />
        </div>

        <div style={{ marginBottom: '10px' }}>
          <label>Complaint:</label><br />
          <textarea
            value={complaint}
            onChange={(e) => setComplaint(e.target.value)}
            placeholder="Enter your complaint"
            required
            rows="4"
            cols="40"
          />
        </div>

        <button type="submit">Submit Complaint</button>
      </form>
    </div>
  );
}

export default ComplaintRegister;
