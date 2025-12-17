const mongoose = require("mongoose");

const AuthorShema = new mongoose.Schema({
    name:{
        type: String,
        minLength:[3,"this should be at lest 3 char"]
    }

})

module.exports = mongoose.model("Author",AuthorShema)