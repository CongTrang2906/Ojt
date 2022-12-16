<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">

<head>
<meta charset="UTF-8">

<link href="<c:url value="/resources/images/yte.png" />"
	rel="shortcut icon">
<title>Login Page</title>


</head>
<body>
	<div class="login-wrap">
		<div class="login-html">
			<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label
				for="tab-1" class="tab">Sign In</label> <input id="tab-2"
				type="radio" name="tab" class="sign-up"><label for="tab-2"
				class="tab"></label>
			<div class="login-form">
				<form action="Quan_ly_nhan_vien" method="post">
					<div class="sign-in-htm">
						<div class="group">
							<%
							String error = request.getParameter("error");
							%>
							<%=("1".equals(error)) ? "Mời bạn đăng nhập" : ""%>
							<%=("2".equals(error)) ? "Thông tin đăng nhập không đúng" : ""%>

							<label for="user" class="label">Username</label> <input id="user"
								type="text" class="input" name="userName">
						</div>
						<div class="group">
							<label for="pass" class="label">Password</label> <input id="pass"
								type="password" class="input" data-type="password"
								name="password">
						</div>

						<div class="group">
							<input type="submit" class="button" value="Sign In">
						</div>
						<div style="text-align: center;">
							<a href="index.jsp">Quay lại trang chủ</a>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>