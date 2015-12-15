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
                        <a href="/j_spring_security_logout"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
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
                <li class="active">
                    <a href="/projects"><i class="fa fa-fw fa-bar-chart-o"></i> Projects</a>
                </li>
                <li>
                    <a href="/tasks"><i class="fa fa-fw fa-table"></i> Tasks</a>
                </li>
                <li>
                    <a href="deals.jsp"><i class="fa fa-fw fa-edit"></i> Deals</a>
                </li>
                <li>
                    <a href="analytics.jsp"><i class="fa fa-fw fa-desktop"></i> Analytics</a>
                </li>
                <li>
                    <a href="contacts.jsp"><i class="fa fa-fw fa-wrench"></i> Contacts</a>
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
                        Projects
                    </h1>
                    <ol class="breadcrumb">
                        <li>
                            <i class="fa fa-dashboard"></i> <a href="/user-dashboard">Dashboard</a>
                        </li>
                        <li class="active">
                            <i class="fa fa-bar-chart-o"></i> Projects
                        </li>
                    </ol>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-6">
                    <h4>Aviliable Projects</h4>

                    <div class="table-responsive">
                        <table class="table table-bordered table-hover table-striped">
                            <thead>
                            <tr>
                                <th>Name</th>
                                <th>Responsible</th>
                                <th>Status</th>
                                <th>Last update</th>
                                <th>Tags</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${projectsList}" var="project">
                                <tr onclick= " window.location.href='/project?projectID=${project.getId()}'" >
                                    <td>${project.getName()}</td>
                                    <td>
                                        ${project.getResponsible().getUserInfo().getName()}
                                        ${project.getResponsible().getUserInfo().getSurname()}
                                    </td>
                                    <td>${project.getStatus().getStatusName()}</td>
                                    <td>${project.getDateUpdated()}</td>
                                    <td>tag</td>

                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <a href="/createproject?projectId=">
                        <button type="button" class="btn btn-success add">Create new</button>
                    </a>
                </div>
            </div>


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


</body>

</html>
