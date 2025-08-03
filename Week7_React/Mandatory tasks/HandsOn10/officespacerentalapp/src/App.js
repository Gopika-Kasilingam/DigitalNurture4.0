import React from 'react';
import './App.css';

function App() {
  // 1️⃣ JSX Heading Element
  const heading = <h1>🏢 Office Space Rental App</h1>;

  // 2️⃣ JSX Image Attribute
  const imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBB2tiLXFYmC95eCyn5NstzNq_tD3ZwpXJ2A&s"; // sample office image

  // 3️⃣ Object for single office
  const office = {
    name: "Skyline Office",
    rent: 75000,
    address: "5th Floor, Prestige Tower, Bangalore"
  };

  // 4️⃣ List of office objects
  const offices = [
    { name: "Skyline Office", rent: 75000, address: "Bangalore" },
    { name: "Elite Tower", rent: 50000, address: "Chennai" },
    { name: "Quantum Workhub", rent: 62000, address: "Hyderabad" },
    { name: "Urban Hive", rent: 45000, address: "Coimbatore" }
  ];

  // 5️⃣ JSX Return
  return (
    <div className="App">
      {heading}

      {/* Image */}
      <img
        src={imageUrl}
        alt="Office Space"
        style={{ width: "400px", borderRadius: "10px", marginBottom: "20px" }}
      />

      {/* Single Office Object */}
      <h2>Featured Office</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p><strong>Rent:</strong> ₹{office.rent}</p>
      <p><strong>Address:</strong> {office.address}</p>

      <h2>Available Office Spaces</h2>
      <ul>
        {offices.map((off, index) => (
          <li key={index} style={{ marginBottom: "10px" }}>
            <strong>{off.name}</strong> - 
            <span style={{ color: off.rent < 60000 ? 'red' : 'green', fontWeight: 'bold' }}> ₹{off.rent}</span> - 
            {off.address}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
