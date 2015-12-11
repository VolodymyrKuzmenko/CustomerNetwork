
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

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


    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script type="text/javascript" src="<c:url value="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"/>"></script>
    <script type="text/javascript" src="<c:url value="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"/>"></script>
    <![endif]-->

</head>

<body>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/user-dashboard">SB Admin</a>
        </div>
        <!-- Top Menu Items -->
        <ul class="nav navbar-right top-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b
                        class="caret"></b></a>
                <ul class="dropdown-menu message-dropdown">
                    <li class="message-preview">
                        <a href="#">
                            <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>

                                <div class="media-body">
                                    <h5 class="media-heading"><strong>John Smith</strong>
                                    </h5>

                                    <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>

                                    <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li class="message-preview">
                        <a href="#">
                            <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>

                                <div class="media-body">
                                    <h5 class="media-heading"><strong>John Smith</strong>
                                    </h5>

                                    <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>

                                    <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li class="message-preview">
                        <a href="#">
                            <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>

                                <div class="media-body">
                                    <h5 class="media-heading"><strong>John Smith</strong>
                                    </h5>

                                    <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>

                                    <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li class="message-footer">
                        <a href="#">Read All New Messages</a>
                    </li>
                </ul>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b
                        class="caret"></b></a>
                <ul class="dropdown-menu alert-dropdown">
                    <li>
                        <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="#">View All</a>
                    </li>
                </ul>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    </i>
                    ${sessionScope.user.getUserInfo().getName()}
                    ${sessionScope.user.getUserInfo().getSurname()}
                    <b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="/logout"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                    </li>
                </ul>
            </li>
        </ul>
        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li>
                    <a href="/user-dashboard"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
                </li>
                <li>
                    <a href="/projects"><i class="fa fa-fw fa-bar-chart-o"></i> Projects</a>
                </li>
                <li class="active">
                    <a href="/tasks"><i class="fa fa-fw fa-table"></i> Tasks</a>
                </li>
                <li>
                    <a href="deals.html"><i class="fa fa-fw fa-edit"></i> Deals</a>
                </li>
                <li>
                    <a href="analytics.html"><i class="fa fa-fw fa-desktop"></i> Analytics</a>
                </li>
                <li>
                    <a href="contacts.html"><i class="fa fa-fw fa-wrench"></i> Contacts</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </nav>

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Task view
                    </h1>
                    <ol class="breadcrumb">
                        <li>
                            <i class="fa fa-dashboard"></i> <a href="/user-dashboard">Dashboard</a>
                        </li>
                        <li>
                            <i class="fa fa-table"></i> <a href="/tasks">Tasks</a>
                        </li>
                        <li class="active">
                            <i class="fa fa-file-text"></i> Task view
                        </li>
                    </ol>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-3">
                    <p>Name: <span id="proj_name">${task.getName()}</span></p>
                </div>
                <div class="col-lg-3">
                    <p>Last update: <span id="proj_update">${task.getDateUpdated()}</span></p>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-3">
                    <p>Responsible:</p>
                    <select class="form-control input-sm">
                        <option>
                            ${task.getResponsible().getUserInfo().getName()}
                            ${task.getResponsible().getUserInfo().getSurname()}
                        </option>
                    </select>
                </div>
                <div class="col-lg-3">
                    <p>Status:</p>
                    <select class="form-control input-sm">
                        <option>${task.getStatus().getStatusName()}</option>

                    </select>
                </div>
            </div>
            <!-- Description start
            <div class="row">
                <div class="col-lg-6">
                    <h4>Description<i class="fa fa-pencil-square-o edit_ico" onclick="enableTextarea(this)"></i></h4>
                    <textarea id="description" class="well" disabled="true">task.getDescription()</textarea>
                    <button type="submit" id="cancel_button" class="btn btn-danger edit"
                            onclick="disableTextarea(this)">Cancel
                    </button>
                    <button type="button" id="update_button" class="btn btn-success edit"
                            onclick="disableTextarea(this)">Update
                    </button>

                </div>
            </div>
            <!-- Description end -->

            <!-- Comments start-->
            <div class="row">
                <div class="col-lg-6">
                    <h4>Comments</h4>
                    <c:if test="${!task.getComments().isEmpty()}">
                        <div class="comments">
                            <c:forEach items="${task.getComments()}" var="comment">
                                <div class="comment clearfix">
                                    <p class="user_name">
                                            ${comment.getAuthor().getUserInfo().getName()}
                                            ${comment.getAuthor().getUserInfo().getSurname()}
                                    </p>
                                    <p class="comm_text">${comment.getTextComment()}</p>
                                </div>
                            </c:forEach>
                        </div>
                    </c:if>
                    <div class="form-group">
                        <label>Add Comment</label>
                        <textarea class="form-control" rows="3" placeholder="Write a comment..."></textarea>
                    </div>
                    <button type="submit" class="btn btn-success add">Send</button>

                </div>
            </div>
            <!-- Comments end -->

        </div>
        <!-- /.container-fluid -->

    </div>
    <!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->
<!-- jQuery -->
<script type="text/javascript" src="<c:url value="resources/js/jquery.js"/>"></script>
<!-- Bootstrap Core JavaScript -->

<script type="text/javascript" src="<c:url value="resources/js/bootstrap.min.js"/>"></script>
<!-- Morris Charts JavaScript -->

<script type="text/javascript" src="<c:url value="resources/js/plugins/morris/raphael.min.js"/>"></script>

<script type="text/javascript" src="<c:url value="resources/js/plugins/morris/morris.min.js"/>"></script>

<script type="text/javascript" src="<c:url value="resources/js/plugins/morris/morris-data.js"/>"></script>


<!-- Autosize for textarea -->
<script type="text/javascript" src="<c:url value="resources/js/autosize.min.js"/>"></script>

<script type="text/javascript" src="<c:url value="resources/js/descriptionFunc.js"/>"></script>



<!-- Flot Charts JavaScript -->
<!--[if lte IE 8]>
<script type="text/javascript" src="<c:url value="resources/js/plugins/flot/excanvas.min.js"/>"></script><![endif]-->
<script type="text/javascript" src="<c:url value="resources/js/plugins/flot/jquery.flot.js"/>"></script>
<script type="text/javascript" src="<c:url value="resources/js/plugins/flot/jquery.flot.tooltip.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="resources/js/plugins/flot/jquery.flot.resize.js"/>"></script>
<script type="text/javascript" src="<c:url value="resources/js/plugins/flot/jquery.flot.pie.js"/>"></script>
<script type="text/javascript" src="<c:url value="resources/js/plugins/flot/flot-data.js"/>"></script>



</body>

</html>