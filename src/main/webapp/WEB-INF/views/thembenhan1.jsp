<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm bệnh án</title>

<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/font-awesome.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/animate.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/owl.carousel.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/owl.theme.default.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">

<!-- MAIN CSS -->
<link href="<c:url value="/resources/css/tooplate-style.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" referrerpolicy="no-referrer" />





</head>
<body>
	<%
	if (session.getAttribute("accountInfor") == null) {
		response.sendRedirect("login.jsp?error=1");
	} else {
	%>
	<!-- PRE LOADER -->


	<section class="navbar navbar-default navbar-static-top"
		role="navigation">
		<div class="container">

			<div class="navbar-header">
				<button class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon icon-bar"></span> <span class="icon icon-bar"></span>
					<span class="icon icon-bar"></span>
				</button>

				<!-- lOGO TEXT HERE -->
				<a href="index.jsp" class="navbar-brand"
					style="color: #a5c422; font-size: 3rem">Bệnh viện Ngũ Hành Sơn</a>
			</div>

			<!-- MENU LINKS -->
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#top" class="smoothScroll">Trang chủ</a></li>
					<li><a href="#about" class="smoothScroll">Tìm hiểu về
							chúng tôi</a></li>
					<li><a href="#team" class="smoothScroll">Thông tin bác sĩ</a></li>
					<li><a href="#news" class="smoothScroll">Tin tức mới nhất</a></li>
					<li><a href="#google-map" class="smoothScroll">Liên hệ</a></li>
					<li><a font-color="blue"><%=(String) session.getAttribute("accountInfor")%></a></li>
					<li class="logout-btn"><a href="Logout">Đăng xuất</a></li>
				</ul>
			</div>

		</div>
	</section>
	<style>
.register {
	background: -webkit-linear-gradient(left, #a5c422, #576620);
	margin-top: -3%;
	padding: 3%;
}

.register-left {
	text-align: center;
	color: #fff;
	margin-top: 4%;
}

.register-left input {
	border: none;
	border-radius: 1.5rem;
	padding: 2%;
	width: 60%;
	background: #f8f9fa;
	font-weight: bold;
	color: #383d41;
	margin-top: 30%;
	margin-bottom: 3%;
	cursor: pointer;
}

.register-right {
	background: #f8f9fa;
	border-top-left-radius: 10% 50%;
	border-bottom-left-radius: 10% 50%;
	padding: 0 0 60px 85px;
}

.register-left img {
	margin-top: 15%;
	margin-bottom: 5%;
	width: 25%;
	-webkit-animation: mover 2s infinite alternate;
	animation: mover 1s infinite alternate;
}

.register-left p {
	font-weight: lighter;
	padding: 12%;
	margin-top: -9%;
}

.register .register-form {
	padding: 5%;
}

.btnRegister {
	float: right;
	margin-top: 10%;
	border: none;
	border-radius: 1.5rem;
	padding: 2%;
	background: #0062cc;
	color: #fff;
	font-weight: 600;
	width: 50%;
	cursor: pointer;
}

.register .nav-tabs {
	margin-top: 3%;
	border: none;
	background: #0062cc;
	border-radius: 1.5rem;
	width: 28%;
	float: right;
}

.register .nav-tabs .nav-link {
	padding: 2%;
	height: 34px;
	font-weight: 600;
	color: #fff;
	border-top-right-radius: 1.5rem;
	border-bottom-right-radius: 1.5rem;
}

.register .nav-tabs .nav-link:hover {
	border: none;
}

.register .nav-tabs .nav-link.active {
	width: 100px;
	color: #0062cc;
	border: 2px solid #0062cc;
	border-top-left-radius: 1.5rem;
	border-bottom-left-radius: 1.5rem;
}

.register-heading {
	text-align: center;
	margin-top: 8%;
	margin-bottom: -15%;
	color: #495057;
}

input.form-control {
	margin-bottom: 20px;
}

td.labelname {
	margin-top: 10px;
	display: block;
}

form {
	padding: 44px 0 51px 78px;
	position: relative;
}
</style>
	<div class="container register">
		<div class="row">
			<div class="col-md-3 register-left">
				<img
					src="https://upload.wikimedia.org/wikipedia/vi/thumb/b/ba/Logo_B%E1%BB%99_Y_t%E1%BA%BF.svg/470px-Logo_B%E1%BB%99_Y_t%E1%BA%BF.svg.png"
					style="width: 200px" alt="" />

			</div>
			<div class="col-md-9 register-right">
				<h2 style="text-align: center">Thêm bệnh án</h2>

				<form:form modelAttribute="benhAnForm1"
					action="Quan_ly_Benh_An_GDBV_add" method="post">
					<div class="col-md-6">
						<table>
							<tr class="form-group">
								<td class="labelname">Mã BA:</td>
								<td><form:input class="form-control"
										placeholder="Mã Bệnh Án" path="maBenhan" /></td>
							</tr>

							<tr class="form-group">
								<td class="labelname">Tên BN:</td>
								<td><form:input class="form-control" path="tenbenhnhan"
										placeholder="Tên Bệnh Nhân " /></td>
							</tr>

							<tr class="form-group">
								<td class="labelname">Tình Trạng nhập viên:</td>
								<td><form:input class="form-control"
										path="tinhtrangnhapvien"
										placeholder="Tình trạng nhập viện" /></td>
							</tr>

							
						</table>
					</div>
					<div class="col-md-6">
						<table>
						    <tr class="form-group">
								<td class="labelname">Chuẩn đoán bệnh:</td>
								<td><form:input class="form-control" path="chandoanbenh"
										placeholder="Chuẩn đoán bệnh" /></td>
							</tr>

							<tr class="form-group">
								<td class="labelname">Lần Khám:</td>
								<td><form:input class="form-control" path="lankham"
										placeholder="Lần khám" /></td>
							</tr>
							<tr class="form-group">
								<td class="labelname">Bác Sĩ:</td>
								<td><form:input class="form-control" path="bacsi"
										placeholder="Bác Sĩ" /></td>
							</tr>
						</table>
					</div>
					<tr>
						<td></td>
						<td><form:button class="btn btn-primary"
								style="    position: absolute;
																			    top: 217px;
																			    right: 331px;
																			    width: 150px;">Thêm</form:button></td>
					</tr>
					<a href="Quan_ly_benh_an_GDBV" class="btn btn-primary" style="position: absolute; 
					                                                            top: 217px;
																			    right: 523px;
																			    width: 150px;"
					>Trở lại</a>
				</form:form>


			</div>
		</div>


	</div>



	<footer data-stellar-background-ratio="5">
		<div class="container">
			<div class="row">

				<div class="col-md-4 col-sm-4">
					<div class="footer-thumb">
						<h4 class="wow fadeInUp" data-wow-delay="0.4s">Thông tin liên
							lạc</h4>
						<p>582 Lê Văn Hiến - Quận Ngũ Hành Sơn - Đà Nẵng</p>

						<div class="contact-info">
							<p>
								<i class="fa fa-phone"></i> 0236.3 847 520
							</p>
							<p>
								<i class="fas fa-envelope mr-2" style="width: 35px;
                                                                       height: 35px;
                                                                       font-size: 30px;
                                                                       margin-right: 6px;
                                                                       color: #393939;">
                               </i><a href="#">ttytnhs@danang.gov.vn</a>
							</p>
						</div>
					</div>
				</div>

				<div class="col-md-4 col-sm-4">
					<div class="footer-thumb">
						<h4 class="wow fadeInUp" data-wow-delay="0.4s">Tin mới nhất</h4>
						<div class="latest-stories">
							<div class="stories-image">
								<a href="news-detail.jsp"><img src="resources/images/unname.jpg"
									class="img-responsive" alt=""></a>
							</div>
							<div class="stories-info">
								<a href="news-detail.jsp"><h5>HƯỚNG DẪN KHAI BÁO Y TẾ
										ONLINE TẠI TRUNG TÂM Y TẾ QUẬN NGŨ HÀNH SƠN</h5></a> <span>June
									30, 2021</span>
							</div>
						</div>

						<div class="latest-stories">
							<div class="stories-image">
								<a href="news-detail2.jsp"><img src="resources/images/vssid.jpg"
									class="img-responsive" alt=""></a>
							</div>
							<div class="stories-info">
								<a href="news-detail2.jsp"><h5>NHỮNG ĐIỀU CẦN BIẾT KHI
										SỬ DỤNG “VSSID – BẢO HIỂM XÃ HỘI SỐ</h5></a> <span>July 10, 2021</span>
							</div>
						</div>
					</div>
				</div>

				<div class="col-md-4 col-sm-4">
					<div class="footer-thumb">
						<div class="opening-hours">
							<h4 class="wow fadeInUp" data-wow-delay="0.4s">Thời gian mở
								cửa</h4>
							<p>
								Thứ hai - Thứ sáu <span>06:00 AM - 10:00 PM</span>
							</p>
							<p>
								Thứ 7 <span>09:00 AM - 08:00 PM</span>
							</p>
							<p>
								Chủ nhật <span>Closed</span>
							</p>
						</div>

						<ul class="social-icon">
							<li><a href="https://www.facebook.com/" target="_blank"
								class="fab fa-facebook-square" attr="facebook icon"></a></li>
							<li><a href="https://twitter.com/" target="_blank"
								class="fab fa-twitter" attr="twitter icon"></a></li>
							<li><a href="https://www.instagram.com/" target="_blank"
								class="fab fa-instagram" attr="instagram icon"></a></li>
						</ul>
					</div>
				</div>

				<div class="col-md-12 col-sm-12 border-top">
					<div class="col-md-4 col-sm-6">
						<div class="copyright-text">
							<p>Copyright &copy; 2021 6-AM Group | Design: 6-AM Group</p>
						</div>
					</div>
					<div class="col-md-6 col-sm-6"></div>
					<div class="col-md-2 col-sm-2 text-align-center">
						<div class="angle-up-btn">
							<a href="#top" class="smoothScroll wow fadeInUp"
								data-wow-delay="1.2s"><i class="fa fa-angle-up"></i></a>
						</div>
					</div>
				</div>

			</div>
		</div>
	</footer>
	<%
	}
	%>
</body>
</html>