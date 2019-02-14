<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product page</title>

<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;

}
.topnav {
  overflow: hidden;
  background-color:white;
   
}

.topnav a {
  float: left;
  color:  black;
  text-align: center;
  padding: 25px 16px;
  text-decoration: none;
  font-size: 17px;
  
}

.shop{
   text-align: center;
   font-family: 'Ubuntu',sans-serif;
   color: #8C55AA;
}
.image{
 float: left;
}
.image1{
 float: left;
}


.topnav a.active {
  background-color: white;
  color: black;
}
.topnav-right {
  float: right;

}
</style>
</head>
<body>
<header>
<div class="shop" >
 <h1> <i>Shop-Hub</i44></h1>
  </div>
</header>
<nav>
<div class="topnav"> 
  <img class="image" src="shopping-bags-market-isolated-icon-vector-11223623.jpg" alt="" width="75" height="75">
  <a class="active" href="#home">Home</a> 
  <a href="">Products</a>
  <a href="">About</a> 

   <div class="topnav-right">
   <a href="/signin">sign in </a>
   <img class="image1" src="images.png" alt="" width="75" height="75">
   <img class="image1" src="images1.png" alt="" width="75" height="75">
   
  
  </div>
  </nav>
</div>
<hr>
</header>


 <h1><font color="Brown"><center>  Men's Fashion</center></font></h1>
<center>
	<table height="100%" width="100%" >
		<tr>
			<td><image src="m1.jpeg" alt="Shirt" height=100 width=100></td>
			<td><a href="#">Shirt</a><br>Price:400<br></td>
			<td><input type="button" name="Add to cart" value="Add to cart"></td>
		</tr>
		<tr>
			<td><image src="m3.jpg" alt="Shoe" height=100 width=100></td>
			<td><a href="#">Nike Shoe</a><br>Price:3000<br></td>
			<td><input type="button" name="Add to cart" value="Add to cart"></td>
		</tr>
		<tr>
			<td><image src="m4.jpg" alt="adidas shoe" height=100 width=100></td>
			<td><a href="#">Adidas Shoe</a><br>Price:4000<br></td>
			<td><input type="button" name="Add to cart" value="Add to cart"></td>
		</tr>
				<tr>
			<td><image src="m5.jpg" alt=" pant" height=100 width=100></td>
			<td><a href="#">Pant</a><br>Price:2000<br></td>
			<td><input type="button" name="Add to cart" value="Add to cart"></td>
		</tr>
		
		

	</table>
	</center>
	<a href="ProductPage2.jsp">	<input type="button" name="next" value="Prev" align="left"></a>
<a href="ProductPage4.jsp">	<input type="button" name="next" value="Next" align="right"></a>

<footer><hr><img src="download.png" alt="footer"width="400" height="100"></footer>
</body>
</html>