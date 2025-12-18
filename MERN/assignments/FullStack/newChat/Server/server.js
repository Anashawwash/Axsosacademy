const express = require("express");

const app = express()

const port = process.env.PORT;

app.use( express.json() );
app.use( express.urlencoded({ extended: true }) );


const server = app.listen(port, () => console.log('Listening on port 8000'));

const io = require('socket.io')(server,{cors:true})

io.on("connnection" , Socket =>{
    console.log("Nice to meet you ,(shake hand)");
    Socket.emit("hello for our wrold !!!!")
    
    Socket.on("event",data=>{
        

    })



});