<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/WEB-INF/images/yte.png" />"
	rel="shortcut icon">
<title>Login Page</title>
<link href="<c:url value="/WEB-INF/css/login.css" />" rel="stylesheet"
	type="text/css">
</head>
<body>

	<script type="text/javascript">
		
	<%String error = request.getParameter("error");%>
		var x =
	<%=("1".equals(error))%>
		;
		if (x == true) {
			alert("Mời bạn đăng nhập!");
		}
		var y =
	<%=("2".equals(error))%>
		;
		if (y == true) {
			alert("Thông tin đăng nhập không đúng!")
		}
	</script>
	<div class="login-wrap">
		<div class="login-html">
			<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label
				for="tab-1" class="tab">Sign In</label> <input id="tab-2"
				type="radio" name="tab" class="sign-up"><label for="tab-2"
				class="tab"></label>
			<div class="login-form">
				<form action="login" method="post">
					<div class="sign-in-htm">
						<div class="group">
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