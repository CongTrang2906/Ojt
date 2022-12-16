package com.sixam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sixam.entities.BenhAn;
import com.sixam.entities.BenhNhan;
import com.sixam.entities.GiuongBenh;
import com.sixam.entities.LichLamViec;
import com.sixam.entities.PhieuXetNghiem;
import com.sixam.entities.PhongBenh;
import com.sixam.service.QuanLyBenhAnService;
import com.sixam.service.QuanLyGiuongBenhService;
import com.sixam.service.QuanLyLichLamViecService;
import com.sixam.service.QuanLyPhieuXetNghiemService;
import com.sixam.service.QuanLyPhongBenhService;
import com.sixam.service.QuanLyThongTinBenhNhanService;

@Controller
public class BacSiController {
	@Autowired
	QuanLyThongTinBenhNhanService xemThongTinBenhNhan_BACSIService;
	@Autowired
	QuanLyPhongBenhService xemPhongBenh_BACSIService;
	@Autowired
	QuanLyGiuongBenhService xemGiuongBenh_BACSIService;
	@Autowired
	QuanLyPhieuXetNghiemService quanLyPhieuXetNghiemService;
	@Autowired
	QuanLyBenhAnService quanLyBenhAn_BACSIService;
	@Autowired
	QuanLyLichLamViecService xemLichLamViec_BACSIService;

	@RequestMapping("/Xem_Thong_Tin_Benh_Nhan_BacSi")
	public String xemthongtinbenhnhanbs(Model model) {
		List<BenhNhan> xttbn = xemThongTinBenhNhan_BACSIService.findAll();
		model.addAttribute("xttbn", xttbn);
		return "xemthongtinbenhnhan_BACSY.jsp";
	}

	@RequestMapping("/Xem_Phong_Benh_BACSI")
	public String quanLyPhongBenh_BACSI(Model model) {
		List<PhongBenh> xemphongbenh = xemPhongBenh_BACSIService.findAll();
		model.addAttribute("xemphongbenh", xemphongbenh);
		return "xemphongbenh_BACSY.jsp";
	}

	@RequestMapping("/Xem_Giuong_Benh_BACSI")
	public String quanLyGiuongBenh_BACSI(Model model) {
		List<GiuongBenh> xemgiuongbenh = xemGiuongBenh_BACSIService.findAll();
		model.addAttribute("xemgiuongbenh", xemgiuongbenh);
		return "xemgiuongbenh_BACSY.jsp";
	}

	@RequestMapping("/Quan_ly_Phieu_Xet_Nghiem_BACSI")
	public String quanLyPhieuXetNghiem(Model model) {
		List<PhieuXetNghiem> phieuxetnghiem = quanLyPhieuXetNghiemService.findAll();
		model.addAttribute("phieuxetnghiem", phieuxetnghiem);
		return "phieuxetnghiem_BACSI.jsp";
	}

	@RequestMapping("/Quan_Ly_Benh_An_BACSI")
	public String quanLyBenhAn_BACSI(Model model) {
		List<BenhAn> benhan = quanLyBenhAn_BACSIService.findAll();
		model.addAttribute("benhan", benhan);
		return "quanlybenhan_BACSY.jsp";
	}

	@RequestMapping("/Xem_Lich_Lam_Viec_BACSI")
	public String XemLichLamViec_BACSI(Model model) {
		List<LichLamViec> lichlamviec = xemLichLamViec_BACSIService.findAll();
		model.addAttribute("lichlamviec", lichlamviec);
		return "xemlichlamviec_BACSY.jsp";
	}

	@RequestMapping("/Them_Phieu_Xet_Nghiem_BACSI")
	public String showAddPhieuXetNghiem(Model model) {
		model.addAttribute("phieuxetnghiemForm", new PhieuXetNghiem());
		return "themphieuxetnghiem.jsp";
	}

	@RequestMapping(value = "/Quan_ly_Phieu_Xet_Nghiem_add", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public String addPhongBenh(@ModelAttribute(name = "phieuxetnghiemForm") PhieuXetNghiem phieuxetnghiem) {
		quanLyPhieuXetNghiemService.saveOrUpdate(phieuxetnghiem);
		return "redirect:/Quan_ly_Phieu_Xet_Nghiem_BACSI";
	}
	@RequestMapping("/Them_benh_an_BACSI")
	public String showAddBenhAn(Model model) {
		model.addAttribute("benhAnForm", new BenhAn());
		return  "thembenhan.jsp";
	}
	@RequestMapping(value = "/Quan_ly_Benh_An_BACSI_add", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public String addBenhAn(@ModelAttribute(name = "benhAnForm")BenhAn benhan) {
		quanLyBenhAn_BACSIService.saveOrUpdate(benhan);
		return "redirect:/Quan_Ly_Benh_An_BACSI";
	
       }
}
