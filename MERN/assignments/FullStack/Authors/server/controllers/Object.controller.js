const Object  = require("../models/Author.js")

module.exports.createObject = (req,res)=>{
    const newPro = req.body
    Object.create(newPro)
    .then(data =>{
        res.json({text:"this new Author has bean created",
            data :data
         })
    }).catch(err => {
        res.json(err)
    })
}

module.exports.getAllObjects = (req,res)=>{
    Object.find()
    .then(data =>{
        res.json(data)
    })
    .catch(err => {
        res.json(err)
    })
}

module.exports.getObjectById = async (req,res)=>{
    try{
        const Obj = await Object.findById(req.params.id)
        res.json(Obj)
    }catch(err){
        res.json({
            err
        })
    }
}