const express = require('express');
const app = express();
const port = 3000;

app.get('/add/:num1/:num2', (req, res) => {
  const result = parseFloat(req.params.num1) + parseFloat(req.params.num2);
  res.send(`Result: ${result}`);
});

app.get('/subtract/:num1/:num2', (req, res) => {
  const result = parseFloat(req.params.num1) - parseFloat(req.params.num2);
  res.send(`Result: ${result}`);
});

app.get('/multiply/:num1/:num2', (req, res) => {
  const result = parseFloat(req.params.num1) * parseFloat(req.params.num2);
  res.send(`Result: ${result}`);
});

app.get('/divide/:num1/:num2', (req, res) => {
  const result = parseFloat(req.params.num1) / parseFloat(req.params.num2);
  res.send(`Result: ${result}`);
});

app.get('/', (req, res) => {
  res.send('Welcome to the Calculator API. Please use /add, /subtract, /multiply, or /divide endpoints for calculations.');
});

app.listen(port, () => {
  console.log(`Calculator server listening at http://localhost:${port}`);
});
