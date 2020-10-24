
<html>
<head>
<title>Insert title here</title>
<script>
	function validateLogin() {
		if (document.forms[0].username.value == "") {
			alert("please enter userName")
			return false;
		}
		if (document.forms[0].password.value == "") {
			alert("please enter Password")
			return false;
		}
	}
</script>
</head>
<body>
	<form action="login" method="post">
		<h1>Login Screen</h1>
		Enter name: <input type="text" name="username"><br> Enter
		password:<input type="password" name="password"> <br> <input
			type="submit" onclick="return validateLogin()" value="Login">
	</form>
</body>
</html>