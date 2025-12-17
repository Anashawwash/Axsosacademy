const productController = require("../controllers/Product.controller.js")


module.exports = app =>{
    app.get("/product",productController.getAllProducts);
    app.post("/product",productController.createProduct);
    app.get("/product/:id",productController.getProductById);
}