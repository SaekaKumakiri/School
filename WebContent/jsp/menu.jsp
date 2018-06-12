<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>メニュー画面</title>
  <link href="../css/bootstrap.min.css" rel="stylesheet">
  <link href="../css/my.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/earlyaccess/hannari.css" rel="stylesheet" />
  <script src="../js/jquery.min.js"></script>
  <script src="../js/bootstrap.min.js"></script>
</head>
<body class="loginImg">

<nav class="navbar navbar-default">
  <div class="container-fluid header-color">
    <div class="navbar-headerr">
<!--
      <button type="button" class="navbar-toggle collapsed" data-toogle="collapse" data-target="#navigation">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
-->
      <a class="navbar-brand" href="#">Menu</a>
    </div>
  </div>
</nav>
  <div class="container-fluid text-center menu-size">
	<form action="../menu/MenuServlet" method="post">
      <p class="spaceButton"></p>
	  <input type="submit" class="btn btn-success menu-btn btn-block" value="参加申請" name="menuList">
	  <p class="spaceButton"></p>
	  <input type="submit" class="btn btn-warning menu-btn btn-block" value="参加予定一覧" name="menuList">

	</form>
</div>

</body>
</html>