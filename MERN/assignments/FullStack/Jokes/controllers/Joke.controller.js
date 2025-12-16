const Joke = require('../models/jokes.model.js')

module.exports.findAllJokes =(req,res) =>{
    Joke.find()
    .then(data => {
        res.json(data)
    })
    .catch(()=>{
        res.json({err:"we have error "})
    })
}

module.exports.createJoke = (req , res) =>{
    const newJoke = req.body;
    console.log(newJoke);
    Joke.create(newJoke)
    .then((data)=>{
        res.json({Joke: data})
    })
    .catch((err)=>{
        res.json(err)
    })
}

module.exports.getJokeById = (req,res)=>{
    Joke.findOne({_id:req.params.id})
    .then(data =>{
        console.log(data)
        res.json(data)
    })
    .catch(err =>{
        res.json(err)
    })
}

module.exports.deleteJokeById = (req , res) =>{

    Joke.findByIdAndDelete({_id :req.params.id})
      .then(data =>{
        res.json({good : "the Joke has been deleted "})
    })
    .catch(err =>{
        res.json(err)
    })
}

module.exports.updateJoke = (req,res) =>{
    Joke.updateOne({_id:req.params.id},{data : req.body})
    .then(data =>{
        res.json({
            good:"done",
            Data : data
        })
    })
    .catch(err =>{
        res.json(err)
    })
}