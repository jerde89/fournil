<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>

	<title>Contact</title>
	<meta charset="UTF-8">
	<!-- Reference Bootstrap  -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
		<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark sticky-top" style="background-color:#522110" > 
  
    <div class="collapse navbar-collapse" id="navbarNav" >
      <ul class="navbar-nav">
      
      	<li class="nav-item">
      		<a class="navbar-brand" style="padding-top:5px" href="#">
      		<img src="${pageContext.request.contextPath}/image/logo.jpg" alt="logo" width="40" height="40" class="d-inline-block align-text-top">
    		</a>
      	</li>
      	
        <li class="nav-item">
          <a class="nav-link active" style="font-size:20px" aria-current="page" href="#">Accueil</a>
        </li>
        
        <li class="nav-item" >
          <a class="nav-link" style="font-size:20px" href="#">Nos produits</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" style="font-size:20px" href="#">Promotions</a>
        </li>
        
         <li class="nav-item">
          <a class="nav-link" style="font-size:20px" href="#">Commmande en ligne</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" style="font-size:20px" href="#">Contact</a>
        </li>
              
        
      </ul>
    </div>
</nav>


<div class="row">
      
      <div class="col-lg-4">
      <p style="text-align: center;">
        <img src="${pageContext.request.contextPath}/image/telephone.png" alt="téléphone" width="40" height="40" class="d-inline-block align-text-top" style="text-align:center;">
		</p>
        <h2 style="text-align:center;">069/69.69.69</h2>
      </div>
      
      
      <div class="col-lg-4">
      <p style="text-align: center;">
        <img src="${pageContext.request.contextPath}/image/arobase.png" alt="téléphone" width="40" height="40" class="d-inline-block align-text-top" style="text-align:center;">
		</p>
        <h2 style="text-align:center;">fournil@gmail.com</h2>
      </div>
      
      
      <div class="col-lg-4">
      <p style="text-align: center;">
        <img src="${pageContext.request.contextPath}/image/adresse.png" alt="téléphone" width="40" height="40" class="d-inline-block align-text-top" style="text-align:center;">
		</p>
        <h2 style="text-align:center;">Rue des gonceries 75</h2>
        <h2 style="text-align:center;">6032 Mont-sur-Marchienne</h2>
      </div>
      
    



<iframe  src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2543.821289952407!2d4.412185815894415!3d50.38852989970561!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c22434d4bdeb55%3A0xf080cae1174fe3e4!2sRue%20des%20Gonceries%2075%2C%206032%20Charleroi!5e0!3m2!1sfr!2sbe!4v1640184550634!5m2!1sfr!2sbe" width=100% height="350" style="border:0;" allowfullscreen="" loading="lazy"></iframe>


</div>

</body>
</html>