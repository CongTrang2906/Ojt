package com.sixam.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sixam.entities.BenhNhan;
import com.sixam.entities.NhanVien;
import com.sixam.service.QuanLyNhanVienService;
import com.sixam.service.QuanLyThongTinBenhNhanService;
import com.sixam.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	QuanLyNhanVienService quanLyNhanVienService;
	@Autowired
	QuanLyThongTinBenhNhanService quanLyThongTinBenhNhan_NVHCService;
	@Autowired
	QuanLyThongTinBenhNhanService xemThongTinBenhNhan_YTaService;
	@Autowired
	QuanLyThongTinBenhNhanService xemThongTinBenhNhan_BACSIService;

	@RequestMapping("/Quan_ly_nhan_vien")
	public String login(Model model, HttpServletRequest request, HttpServletResponse response) {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		String accountInfo = null;
		HttpSession session = request.getSession();

		final int INVALID_ACCOUNT = 0;
		final int ADMIN_ACCOUNT = 1;
		final int NVHC_ACCOUNT = 2;
		final int YTA_ACCOUNT = 3;
		final int BACSI_ACCOUNT = 4;

		List<NhanVien> nhanVien = quanLyNhanVienService.findAll();
		model.addAttribute("nhanVien", nhanVien);

		List<BenhNhan> qlttbn = quanLyThongTinBenhNhan_NVHCService.findAll();
		model.addAttribute("qlttbn", qlttbn);

		List<BenhNhan> xttbn_yt = xemThongTinBenhNhan_YTaService.findAll();
		model.addAttribute("xttbn", xttbn_yt);

		List<BenhNhan> xttbn_bs = xemThongTinBenhNhan_BACSIService.findAll();
		model.addAttribute("xttbn", xttbn_bs);
		if (userService.getAccountRole(userName, password) == INVALID_ACCOUNT) {
			return "login.jsp?error=2";

		} else if (userService.getAccountRole(userName, password) == ADMIN_ACCOUNT) {
			accountInfo = "(Giám Đốc Bệnh Viện)";
			session.setAttribute("accountInfor", accountInfo);
			return "quanlynhanvien_GDBV.jsp";

		} else if (userService.getAccountRole(userName, password) == NVHC_ACCOUNT) {
			accountInfo = "(Nhân Viên Hành Chính)";
			session.setAttribute("accountInfor", accountInfo);
			return "quanlythongtinbenhnhan_NVHC.jsp";

		} else if (userService.getAccountRole(userName, password) == YTA_ACCOUNT) {
			accountInfo = "(Y Tá)";
			session.setAttribute("accountInfor", accountInfo);
			return "xemthongtinbenhnhan_YTA.jsp";

		} else if (userService.getAccountRole(userName, password) == BACSI_ACCOUNT) {
			accountInfo = "(Bác Sĩ)";
			session.setAttribute("accountInfor", accountInfo);
			return "xemthongtinbenhnhan_BACSY.jsp";
		}
		return "login.jsp?error=1";

	}

	@RequestMapping("/Logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "login.jsp?error=1";
	}

	@RequestMapping("Quan_ly_nhan_vien/Infor_NV")
	public String getAllInforNV(Model model) {
		List<NhanVien> nhanVien = quanLyNhanVienService.findAll();
		model.addAttribute("nhanVien", nhanVien);
		return "infor_nhanvien.jsp";
	}
}
