<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
nav {
	float: left;
	max-width: 160px;
	margin: 0;
	padding: 1em;
}

nav ul {
	list-style-type: none;
	padding: 0;
}

nav ul a {
	text-decoration: none;
}
</style>
<title>Quản lý bệnh nhân</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="Tooplate">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

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

<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"
	integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ"
	crossorigin="anonymous"></script>
<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"
	integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY"
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
	integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body id="top" data-spy="scroll" data-target=".navbar-collapse"
	data-offset="50">
	<%
	if (session.getAttribute("accountInfor") == null) {
		response.sendRedirect("login.jsp?error=1");
	} else {
	%>
	<!-- PRE LOADER -->
	<section class="preloader">
		<div class="spinner">

			<span class="spinner-rotate"></span>

		</div>
	</section>


	<!-- HEADER -->



	<!-- MENU -->
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


	<div class="wrapper">
		<!-- Sidebar  -->
		<nav id="sidebar">
			<div class="sidebar-header">
				<h3>Bảng điều khiển</h3>
			</div>

			<ul class="list-unstyled components">

				<li><a href="Quan_Ly_Thong_Tin_Benh_Nhan_NVHC">Quản lý bệnh
						nhân</a></li>
				<li><a href="Quan_Ly_Kho_Thuoc_NVHC">Kho thuốc</a></li>
				<li><a href="Quan_Ly_Thuoc_NVHC">Quản lý thuốc</a></li>
				<li><a href="Quan_ly_Phong_Benh_NVHC">Quản lý phòng bệnh</a></li>
				<li><a href="Quan_ly_giuong_Benh_NVHC">Quản lý giường bệnh</a></li>
				<li><a href="Quan_ly_Lich_Lam_Viec_NVHC">Quản lý lịch làm
						việc</a></li>
			</ul>

		</nav>

		<!-- Page Content  -->
		<div id="content">
			<button type="button" id="sidebarCollapse" class="btn btn-info">
				<i class="fas fa-align-left"></i> <span>Bảng điều khiển</span>
			</button>


			<div class="container-xl">
				<style>
.table-responsive {
	margin: 30px 0;
}

.table-wrapper {
	min-width: 1000px;
	background: #fff;
	padding: 20px 25px;
	border-radius: 3px;
	box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
}

.table-title {
	padding-bottom: 15px;
	background: #a5c422;
	color: #fff;
	padding: 16px 30px;
	margin: -20px -25px 10px;
	border-radius: 3px 3px 0 0;
}

.table-title h2 {
	margin: 5px 0 0;
	font-size: 24px;
}

.table-title .btn {
	color: #566787;
	float: right;
	font-size: 13px;
	background: #fff;
	border: none;
	min-width: 50px;
	border-radius: 2px;
	border: none;
	outline: none !important;
	margin-left: 10px;
}

.table-title .btn:hover, .table-title .btn:focus {
	color: #566787;
	background: #f2f2f2;
}

.table-title .btn i {
	float: left;
	font-size: 21px;
	margin-right: 5px;
}

.table-title .btn span {
	float: left;
	margin-top: 2px;
}

table.table tr th, table.table tr td {
	border-color: #e9e9e9;
	padding: 12px 15px;
	vertical-align: middle;
}

table.table tr th:first-child {
	width: 60px;
}

table.table tr th:last-child {
	width: 100px;
}

table.table-striped tbody tr:nth-of-type(odd) {
	background-color: #fcfcfc;
}

table.table-striped.table-hover tbody tr:hover {
	background: #f5f5f5;
}

table.table th i {
	font-size: 13px;
	margin: 0 5px;
	cursor: pointer;
}

table.table td:last-child i {
	opacity: 0.9;
	font-size: 22px;
	margin: 0 5px;
}

table.table td a {
	font-weight: bold;
	color: #566787;
	display: inline-block;
	text-decoration: none;
}

table.table td a:hover {
	color: #2196F3;
}

table.table td a.views {
	color: #2196F3;
}

table.table td a.delete {
	color: #F44336;
}

table.table td i {
	font-size: 19px;
}

table.table .avatar {
	border-radius: 50%;
	vertical-align: middle;
	margin-right: 10px;
}

.status {
	font-size: 30px;
	margin: 2px 2px 0 0;
	display: inline-block;
	vertical-align: middle;
	line-height: 10px;
}

.text-success {
	color: #10c469;
}

.text-info {
	color: #62c9e8;
}

.text-warning {
	color: #FFC107;
}

.text-danger {
	color: #ff5b5b;
}

.pagination {
	float: right;
	margin: 0 0 5px;
}

.pagination li a {
	border: none;
	font-size: 13px;
	min-width: 30px;
	min-height: 30px;
	color: #999;
	margin: 0 2px;
	line-height: 30px;
	border-radius: 2px !important;
	text-align: center;
	padding: 0 6px;
}

.pagination li a:hover {
	color: #666;
}

.pagination li.active a, .pagination li.active a.page-link {
	background: #03A9F4;
}

.pagination li.active a:hover {
	background: #0397d6;
}

.pagination li.disabled i {
	color: #ccc;
}

.pagination li i {
	font-size: 16px;
	padding-top: 6px
}

.hint-text {
	float: left;
	margin-top: 10px;
	font-size: 13px;
}
</style>

			</div>
		</div>

	</div>

	<!-- content -->

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
								<i class="far fa-envelope"></i> <a href="#">ttytnhs@danang.gov.vn</a>
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

	<!-- SCRIPTS -->
	<script src="<c:url value="/resources/js/jquery.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/jquery.sticky.js" />"></script>
	<script src="<c:url value="/resources/js/jquery.stellar.min.js" />"></script>
	<script src="<c:url value="/resources/js/wow.min.js" />"></script>
	<script src="<c:url value="/resources/js/smoothscroll.js" />"></script>
	<script src="<c:url value="/resources/js/owl.carousel.min.js" />"></script>
	<script src="<c:url value="/resources/js/custom.js" />"></script>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
		integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
		integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"
		crossorigin="anonymous"></script>


	<script type="text/javascript">
		$(document).ready(function() {
			$('#sidebarCollapse').on('click', function() {
				$('#sidebar').toggleClass('active');
			});
		});
	</script>
	<%
	}
	%>
</body>
</html>