var express = require('express');
var app = express();


app.get('/year', function (req, res){
   
  
   var year=2018-req.query.age;
      res.send("you were born in " +year);
   });

var server = app.listen(8085, function () {
    console.log("server running");
   
});