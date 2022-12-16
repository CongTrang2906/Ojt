package com.sixam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sixam.entities.BenhAn;
import com.sixam.entities.BenhNhan;
import com.sixam.entities.GiuongBenh;
import com.sixam.entities.LichLamViec;
import com.sixam.entities.PhongBenh;
import com.sixam.service.QuanLyBenhAnService;
import com.sixam.service.QuanLyGiuongBenhService;
import com.sixam.service.QuanLyLichLamViecService;
import com.sixam.service.QuanLyPhongBenhService;
import com.sixam.service.QuanLyThongTinBenhNhanService;

@Controller
public class YTaController {
	@Autowired
	QuanLyThongTinBenhNhanService xemThongTinBenhNhan_YTaService;
	@Autowired
	QuanLyPhongBenhService xemPhongBenh_YTAService;
	@Autowired
	QuanLyGiuongBenhService xemGiuongBenh_YTAService;
	@Autowired
	QuanLyBenhAnService xemBenhAn_YTAService;
	@Autowired
	QuanLyLichLamViecService xemLichLamViec_YTAService;
	
	@RequestMapping("/Xem_Thong_Tin_Benh_Nhan_YTA")
	public String xemthongtinbenhnhanyta(Model model) {
		List<BenhNhan> xttbn = xemThongTinBenhNhan_YTaService.findAll();
		model.addAttribute("xttbn", xttbn);
		return "xemthongtinbenhnhan_YTA.jsp";
	}
	@RequestMapping("/Xem_Phong_Benh_YTA")
	public String quanLyPhongBenh_YTA(Model model) {
		List<PhongBenh> xemphongbenh = xemPhongBenh_YTAService.findAll();
		model.addAttribute("xemphongbenh", xemphongbenh);
		return "xemphongbenh_YTA.jsp";
	}
	@RequestMapping("/Xem_Giuong_Benh_YTA")
	public String XemLyGiuongBenh_YTA(Model model) {
		List<GiuongBenh> xemgiuongbenh = xemGiuongBenh_YTAService.findAll();
		model.addAttribute("xemgiuongbenh", xemgiuongbenh);
		return "xemgiuongbenh_YTA.jsp";
	}
	@RequestMapping("/Xem_Benh_An_YTA")
	public String quanLyBenhAn_YTA(Model model) {
		List<BenhAn> benhan = xemBenhAn_YTAService.findAll();
		model.addAttribute("benhan", benhan);
		return "xembenhan_YTA.jsp";
	}
	@RequestMapping("/Lich_Lam_Viec_YTA")
	public String LichLamViec_BACSI(Model model) {
		List<LichLamViec> lichlamviec = xemLichLamViec_YTAService.findAll();
		model.addAttribute("lichlamviec", lichlamviec);
		return "xemlichlamviec_YTA.jsp";
	}
	
}
