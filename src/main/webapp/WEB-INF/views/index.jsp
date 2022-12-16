<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>

<title>Bệnh viện Ngũ Hành Sơn</title>

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

</head>
<body id="top" data-spy="scroll" data-target=".navbar-collapse"
	data-offset="50">

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
					<li><a href="#appointment">Đặt lịch khám</a></li>
					<li class="logout-btn"><a href="login">Đăng nhập</a></li>
				</ul>
			</div>

		</div>
	</section>


	<!-- HOME -->
	<section id="home" class="slider" data-stellar-background-ratio="0.5">
		<div class="container">
			<div class="row">

				<div class="owl-carousel owl-theme">
			
					<div class="item item-first">
						<div class="caption">
							<div class="col-md-offset-1 col-md-10">
								<h3>Hãy làm cho cuộc sống của bạn hạnh phúc hơn</h3>
								<h1>Lối sống lành mạnh</h1>
								<a href="#team" class="section-btn btn btn-default smoothScroll">Gặp
									gỡ các bác sĩ của chúng tôi</a>
							</div>
						</div>
					</div>

					<div class="item item-second">
						<div class="caption">
							<div class="col-md-offset-1 col-md-10">
								<h3>Sức khỏe của bạn là nhiềm vui của chúng tôi</h3>
								<h1>Bệnh viện Ngũ Hành Sơn</h1>
								<a href="#about"
									class="section-btn btn btn-default btn-gray smoothScroll">Tìm
									hiểu về chúng tôi</a>
							</div>
						</div>
					</div>

					<div class="item item-third">
						<div class="caption">
							<div class="col-md-offset-1 col-md-10">
								<h3>Hãy nắm bắt những tin tức mới nhất</h3>
								<h1>Tin tức hàng ngày</h1>
								<a href="#news"
									class="section-btn btn btn-default btn-blue smoothScroll">Đọc
									tin tức</a>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</section>


	<!-- ABOUT -->
	<section id="about">
		<div class="container">
			<div class="row">

				<div class="col-md-6 col-sm-6">
					<div class="about-info">
						<h2 style="width: max-content;
    						padding-bottom: 38px;"
    						>
    						Welcome to Ngu
							Hanh Son Hospital</h2>
						<div class="wow fadeInUp" data-wow-delay="0.8s">
							<h7>Bệnh viện Ngũ Hành Sơn là một đơn vị sự nghiệp y tế
							trực thuộc Sở Y tế thành phố Đà Nẵng, được thành lập theo
							Quyết định số 335/QĐ-UB ngày 24 tháng 2 năm 1997 của UBND
							thành phố với tên gọi là Bệnh viện Ngũ Hành Sơn.</h7>
							<h7>Bệnh viện Ngũ Hành Sơn đặt tại số 582 đường Lê Văn
							Hiến với 120 giường bệnh, hằng năm Bệnh viện Ngũ Hành Sơn đầu
							tư nâng cấp, phát triển cả về quy mô và chất lượng.</h7>
						</div>
						<figure class="profile wow fadeInUp" data-wow-delay="1s">
							<img src="<c:url value='/resources/images/3.jpg'/>"
								class="img-responsive" alt="" />
							<figcaption>
								<h3>BS. Trương Văn Huy</h3>
								<p>Viện trưởng</p>
							</figcaption>
						</figure>
					</div>
				</div>

			</div>
		</div>
	</section>


	<!-- TEAM -->
	<section id="team" data-stellar-background-ratio="1">
		<div class="container">
			<div class="row">

				<div class="col-md-6 col-sm-6">
					<div class="about-info">
						<h2 class="wow fadeInUp" data-wow-delay="0.1s">Những bác sĩ
							của chúng tôi</h2>
					</div>
				</div>


<div class="mydoctor" style="margin-left: 88px;
    display: inline-flex;">
<style>

.img-responsive1{
	height: 390px;
    width: 100%;
}
</style>
				<div class="clearfix"></div>

				<div class="col-md-4 col-sm-6">
					<div class="team-thumb wow fadeInUp left" style ="margin-right: 107px;
					width: 400px;
					" data-wow-delay="0.2s">

						<img src="<c:url value='/resources/images/3.jpg'/>"
							class="img-responsive1" alt="" />
						<div class="team-info">
							<h3>Trương Văn Huy</h3>
							<p>Viện trưởng</p>
							<div class="team-contact-info">
								<p>
									<i class="fa fa-phone"></i> 0334947474
								</p>
								<p>
									<i class="fa fa-envelope-o"></i> <a href="#">huytvde140135@fpt.edu.vn</a>
								</p>
							</div>
							<!-- <ul class="social-icon">
                                             <li><a href="#" class="fa fa-linkedin-square"></a></li>
                                             <li><a href="#" class="fa fa-envelope-o"></a></li>
                                        </ul> -->
						</div>

					</div>
				</div>

				<div class="col-md-4 col-sm-6">
					<div class="team-thumb wow fadeInUp center" style="width: 400px;" data-wow-delay="0.4s">
						<img src="<c:url value='/resources/images/2.jpg'/>"
							class="img-responsive1" alt="" />
						<div class="team-info">
							<h3>Nguyễn Thanh Thế</h3>
							<p>Trưởng khoa ngoại thần kinh</p>
							<div class="team-contact-info">
								<p>
									<i class="fa fa-phone"></i> 0913456777
								</p>
								<p>
									<i class="fa fa-envelope-o"></i> <a href="#">nguyenthanhthe6969@gmail.com</a>
								</p>
							</div>
							<!-- <ul class="social-icon">
                                             <li><a href="#" class="fa fa-facebook-square"></a></li>
                                             <li><a href="#" class="fa fa-envelope-o"></a></li>
                                             <li><a href="#" class="fa fa-flickr"></a></li>
                                        </ul> -->
						</div>

					</div>
				</div>

				<div class="col-md-4 col-sm-6">
					<div class="team-thumb wow fadeInUp right" style="width: 400px;" data-wow-delay="0.6s">
						<img src="<c:url value='/resources/images/4.jpg'/>"
							class="img-responsive1" alt="" />
						<div class="team-info">
							<h3>Ngô Mậu Việt Hoàng</h3>
							<p>Trưởng khoa tai mũi họng</p>
							<div class="team-contact-info">
								<p>
									<i class="fa fa-phone"></i> 0905226666
								</p>
								<p>
									<i class="fa fa-envelope-o"></i> <a href="#">ngomauviethoang6868@gmail.com</a>
								</p>
							</div>
							<!-- <ul class="social-icon">
                                             <li><a href="#" class="fa fa-twitter"></a></li>
                                             <li><a href="#" class="fa fa-envelope-o"></a></li>
                                        </ul> -->
						</div>

					</div>
				</div>

</div>

			</div>
		</div>
	</section>


	<!-- NEWS -->
	<section id="news" data-stellar-background-ratio="2.5">
		<div class="container">
			<div class="row">

				<div class="col-md-12 col-sm-12">
					<!-- SECTION TITLE -->
					<div class="section-title wow fadeInUp" data-wow-delay="0.1s">
						<h2>Tin mới nhất</h2>
					</div>
				</div>

				<div class="col-md-4 col-sm-6">
					<!-- NEWS THUMB -->
					<div class="news-thumb wow fadeInUp" data-wow-delay="0.4s">
						<a href="news-detail.jsp"> <img
							src="<c:url value='/resources/images/unname.jpg'/>"
							class="img-responsive" alt="" />
						</a>
						<div class="news-info">
							<span>June 30, 2021</span>
							<h3>
								<a
									href="news-detail-HƯỚNG+DẪN+KHAI+BÁO+Y+TẾ+ONLINE+TẠI+TRUNG+TÂM+Y+TẾ+QUẬN+NGŨ+HÀNH+SƠN">HƯỚNG
									DẪN KHAI BÁO Y TẾ ONLINE TẠI TRUNG TÂM Y TẾ QUẬN NGŨ HÀNH SƠN</a>
							</h3>
							<p>Để đảm bảo công tác khám chữa bệnh an toàn phòng chống
								dịch Covid-19 trong tình hình mới,Trung tâm y tế Quận Ngũ Hành
								Sơn tiếp tục triển khai hoạt động khai báo y tế online dành cho
								tất cả những ai đến bệnh viện.</p>
							<div class="author">
								<img src="<c:url value='/resources/images/3.jpg'/>"
									class="img-responsive" alt="" />
								<div class="author-info">
									<h5>Trương Văn Huy</h5>
									<p>Viện trưởng</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-md-4 col-sm-6">
					<!-- NEWS THUMB -->
					<div class="news-thumb wow fadeInUp" data-wow-delay="0.6s">
						<a href="news-detail2.jsp"> <img
							src="<c:url value='/resources/images/vssid.jpg'/>"
							class="img-responsive" alt="" />
						</a>
						<div class="news-info">
							<span>July 10, 2021</span>
							<h3>
								<a
									href="news-detail-NHỮNG+ĐIỀU+CẦN+BIẾT+KHI+SỬ+DỤNG+“VSSID–BẢO+HIỂM+XÃ+HỘI+SỐ">NHỮNG
									ĐIỀU CẦN BIẾT KHI SỬ DỤNG “VSSID – BẢO HIỂM XÃ HỘI SỐ”</a>
							</h3>
							<p>Nhằm hướng dẫn cá nhân, tổ chức cách sử dụng các tính
								năng, tiện ích của ứng dụng VssID-Bảo hiểm xã hội số trên nền
								tảng thiết bị di động, Cổng Thông tin điện tử BHXH Việt Nam giới
								thiệu “Những điều cần biết khi sử dụng ứng dụng “VssID- Bảo hiểm
								xã hội số”:</p>
							<div class="author">
								<img src="<c:url value='/resources/images/1.jpg'/>"
									class="img-responsive" alt="" />
								<div class="author-info">
									<h5>Trương Công Tráng</h5>
									<p>Bác sĩ da liễu</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-md-4 col-sm-6">
					<!-- NEWS THUMB -->
					<div class="news-thumb wow fadeInUp" data-wow-delay="0.8s">
						<a href="news-detail3.jsp"> <img
							src="<c:url value='/resources/images/113.jpg'/>"
							class="img-responsive" alt="" />
						</a>
						<div class="news-info">
							<span>July 09, 2021</span>
							<h3>
								<a
									href="news-detail-ĐÀ NẴNG–MITTING+KỶ+NIỆM+59+NĂM+NGÀY+DÂN+SỐ+VIỆT+NAM+(26/12/1961-26/12/2020)">ĐÀ
									NẴNG–KỶ NIỆM 59 NĂM NGÀY DÂN SỐ VIỆT NAM
									(26/12/1961-26/12/2020)</a>
							</h3>
							<p>Sáng ngày 09/07/2021, cuộc mitting trọng thể Kỷ niệm 59
								năm ngày dân số Việt Nam và hưởng ứng tháng hành động quốc gia
								về dân số diễn ra trên địa bàn quận Ngũ Hành Sơn. Đây là địa
								phương được UBND thành phố và Chi cục Dân số- Kế hoạch hóa gia
								đình thành phố Đà Nẵng chọn làm nơi tổ chức hoạt động này..</p>
							<div class="author">
								<img src="<c:url value='/resources/images/5.jpg'/>"
									class="img-responsive" alt="" />
								<div class="author-info">
									<h5>Nguyễn Văn Quảng</h5>
									<p>Nhân viên hành chính</p>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</section>


	<!-- MAKE AN APPOINTMENT -->
	<section id="appointment" data-stellar-background-ratio="3">
		<div class="container">
			<div class="row">

				<div class="col-md-6 col-sm-6">
					<img style="height: 510px; padding-left: 175px;" src="<c:url value='/resources/images/bs.jpg'/>"
						class="img-responsive" alt="" />
				</div>

				<div class="col-md-6 col-sm-6">
					<!-- CONTACT FORM HERE -->
					<form id="appointment-form" role="form" method="post" action="#">

						<!-- SECTION TITLE -->
						<div class="section-title wow fadeInUp" data-wow-delay="0.4s">
							<h2>Đặt lịch khám</h2>
						</div>

						<div class="wow fadeInUp" data-wow-delay="0.8s">
							<div class="col-md-6 col-sm-6">
								<label for="name">Họ và Tên</label> <input type="text"
									class="form-control" id="name" name="name"
									placeholder="Họ và tên">
							</div>

							<div class="col-md-6 col-sm-6">
								<label for="email">Email</label> <input type="email"
									class="form-control" id="email" name="email"
									placeholder="Email của bạn">
							</div>

							<div class="col-md-6 col-sm-6">
								<label for="date">Chọn lịch khám</label> <input type="date"
									name="date" value="" class="form-control">
							</div>

							<div class="col-md-6 col-sm-6">
								<label for="select">Chọn bộ phận</label> <select
									class="form-control">
									<option>Tổng quát</option>
									<option>Tai mũi họng</option>
									<option>Da liễu</option>
									<option>Răng hàm mặt</option>
									<option>Ung bước</option>
									<option>Khoa nhi</option>
								</select>
							</div>

							<div class="col-md-12 col-sm-12">
								<label for="telephone">Số điện thoại</label> <input type="tel"
									class="form-control" id="phone" name="phone"
									placeholder="Số điện thoại"> <label for="Message">Ghi
									chú bổ sung</label>
								<textarea class="form-control" rows="5" id="message"
									name="message" placeholder="Ghi chú"></textarea>
								<button type="submit" class="form-control" id="cf-submit"
									name="submit">Xác nhận</button>
							</div>
						</div>
					</form>
				</div>

			</div>
		</div>
	</section>


	<!-- GOOGLE MAP -->
	<section id="google-map">
		<!-- How to change your own map point
            1. Go to Google Maps
            2. Click on your location point
            3. Click "Share" and choose "Embed map" tab
            4. Copy only URL and paste it within the src="" field below
	-->

		<iframe
			src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3835.0955436655863!2d108.25551121480699!3d16.00854108891844!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x314210b333e30ecf%3A0xf66fc857cd93eb8e!2zQuG7h25oIHZp4buHbiDEkGEga2hvYSBOZ8WpIEjDoG5oIFPGoW4!5e0!3m2!1svi!2s!4v1624267740874!5m2!1svi!2s"
			width="100%" height="450" style="border: 0;" allowfullscreen=""
			loading="lazy"></iframe>
	</section>


	<!-- FOOTER -->
	<footer >
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
								<i class="fa fa-envelope-o"></i> <a href="#">ttytnhs@danang.gov.vn</a>
							</p>
						</div>
					</div>
				</div>

				<div class="col-md-4 col-sm-4">
					<div class="footer-thumb">
						<h4 class="wow fadeInUp" data-wow-delay="0.4s">Tin mới nhất</h4>
						<div class="latest-stories">
							<div class="stories-image">
								<a href="news-detail.jsp"><img
									src="<c:url value='/resources/images/unname.jpg'/>"
									class="img-responsive" alt="" /></a>
							</div>
							<div class="stories-info">
								<a
									href="news-detail-HƯỚNG+DẪN+KHAI+BÁO+Y+TẾ+ONLINE+TẠI+TRUNG+TÂM+Y+TẾ+QUẬN+NGŨ+HÀNH+SƠN"><h5>HƯỚNG
										DẪN KHAI BÁO Y TẾ ONLINE TẠI TRUNG TÂM Y TẾ QUẬN NGŨ HÀNH SƠN</h5></a>
								<span>June 30, 2021</span>
							</div>
						</div>

						<div class="latest-stories">
							<div class="stories-image">
								<a href="news-detail2.jsp"><img
									src="<c:url value='/resources/images/vssid.jpg'/>"
									class="img-responsive" alt="" /></a>
							</div>
							<div class="stories-info">
								<a
									href="news-detail-NHỮNG+ĐIỀU+CẦN+BIẾT+KHI+SỬ+DỤNG+“VSSID–BẢO+HIỂM+XÃ+HỘI+SỐ"><h5>NHỮNG
										ĐIỀU CẦN BIẾT KHI SỬ DỤNG “VSSID – BẢO HIỂM XÃ HỘI SỐ</h5></a> <span>July
									10, 2021</span>
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
								class="fa fa-facebook-square" attr="facebook icon"></a></li>
							<li><a href="https://twitter.com/" target="_blank"
								class="fa fa-twitter" attr="twitter icon"></a></li>
							<li><a href="https://www.instagram.com/" target="_blank"
								class="fa fa-instagram" attr="instagram icon"></a></li>
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

</body>
</html>