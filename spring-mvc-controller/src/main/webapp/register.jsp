<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Registration</title>
    <link rel="stylesheet" href="css/style.css">
    <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>
<form method="post" action="/registration" class="register">
    <p>
        <label for="login">Email:</label>
        <input type="text" name="login" id="login" value="name@example.com">
    </p>

    <p>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password" value="4815162342">
    </p>

    <p class="register-submit">
        <button type="submit" class="register-button">Login</button>
    </p>

    <p>
        <label for="password">Confirm:</label>
        <input type="password" name="passwordConfirm" id="password-confirm" value="4815162342">
    </p>

</form>
</body>
</html>
