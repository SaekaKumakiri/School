<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>ログイン画面</title>
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <link href="./css/my.css" rel="stylesheet">
    <link href="./css/login.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Bungee+Shade" rel="stylesheet">
    <script src="./js/jquery.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>

</head>
<body>
<div class="container-fluid text-center loginImg">
  <div class="container-fluid text-center login-size">

  <div class="box18">
    <h1>Sign In</h1>
      <form action="./login/LoginServlet" method="post">
        <br><br>

        <div class="form-group">
           <input type="text" name="StaffID" class="form-control" placeholder="ID">
           <br>
           <input type="password" name="Password" class="form-control" placeholder="Password">
        </div>
        <br>
	    <input type="submit" class="btn btn-info" value="Sign In">
        <br><br>
      </form>
   </div>
  </div>
</div>
</body>
</html>