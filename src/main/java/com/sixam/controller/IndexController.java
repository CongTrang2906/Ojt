package com.sixam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}

	@RequestMapping("/news-detail-HƯỚNG+DẪN+KHAI+BÁO+Y+TẾ+ONLINE+TẠI+TRUNG+TÂM+Y+TẾ+QUẬN+NGŨ+HÀNH+SƠN")
	public String newDetail1() {
		return "news-detail.jsp";
	}

	@RequestMapping("/news-detail-NHỮNG+ĐIỀU+CẦN+BIẾT+KHI+SỬ+DỤNG+“VSSID–BẢO+HIỂM+XÃ+HỘI+SỐ")
	public String newDetail2() {
		return "news-detail2.jsp";
	}

	@RequestMapping("/news-detail-ĐÀ NẴNG–MITTING+KỶ+NIỆM+59+NĂM+NGÀY+DÂN+SỐ+VIỆT+NAM+(26/12/1961-26/12/2020)")
	public String newDetail3() {
		return "news-detail3.jsp";
	}

	@RequestMapping("/index")
	public String returned() {
		return "index.jsp";
	}
}
