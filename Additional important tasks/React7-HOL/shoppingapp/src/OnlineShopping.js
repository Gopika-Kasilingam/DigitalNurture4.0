// src/OnlineShopping.js
import React from 'react';
import Cart from './Cart';

class OnlineShopping extends React.Component {
  constructor(props) {
    super(props);

    // Step 2: Initialize 5 cart items
    this.state = {
      cartItems: [
        { itemname: "Smartphone", price: 14999 },
        { itemname: "Bluetooth Speaker", price: 2999 },
        { itemname: "Laptop", price: 59999 },
        { itemname: "Wireless Mouse", price: 499 },
        { itemname: "Smartwatch", price: 3999 }
      ]
    };
  }

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h1>Online Shopping Cart</h1>

        {/* Step 3: Loop and render Cart components */}
        {this.state.cartItems.map((item, index) => (
          <Cart key={index} itemname={item.itemname} price={item.price} />
        ))}
      </div>
    );
  }
}

export default OnlineShopping;
