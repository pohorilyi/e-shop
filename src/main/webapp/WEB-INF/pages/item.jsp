<%@ page import="java.util.Enumeration" %>
<%@ page import="com.bobbbaich.model.ProductType" %><%--
  Created by IntelliJ IDEA.
  User: Богдан
  Date: 16.01.2016
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>MANTO</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <style>
        /* Remove the navbar's default rounded borders and increase the bottom margin */
        .navbar {
            margin-bottom: 50px;
            border-radius: 0;
        }

        /* Remove the jumbotron's default bottom margin */
        .jumbotron {
            margin-top: 20px;
            margin-bottom: 20px;
            padding-bottom: 0;
            padding-top: 0;
        }

        /* Add a gray background color and some padding to the footer */
        footer {
            background-color: #f2f2f2;
            padding: 25px;
        }
    </style>
</head>
<body>


<div class="jumbotron">
    <div class="container text-left">
        <h1>MANTO</h1>
        <p>by athletes for athletes</p>
    </div>
</div>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse btn-group" id="myNavbar">
            <ul class="nav navbar-nav">
                <li><a href="/home">Home</a></li>
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="/products">Products<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/products/gi">Gi</a></li>
                        <li><a href="/products/ammunition">Ammunition</a></li>
                        <li><a href="/products/cap">Cap</a></li>
                        <li><a href="/products/rashgard">Rashgard</a></li>
                        <li><a href="/products/t_shirt  ">T-Shirt</a></li>
                        <li><a href="/products/#">All categories</a></li>
                    </ul>
                </li>
                <li><a href="#">Deals</a></li>
                <li><a href="#">Stores</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <div class="row">
        <div class="col-sm-4">
            <div class="panel-heading">${item.name}</div>
            <div class="panel-body"><img src=${item.pictureUrl} class="img-responsive" style="width:100%" alt="Image"></div>
            <div class="panel-footer">Cost: ${item.cost}</div>
        </div>
    </div>
</div>


<footer class="container-fluid text-center">
    <p>Online Store Copyright</p>
    <form class="form-inline">Get deals:
        <input type="email" class="form-control" size="50" placeholder="Email Address">
        <button type="button" class="btn btn-danger">Sign Up</button>
    </form>
</footer>

</body>
</html>





