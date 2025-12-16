const mongoose = require('mongoose');
require('dotenv').config();
const password = process.env.PASSWORD;
const db_name = process.env.DB;
const db_User = process.env.USERNAME;

const uri = `mongodb+srv://${db_User}:${password}@testc.hrnc0an.mongodb.net/${db_name}?appName=TestC`
mongoose.connect(uri).then(() => {
    console.log(" MongoDB connected successfully");
  })
  .catch(err => {
    console.log(" MongoDB connection error:");
    console.log(err);
  });
