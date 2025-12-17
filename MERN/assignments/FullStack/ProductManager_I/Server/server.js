require('dotenv').config();
const mongoose = require('mongoose');
const express = require("express")
const cors = require('cors')
const app = express()
app.use(cors())
const port = process.env.PORT;
require("./config/mongoose.config.js");
app.use( express.json() );
app.use( express.urlencoded({ extended: true }) );

const AllMyUserRoutes = require("./routes/product.routes.js");

AllMyUserRoutes(app);

app.listen(port, () => console.log('Listening on port 8000'));