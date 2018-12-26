var express = require('express');
var app = express();

app.use(express.static('public'));


var server = app.listen(3002, function () {
   var host = server.address().address
   var port = server.address().port

   console.log("server running", host, port)
});