<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Customer Network</title>

    <!-- Bootstrap Core CSS -->
    <!-- Bootstrap Core CSS -->
    <link href="<c:url value="resources/css/bootstrap.min.css"/>" rel="stylesheet">

    <link href="<c:url value="resources/css/sb-admin.css"/>" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<c:url value="resources/css/main.css"/>" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="<c:url value="resources/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet">

    <!--Custom Fonts-->
    <link href="<c:url value="resources/css/plugins/morris.css"/>" rel="stylesheet">

    <!--[if lt IE 9]><script type="text/javascript" src="<c:url value="//html5shim.googlecode.com/svn/trunk/html5.js"/>"></script><![endif]-->


</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="registration-form center-block">
            <form class="form-horizontal" action='/registration' method="POST">
                <fieldset>
                    <div id="legend">
                        <legend class="">Register</legend>
                    </div>
                    <div class="control-group">
                        <!-- E-mail -->
                        <label class="control-label" for="email">E-mail</label>
                        <div class="controls">
                            <input type="text" id="email" name="email" placeholder="Enter your email" class="form-control">
                            <p class="help-block">Please provide your E-mail</p>
                        </div>
                    </div>

                    <div class="control-group">
                        <!-- Password-->
                        <label class="control-label" for="password">Password</label>
                        <div class="controls">
                            <input type="password" id="password" name="password" placeholder="Enter your password" class="form-control">
                            <p class="help-block">Password should be at least 4 characters</p>
                        </div>
                    </div>

                    <div class="control-group">
                        <!-- Password -->
                        <label class="control-label"  for="password_confirm">Confirm Password</label>
                        <div class="controls">
                            <input type="password" id="password_confirm" name="password_confirm" placeholder="Confirm your password" class="form-control" pattern=".{4,}" required>
                            <p class="help-block passf">Please confirm password</p>
                        </div>
                    </div>

                    <div class="control-group">
                        <!-- Button -->
                        <div class="controls">
                            <button type="submit" class="btn btn-success left">Register</button>
                        </div>
                        <div class="controls">
                            <a href="/index.jsp">
                                <button type="button" class="btn btn-success right">Cancel</button>
                            </a>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>



<!-- jQuery -->
<script type="text/javascript" src="<c:url value="resources/js/jquery.js"/>"></script>
<!-- Bootstrap Core JavaScript -->

<script type="text/javascript" src="<c:url value="resources/js/bootstrap.min.js"/>"></script>
<!-- Morris Charts JavaScript -->

<script type="text/javascript" src="<c:url value="resources/js/plugins/morris/raphael.min.js"/>"></script>

<script type="text/javascript" src="<c:url value="resources/js/plugins/morris/morris.min.js"/>"></script>

<script type="text/javascript" src="<c:url value="resources/js/plugins/morris/morris-data.js"/>"></script>
<!-- Flot Charts JavaScript -->

<script type="text/javascript" src="<c:url value="resources/js/plugins/flot/jquery.flot.js"/>"></script>
<script type="text/javascript" src="<c:url value="resources/js/plugins/flot/jquery.flot.tooltip.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="resources/js/plugins/flot/jquery.flot.resize.js"/>"></script>
<script type="text/javascript" src="<c:url value="resources/js/plugins/flot/jquery.flot.pie.js"/>"></script>
<script type="text/javascript" src="<c:url value="resources/js/plugins/flot/flot-data.js"/>"></script>
</body>
</html>
