
<html>
<head>
<title> Login in</title>
<link rel="stylesheet" href="stylelogin.css">

</head>

<body>

<div class="center">

<h1>Login</h1>
<form name="loginform" action="login">
<div class="home">

Not a Member?Go To:<a href="index.html">HOME</a>
</div>
<div class="txt_field">

<input type="text" name="username" required/>
<span></span>
<label>USERNAME</label>
</div>
<div class="txt_field">

<input type="password" name="pwd" required/>
<span></span>
<label>PASSWORD</label>
</div>
<input type="hidden" name="action" value="login"/>
<input type="submit" value="Login">
  

</form>
</div>

</html>
