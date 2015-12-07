<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Customer Network</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/sb-admin.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/main.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">


    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
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
            <a class="navbar-brand" href="user-dashboard.html">SB Admin</a>
        </div>
        <!-- Top Menu Items -->
        <ul class="nav navbar-right top-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
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
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
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
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a>
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
                    <a href="user-dashboard.jsp"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
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
                            <i class="fa fa-dashboard"></i>  <a href="user-dashboard.jsp">Dashboard</a>
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
                    <p>Name: <span id="proj_name">Taskname</span></p>
                </div>
                <div class="col-lg-3">
                    <p>Last update: <span id="proj_update">12/4/2015</span></p>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-3">
                    <p>Responsible:</p>
                    <select class="form-control input-sm">
                        <option>User 1</option>
                        <option>User 2</option>
                        <option>User 3</option>
                        <option>User 4</option>
                    </select>
                </div>
                <div class="col-lg-3">
                    <p>Status:</p>
                    <select class="form-control input-sm">
                        <option>In progres</option>
                        <option>Code view</option>
                        <option>Testing</option>
                        <option>Done</option>
                    </select>
                </div>
            </div>
            <!-- Description start-->
            <div class="row">
                <div class="col-lg-6">
                    <h4>Description<i class="fa fa-pencil-square-o edit_ico" onclick="enableTextarea(this)"></i></h4>
                    <textarea id="description" class="well" disabled="true">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sed diam eget risus varius blandit sit amet non magna. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Cras mattis consectetur purus sit amet fermentum. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Aenean lacinia bibendum nulla sed consectetur.</textarea>
                    <button type="submit" id="cancel_button" class="btn btn-danger edit" onclick="disableTextarea(this)">Cancel</button>
                    <button type="button" id="update_button" class="btn btn-success edit" onclick="disableTextarea(this)">Update</button>

                </div>
            </div>
            <!-- Description end -->

            <!-- Comments start-->
            <div class="row">
                <div class="col-lg-6">
                    <h4>Comments</h4>
                    <div class="comments">
                        <div class="comment clearfix">
                            <p class="user_name">User 1</p>
                            <p class="comm_text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Facere delectus numquam animi quae unde est, nesciunt? Vero, repellat, nam. Dolor beatae error, voluptatum laborum tenetur dolorum obcaecati nam provident pariatur.</p>
                        </div>
                        <div class="comment clearfix">
                            <p class="user_name">User 2</p>
                            <p class="comm_text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ea sunt fuga, fugiat similique dicta voluptas dolores placeat officiis cupiditate eaque, nemo cum! Amet, aperiam quod nobis qui, voluptates totam culpa. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sit natus ratione minima minus a! Molestiae iusto, ea porro quia nam! Inventore temporibus amet aliquid laboriosam est harum ab maxime fuga.</p>
                        </div>
                        <div class="comment clearfix">
                            <p class="user_name">User 3</p>
                            <p class="comm_text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Facere delectus numquam animi quae unde est, nesciunt?</p>
                        </div>
                    </div>
                    <form action="">
                        <div class="form-group">
                            <label>Add Comment</label>
                            <textarea class="form-control" rows="3" placeholder="Write a comment..."></textarea>
                        </div>
                        <button type="submit" class="btn btn-success add">Send</button>
                    </form>
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
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>

<!-- Morris Charts JavaScript -->
<script src="js/plugins/morris/raphael.min.js"></script>
<script src="js/plugins/morris/morris.min.js"></script>
<script src="js/plugins/morris/morris-data.js"></script>

<!-- Autosize for textarea -->
<script src="js/autosize.min.js"></script>
<script>
    autosize(document.querySelectorAll('textarea'));


    function enableTextarea(element){
        current_input = document.getElementById('description');
        current_input.disabled=false;
        current_input.focus();
        current_input.setSelectionRange(current_input.value.length,current_input.value.length);
        update_button = document.getElementById('update_button');
        update_button.style.display = (update_button.style.display == 'inline-block') ? '' : 'inline-block'
        cancel_button = document.getElementById('cancel_button');
        cancel_button.style.display = (cancel_button.style.display == 'inline-block') ? '' : 'inline-block'

    }

    function disableTextarea(element){
        current_input = document.getElementById('description');
        current_input.disabled=true;
        update_button = document.getElementById('update_button');
        update_button.style.display = 'none';
        cancel_button = document.getElementById('cancel_button');
        cancel_button.style.display = 'none';
    }
</script>

<!-- Flot Charts JavaScript -->
<!--[if lte IE 8]><script src="js/excanvas.min.js"></script><![endif]-->
<script src="js/plugins/flot/jquery.flot.js"></script>
<script src="js/plugins/flot/jquery.flot.tooltip.min.js"></script>
<script src="js/plugins/flot/jquery.flot.resize.js"></script>
<script src="js/plugins/flot/jquery.flot.pie.js"></script>
<script src="js/plugins/flot/flot-data.js"></script>

</body>

</html>
