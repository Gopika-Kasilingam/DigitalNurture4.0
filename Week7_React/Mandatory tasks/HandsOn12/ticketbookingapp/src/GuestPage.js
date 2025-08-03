import React from 'react';
import FlightList from './FlightList';

function GuestPage() {
  return (
    <div>
      <h2>Welcome Guest!</h2>
      <p>Please login to book your tickets.</p>
      <FlightList />
    </div>
  );
}

export default GuestPage;
