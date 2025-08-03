import React from 'react';

const flights = [
  { id: 1, airline: "Air India", from: "Delhi", to: "Mumbai", price: 6500 },
  { id: 2, airline: "IndiGo", from: "Chennai", to: "Bangalore", price: 3000 },
  { id: 3, airline: "Vistara", from: "Hyderabad", to: "Kolkata", price: 5500 }
];

function FlightList({ canBook = false }) {
  return (
    <div>
      <h3>Available Flights:</h3>
      <table border="1" cellPadding="10">
        <thead>
          <tr>
            <th>Airline</th>
            <th>From</th>
            <th>To</th>
            <th>Price (₹)</th>
            {canBook && <th>Action</th>}
          </tr>
        </thead>
        <tbody>
          {flights.map(flight => (
            <tr key={flight.id}>
              <td>{flight.airline}</td>
              <td>{flight.from}</td>
              <td>{flight.to}</td>
              <td>{flight.price}</td>
              {canBook && <td><button>Book Now</button></td>}
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default FlightList;
