const mongoose = require('mongoose');

const pw = process.env.PASSWORD;
const db_name = process.env.DB;
const User = process.env.USERNAME;

const uri = `mongodb+srv://${User}:${pw}@testc.hrnc0an.mongodb.net/${db_name}?appName=TestC`
mongoose.connect(uri).then(() => {
    console.log(" MongoDB connected successfully");
  })
  .catch(err => {
    console.log(" MongoDB connection error:");
    console.log(err);
  });
