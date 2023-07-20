
<html>
<head>
<title>SignUp</title>
<link rel="stylesheet" href="signup.css">
</head>
<body>
<div class=center>
<form name="signupform" action="login">
<h1>SignUp</h1>
<div class="home">
Go To :<a href="index.html">HOME</a>
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
<div class="txt_field">

<input type="password" name="pwd" required/>
<span></span>
<label>CONFIRM PASSWORD</label>
</div>

 <input type="hidden" name="action" value="signup"/>

<input type="submit" value="SignUp">
 

</form>
</div>
</body>
</html>