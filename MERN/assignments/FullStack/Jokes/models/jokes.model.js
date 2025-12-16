const mongoose = require("mongoose");

const JokesSchema = new mongoose.Schema({
    setup: {
        type: String,
        required: [true, "Setup is required"],
        minLength: [10, "Setup must be at least 10 characters"]
    },
    punchline: {
        type: String,
        required: [true, "Punchline is required"],
        minLength: [3, "Punchline must be at least 3 characters"]
    }
});

module.exports = mongoose.model("Joke", JokesSchema);
