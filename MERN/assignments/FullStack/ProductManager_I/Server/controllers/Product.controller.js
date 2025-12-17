const Product  = require("../models/product.js")

module.exports.createProduct = (req,res)=>{
    const newPro = req.body
    Product.create(newPro)
    .then(data =>{
        res.json({text:"this new product has bean created",
            data :data
         })
    }).catch(err => {
        res.json(err)
    })
}

module.exports.getAllProducts = (req,res)=>{

    Product.find().then(data =>{
        res.json(data)
    })
    .catch(err => {
        res.json(err)
    })
}