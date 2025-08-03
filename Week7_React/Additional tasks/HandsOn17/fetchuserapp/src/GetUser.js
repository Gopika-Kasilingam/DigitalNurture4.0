import React, { Component } from 'react';
import './GetUser.css'; // optional for styling

class Getuser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      user: null
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch('https://api.randomuser.me/');
      const data = await response.json();
      const user = data.results[0];
      this.setState({ user });
    } catch (error) {
      console.error('Error fetching user:', error);
    }
  }

  render() {
    const { user } = this.state;

    return (
      <div className="user-container">
        <h2>Random User Information</h2>
        {user ? (
          <div className="user-card">
            <img src={user.picture.large} alt="User" />
            <h3>
              {user.name.title} {user.name.first}
            </h3>
          </div>
        ) : (
          <p>Loading user...</p>
        )}
      </div>
    );
  }
}

export default Getuser;
