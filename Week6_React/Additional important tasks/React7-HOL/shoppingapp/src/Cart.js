// src/Cart.js
import React from 'react';

class Cart extends React.Component {
  render() {
    const { itemname, price } = this.props;

    return (
      <div style={{
        border: '1px solid gray',
        margin: '10px',
        padding: '10px',
        width: '300px',
        borderRadius: '8px'
      }}>
        <h3>{itemname}</h3>
        <p>Price: ₹{price}</p>
      </div>
    );
  }
}

export default Cart;
