// src/TrainersMock.js
import Trainer from './trainer';

const trainers = [
  new Trainer(1, "John Doe", "john@example.com", "9876543210", "Java", ["Spring", "Hibernate"]),
  new Trainer(2, "Jane Smith", "jane@example.com", "9123456780", "Python", ["Django", "Flask"]),
  new Trainer(3, "Ravi Kumar", "ravi@example.com", "9988776655", "JavaScript", ["React", "Node.js"]),
];

export default trainers;
