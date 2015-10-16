<!DOCTYPE html>
<!--[if lt IE 7]><html lang="ru" class="lt-ie9 lt-ie8 lt-ie7"><![endif]-->
<!--[if IE 7]><html lang="ru" class="lt-ie9 lt-ie8"><![endif]-->
<!--[if IE 8]><html lang="ru" class="lt-ie9"><![endif]-->
<!--[if gt IE 8]><!-->
<html lang="ru">
<!--<![endif]-->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<head>
	<meta charset="utf-8" />
	<title>Заголовок</title>
	<meta name="description" content="" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<link rel="shortcut icon" href="favicon.png" />
	<link rel="stylesheet" href="libs/bootstrap/bootstrap-grid-3.3.1.min.css" />
	<link rel="stylesheet" href="libs/font-awesome-4.2.0/css/font-awesome.min.css" />
	<link rel="stylesheet" href="libs/fancybox/jquery.fancybox.css" />
	<link rel="stylesheet" href="libs/owl-carousel/owl.carousel.css" />
	<link rel="stylesheet" href="libs/countdown/jquery.countdown.css" />
	<link rel="stylesheet" href="css/fonts.css" />
	<link rel="stylesheet" href="css/main.css" />
	<link rel="stylesheet" href="css/media.css" />
	<link rel="stylesheet" href="libs/magnific_popup/magnific-popup.css">
</head>
<body>
	<!--[if lt IE 9]>
	<script src="libs/html5shiv/es5-shim.min.js"></script>
	<script src="libs/html5shiv/html5shiv.min.js"></script>
	<script src="libs/html5shiv/html5shiv-printshiv.min.js"></script>
	<script src="libs/respond/respond.min.js"></script>
	<![endif]-->
	<script src="libs/jquery/jquery-1.11.1.min.js"></script>
	<script src="libs/jquery-mousewheel/jquery.mousewheel.min.js"></script>
	<script src="libs/fancybox/jquery.fancybox.pack.js"></script>
	<script src="libs/waypoints/waypoints-1.6.2.min.js"></script>
	<script src="libs/scrollto/jquery.scrollTo.min.js"></script>
	<script src="libs/owl-carousel/owl.carousel.min.js"></script>
	<script src="libs/countdown/jquery.plugin.js"></script>
	<script src="libs/countdown/jquery.countdown.min.js"></script>
	<script src="libs/countdown/jquery.countdown-ru.js"></script>
	<script src="libs/landing-nav/navigation.js"></script>
	<script src="libs/magnific_popup/jquery.magnific-popup.js"></script>
	<script src="libs/bootstrap/bootstrap.js" />
	<script src="libs/bootstrap/fileInput.js" />
	<script src="js/common.js"></script>
	<!-- Yandex.Metrika counter --><!-- /Yandex.Metrika counter -->
	<!-- Google Analytics counter --><!-- /Google Analytics counter -->
	<header>
		<div class="top_line">
			<div class="logo">
				<div class="col-md-12">
					<div class="top_logo">
						<h1>Social Network</h1>
						<span>for professionals</span>
					</div>
				</div>
			</div>
		</div>
	</header>
	<section class="welcome">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="col-md-12">
						<div class="wrapper">
							<div class="info">
								<div class="motivation_text">
									<h2>
									Build your business with us! 
									</h2>
									<h3>
										Try to manage your dreams
									</h3>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ullam obcaecati aliquid tenetur nihil sint voluptate harum voluptatem voluptatibus aspernatur eius esse, ex quis unde voluptatum iure beatae praesentium voluptates id.</p>
									<div class="buttons">
										<button class="btn_sign btn" ><a href="registration.jsp">Sign in</a></button>
										<button href="#login-popup" class="login-link btn_log btn">Log in</button>
									</div>
								</div>
								<img src="images/macbook.png" alt="Alt">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<div id="login-popup" class="white-popup mfp-hide">
  		<form action="login" method="post">
  			Enter your email <br>
  			<input type="email" name="email">
  			Enter your password <br>
  			<input type="password" name="password">
  			<input type="submit" class="btn_log btn" value="Log in">
  		</form>
	</div>
	<div id="window-error" class="white-popup mfp-hide">
  		<h3 class="error_h3">ERROR Password or Login!</h3>
	</div>
</body>
</html>