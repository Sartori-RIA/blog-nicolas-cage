<%--
  Created by IntelliJ IDEA.
  User: sartori
  Date: 08/04/17
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@tag description="Template principal" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="title"%>
<%@attribute name="isLoggedIn"%>

<html>
<head>
    <title>${title}</title>
    <base href="${pageContext.request.contextPath}/">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="icon" type="image/png" href="../../resources/assets/img/favicon.png" />

    <!-- CSS -->
    <link rel="stylesheet" href="../../resources/assets/css/application.css" />
    <link rel="stylesheet" href="../../resources/bower_components/materialize/dist/css/materialize.css"/>
    <link rel="stylesheet" href="../../resources/bower_components/wow/css/libs/animate.css"/>

    <%--ICONS--%>
    <link rel="stylesheet" href="../../resources/bower_components/Ionicons/css/ionicons.css"/>
    <link rel="stylesheet" href="../../resources/bower_components/font-awesome/css/font-awesome.css"/>
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"/>

</head>
<body>
<header>
    <div class="navbar-fixed">
        <nav>
            <div class="nav-wrapper brown darken-3">
                <a href="/" class="center brand-logo">Nicolas Cage is everywhere</a>
                <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="icones ion-android-menu"></i></a>
                <ul class="left hide-on-med-and-down">
                    <%@include file="./menu.jsp"%>
                </ul>

            </div>
        </nav>
    </div>
    <ul class="side-nav" id="mobile-demo">
        <%@include file="./menu.jsp"%>
    </ul>
</header>
<br/>
<main id="content" class="container">
    <div class="row">
        <div class=" hide-on-med-and-down col m3 l3 xl3">
            <div data-wow-delay="0.5s" class="wow slideInLeft">
                <img class="animated swing" src="resources/assets/img/1.png"><br>
            </div>
            <div data-wow-delay="0.5s" class=" wow slideInLeft">
                <img class="animated swing" src="resources/assets/img/2.png"><br>
            </div>
            <div data-wow-delay="0.5s" class=" wow slideInLeft">
                <img class="animated swing" src="resources/assets/img/4.png"><br>
            </div>
            <div data-wow-delay="0.5s" class=" wow slideInLeft">
                <img class="animated swing" src="resources/assets/img/3.png"><br>
            </div>
            <div data-wow-delay="0.5s" class=" wow slideInLeft">
                <img class="animated swing" src="resources/assets/img/5.png"><br>
            </div>
            <div data-wow-delay="0.5s" class=" wow slideInLeft">
                <img class="animated swing" src="resources/assets/img/6.png"><br>
            </div>
        </div>

        <div data-wow-delay="0.5s" class="col s12 m6 l6 xl6 wow slideInDown">
            <jsp:doBody />
        </div>

        <div class="hide-on-med-and-down col m3 l3 xl3">
            <div data-wow-delay="0.5s" class=" wow slideInRight">
                <img class="animated swing" src="resources/assets/img/15.png"><br>
            </div>
            <div data-wow-delay="0.5s" class=" wow slideInRight">
                <img class="animated swing" src="resources/assets/img/14.png"><br>
            </div>
            <div data-wow-delay="0.5s" class=" wow slideInRight">
                <img class="animated swing" src="resources/assets/img/13.png"><br>
            </div>
            <div data-wow-delay="0.5s" class=" wow slideInRight">
                <img class="animated swing" src="resources/assets/img/7.png"><br>
            </div>
            <div data-wow-delay="0.5s" class=" wow slideInRight">
                <img class="animated swing" src="resources/assets/img/11.png"><br>
            </div>
            <div data-wow-delay="0.5s" class=" wow slideInRight">
                <img class="animated swing" src="resources/assets/img/10.png"><br>
            </div>
        </div>
    </div>
</main>

<footer class="page-footer brown darken-3">
    <div class="container">
        <div class="row">
            <div class="col l6 s12">
                <h5 class="white-text">SARTORI</h5>
                <p class="grey-text text-lighten-4">Projeto desenvolvido para a primeira prova de Desenvolvimento Web 4</p>
            </div>
            <div class="col l4 offset-l2 s12">
                <h5 class="white-text">Ferramentas e Frameworks</h5>
                <ul>
                    <li><a class="grey-text text-lighten-3" >Intellij IDEA Ultimate</a></li>
                    <li><a class="grey-text text-lighten-3" >JSP</a></li>
                    <li><a class="grey-text text-lighten-3" >Materialize</a></li>
                    <li><a class="grey-text text-lighten-3" >WOWjs & Animate.css</a></li>
                    <li><a class="grey-text text-lighten-3" >Font Awesome & Ionicons</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="footer-copyright brown darken-2">
        <div class="container">
            © 2017 Copyright by Lucas A. R. Sartori
            <a class="grey-text text-lighten-4 right" href="https://www.linkedin.com/in/lucas-antonio-ramos-sartori-4a61b6116"><i class="icones ion-social-linkedin-outline"></i></a>
        </div>
    </div>
</footer>
<script type="application/javascript" src="../../resources/bower_components/jquery/dist/jquery.min.js"></script>
<script type="application/javascript" src="../../resources/bower_components/jquery-validation/dist/jquery.validate.min.js"></script>
<script type="application/javascript" src="../../resources/bower_components/materialize/dist/js/materialize.min.js"></script>
<script type="application/javascript" src="../../resources/bower_components/wow/dist/wow.min.js"></script>
<script type="application/javascript" src="../../resources/assets/js/common.js"></script>
</body>
</html>
