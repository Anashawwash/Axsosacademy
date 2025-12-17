const ObjectController = require("../controllers/Object.controller")

module.exports = app =>{
    app.get("/author",ObjectController.getAllObjects);
}