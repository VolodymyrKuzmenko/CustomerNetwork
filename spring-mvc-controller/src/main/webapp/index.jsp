
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!-->
<html lang="en"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Customer Network</title>

    <!-- Bootstrap Core CSS -->
    <link href="<c:url value="resources/css/bootstrap.min.css"/>" rel="stylesheet">

    <link href="<c:url value="resources/css/sb-admin.css"/>" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<c:url value="resources/css/main.css"/>" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="<c:url value="resources/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet">

    <!--Custom Fonts-->
    <link href="<c:url value="resources/css/plugins/morris.css"/>" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script type="text/javascript" src="<c:url value="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"/>"></script>
    <script type="text/javascript" src="<c:url value="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"/>"></script>
    <![endif]-->

</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="registration-form center-block">
            <form class="form-horizontal" action='/j_spring_security_check' method="POST">
                <fieldset>
                    <div id="legend">
                        <legend class="">Sign In</legend>
                    </div>
                    <div class="control-group">
                        <!-- E-mail -->
                        <label class="control-label" for="email">E-mail</label>

                        <div class="controls">
                            <input type="email" id="email" name="j_username" placeholder="Enter your email" class="form-control">

                        </div>
                    </div>

                    <div class="control-group">
                        <!-- Password-->
                        <label class="control-label" for="password">Password</label>

                        <div class="controls">
                            <input type="password" id="password" name="j_password" placeholder="Enter your password" class="form-control">
                        </div>
                    </div>

                    <div class="control-group">
                        <!-- Button -->
                        <div class="controls">
                            <button type="submit" class="btn btn-success left">Sign In</button>
                        </div>
                        <div class="controls">
                            <a href="/register">
                                <button type="button" class="btn btn-success right">Register</button>
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


</body>
</html>
