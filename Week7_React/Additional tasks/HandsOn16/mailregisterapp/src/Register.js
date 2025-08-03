// src/Register.js
import React, { useState } from 'react';
import './App.css'; // Import CSS styling

function Register() {
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    password: ''
  });

  const [errors, setErrors] = useState({});

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });

    // Field-level validation
    validateField(name, value);
  };

  const validateField = (name, value) => {
    let errorMsg = '';

    if (name === 'name' && value.length < 5) {
      errorMsg = 'Name must be at least 5 characters long.';
    }

    if (name === 'email' && (!value.includes('@') || !value.includes('.'))) {
      errorMsg = 'Email must contain "@" and "."';
    }

    if (name === 'password' && value.length < 8) {
      errorMsg = 'Password must be at least 8 characters long.';
    }

    setErrors((prev) => ({ ...prev, [name]: errorMsg }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    const newErrors = {
      name: formData.name.length >= 5 ? '' : 'Name must be at least 5 characters long.',
      email:
        formData.email.includes('@') && formData.email.includes('.')
          ? ''
          : 'Email must contain "@" and "."',
      password:
        formData.password.length >= 8 ? '' : 'Password must be at least 8 characters long.'
    };

    setErrors(newErrors);

    const hasErrors = Object.values(newErrors).some((err) => err !== '');
    if (!hasErrors) {
      alert('Registration Successful!');
      setFormData({ name: '', email: '', password: '' });
    }
  };

  return (
    <div className="register-container">
      <form onSubmit={handleSubmit} className="register-form">
        <h2>Mail Registration</h2>

        <div className="form-group">
          <label>Name</label>
          <input
            type="text"
            name="name"
            value={formData.name}
            onChange={handleChange}
            placeholder="Enter your full name"
          />
          {errors.name && <span className="error">{errors.name}</span>}
        </div>

        <div className="form-group">
          <label>Email</label>
          <input
            type="email"
            name="email"
            value={formData.email}
            onChange={handleChange}
            placeholder="you@example.com"
          />
          {errors.email && <span className="error">{errors.email}</span>}
        </div>

        <div className="form-group">
          <label>Password</label>
          <input
            type="password"
            name="password"
            value={formData.password}
            onChange={handleChange}
            placeholder="Minimum 8 characters"
          />
          {errors.password && <span className="error">{errors.password}</span>}
        </div>

        <button type="submit" className="submit-btn">Register</button>
      </form>
    </div>
  );
}

export default Register;
