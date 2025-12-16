const JokeContreoller = require("../controllers/Joke.controller.js")


module.exports = app => {
app.get( "/jokes" ,JokeContreoller.findAllJokes);
app.post("/jokes/create", JokeContreoller.createJoke);
app.get("/jokes/:id",JokeContreoller.getJokeById);
app.delete("/jokes/:id",JokeContreoller.deleteJokeById);
app.patch("/jokes/:id",JokeContreoller.updateJoke);
}