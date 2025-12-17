const mongoose = require("mongoose");

const ProductsSchema = new mongoose.Schema({
    title:{
        type : String
    },
    price:{
        type : Number
    },
    description:{
        type: String 
    }
})

module.exports = mongoose.model("Product",ProductsSchema)