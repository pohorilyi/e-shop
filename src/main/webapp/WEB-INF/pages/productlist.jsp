<%--
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

        .container {
            padding-right: 0;
            padding-left: 0;
        }

        .row {
            margin-right: 0;
            margin-left: 0;
        }

        /* Add a gray background color and some padding to the footer */

        .navbar-right {
            margin-right: 0;
        }
        footer {
            background-color: #f2f2f2;
            padding: 25px;
        }

        .btn-link{
            color: #333;
        }

        .panel-primary{
            border-color: gainsboro;
        }

        .panel-primary>.panel-heading {
            color: #fff;
            background-color: #f5f5f5;
            border-color: gainsboro;
        }

        .panel-body {
            padding: 5%;
        }

        .panel-footer {
            padding: 10px 20px;
        }

        .panel-menu{
            border-width: 0;
            margin-bottom: 0;
        }

        .panel-menu-header{
            background-color: gainsboro;
            padding-top: 5%;
            padding-bottom: 5%;
        }

        .footer{
            padding-right: 10%;
            padding-left: 10%;
        }
        .col-sm-9 {
            padding-right: 15px;
            padding-left: 5%;
        }

        h4{
            margin-top: 0px;
            margin-bottom: 0;
        }
        ul{
            list-style-type:none;
        }

    </style>
</head>
<body>


<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>



        <div class="collapse navbar-collapse btn-group" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Одежда<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/products/t_shirt">Футболки</a></li>
                        <li><a href="/products/hoody">Толстовки</a></li>
                        <li><a href="/products/longsleeve">Лонгсливы</a></li>
                        <li><a href="/products/pants">Штаны</a></li>
                        <li><a href="/products/jacket">Куртки</a></li>
                        <li><a href="/products/cap">Шапки</a></li>
                        <li><a href="/products/bag">Сумки</a></li>
                    </ul>
                </li>
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">На тренировку<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/products/gi">Ги для бжж</a></li>
                        <li><a href="/products/belt">Пояса</a></li>
                        <li><a href="/products/rashguard">Рашгарды</a></li>
                        <li><a href="/products/shorts">Шорты</a></li>
                        <li><a href="/products/leggings">Лосины</a></li>
                        <li><a href="/products/ammunition">Амуниция</a></li>
                    </ul>
                </li>
                <li><a href="/products/women">Женское</a></li>
                <li><a href="/products/accessory">Аксесуары</a></li>
                <li><a href="/products/discount">Скидки</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
            </ul>
        </div>
</nav>

<div class="container" style="margin-top: 7%;">
    <div class="row">
        <div class="row col-sm-2">
            <div class="panel panel-primary panel-menu">
                <div class="panel-body">
                    <div class="row panel-menu-header">
                        <div class="col-sm-9 ">
                            <h4>Категории</h4>
                        </div>
                        <div class="collapsed col-sm-3 glyphicon glyphicon-menu-down collapsed" data-toggle="collapse" data-target="#type"></div>
                    </div>
                    <div>
                        <ul style="list-style-type:none; padding-left: initial;" id="type" class="collapse in">
                            <li><span>Одежда</span></a>
                                <ul>
                                    <li><a class="btn-link" href="/products/t_shirt">Футболки</a></li>
                                    <li><a class="btn-link" href="/products/hoody">Толстовки</a></li>
                                    <li><a class="btn-link" href="/products/longsleeve">Лонгсливы</a></li>
                                    <li><a class="btn-link" href="/products/pants">Штаны</a></li>
                                    <li><a class="btn-link" href="/products/jacket">Куртки</a></li>
                                    <li><a class="btn-link" href="/products/cap">Шапки</a></li>
                                    <li><a class="btn-link" href="/products/bag">Сумки</a></li>
                                </ul>
                            </li>
                            <li><span>На тренировку</span></a>
                                <ul>
                                    <li><a class="btn-link" href="/products/gi">Ги для бжж</a></li>
                                    <li><a class="btn-link" href="/products/belt">Пояса</a></li>
                                    <li><a class="btn-link" href="/products/rashguard">Рашгарды</a></li>
                                    <li><a class="btn-link" href="/products/shorts">Шорты</a></li>
                                    <li><a class="btn-link" href="/products/leggings">Лосины</a></li>
                                    <li><a class="btn-link" href="/products/ammunition">Амуниция</a></li>
                                </ul>
                            </li>
                            <li><a class="btn-link" href="/products/women">Женское</a></li>
                            <li><a class="btn-link" href="/products/accessory">Аксесуары</a></li>
                            <li><a class="btn-link" href="/products/discount">Скидки</a></li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="panel panel-primary panel-menu">
                <div class="panel-body">
                    <div class="row panel-menu-header">
                        <div class="col-sm-9 ">
                            <h4>Размер</h4>
                        </div>
                        <div class="collapsed col-sm-3 glyphicon glyphicon-menu-down collapsed" data-toggle="collapse" data-target="#size"></div>
                    </div>
                    <div>
                        <ul style="list-style-type:none; padding-left: initial;" id="size" class="collapse in">
                            <c:forEach items="${sizes}" var="size">
                                <li>${size.toString()}</li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
            </div>

        </div>
        <div class="row col-sm-10">
            <c:forEach items="${productCards}" var="product">
                        <div class="col-sm-4">
                            <div class="panel panel-primary">
                                <div class="panel-heading"><a class="btn-link" href="/products/item/${product.id}">${product.name}</a></div>
                                <div class="panel-body"><img src="${product.picturesUrl.get(0)}" class="img-responsive" style="width:100%" alt="Image"></div>
                                <div class="panel-footer">
                                    <span>Cost: ${product.cost}</span>
                                    <span>Cost: ${product.description}</span>
                                    <span>Cost: ${product.productsCount}</span>
                                    <span>Cost: ${product.discount}</span>
                                </div>
                            </div>
                        </div>
            </c:forEach>
        </div>
    </div>
</div>
<footer class="container-fluid">
    <div class="container footer">
        <div class="row">
            <div class="col-sm-4">
                <img src="http://www.logotv.com/sitewide/images/LOGO_logo.jpg" alt="LOGO" width="140" height="140">
                <ul style="list-style-type:none; padding-left: initial;">
                    <li>Киев, ул. Янгеля</li>
                    <li>+38(097)-123-34-45</li>
                    <li>glavadan@mail.ru</li>
                </ul>
            </div>
            <div class="col-sm-4">
                <ul style="list-style-type:none">
                    <li><h4>Информация</h4></li>
                    <li>Контакты</li>
                    <li>О магазине</li>
                    <li>Доставка</li>
                    <li>Оплата</li>
                    <li>Возврат товара</li>
                    <li>Карта сайта</li>
                </ul>
            </div>
            <div class="col-sm-4">
                <form class="form-inline">Get deals:
                    <input type="email" class="form-control" size="30" placeholder="Email Address">
                    <button type="button" class="btn btn-danger">Sign Up</button>
                </form>
            </div>
        </div>
    </div>
</footer>

</body>
</html>



