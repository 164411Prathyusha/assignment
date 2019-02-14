<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.thumbnail {
        background-color:black;
      padding: 0 0 15px 0;
      border: none;
      border-radius: 0;
  }
  .thumbnail p {
      margin-top: 15px;
      color: #555;
  }
   .item{
  padding-top: 50px;
  }
</style>
</head>
<body>


 <div class="item">
<img src="AboutUs.jpg" alt="" width="800" height="100" align="left"> </div><br><br>
<div class="col-sm-4">
     <div class="thumbnail bgcolor">
      <p class="text-center"><strong>CONNECT</strong></p><br>
      <a href="#demo3" >
        <img src="connect.png" alt="" width="100" height="50" > 
      </a>     
        <p>With best in industry practices, we provide out of box connections for Ecommerce Businesses.</p>  
    </div>
    </div>                      

 
 
<div class="col-sm-4">
     <div class="thumbnail bgcolor">
      <p class="text-center"><strong>INTEGRATE</strong></p><br>
      <a href="#demo3" >
        <img src="integrate.png" alt="" width="100" height="40" > 
      </a>     
        <p>Bridging the gap between online and offline, we strive to bring a smarter approach to Integration.</p>  
    </div>
    </div>                      
<div class="col-sm-4">
     <div class="thumbnail bgcolor">
      <p class="text-center"><strong>AUTOMATE</strong></p><br>
      <a href="#demo3" >
        <img src="automate.png" alt="" width="100" height="50" > 
      </a>     
        <p>Real time data exchange across applications to amplify the growth trajectory of your business.</p>  
    </div>
    </div>                      

 <br><br><br><br>

                        
<jsp:include page="footer.jsp"/>
</body>
</html>