import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  // a. Increment handler
  const increment = () => {
    setCount(prev => prev + 1);
  };

  // b. Say Hello handler
  const sayHello = () => {
    console.log("Hello! This is a static message.");
  };

  // Function to call both
  const handleIncrement = () => {
    increment();
    sayHello();
  };

  // 2. Say Welcome with argument
  const sayMessage = (message) => {
    alert(message);
  };

  // 3. Synthetic event handler
  const handlePress = (e) => {
    console.log("Synthetic Event:", e);
    alert("I was clicked");
  };

  return (
    <div className="App" style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>📋 React Event Examples App</h1>

      <h2>1. Counter</h2>
      <p>Count: {count}</p>
      <button onClick={handleIncrement}>Increment</button>
      &nbsp;
      <button onClick={() => setCount(count - 1)}>Decrement</button>

      <h2>2. Say Welcome</h2>
      <button onClick={() => sayMessage("Welcome!")}>Say Welcome</button>

      <h2>3. Synthetic Event</h2>
      <button onClick={handlePress}>Click Me</button>

      <h2>4. Currency Convertor</h2>
      <CurrencyConvertor />
    </div>
  );
}

export default App;
