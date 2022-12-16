package com.sixam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sixam.entities.BenhNhan;
import com.sixam.entities.GiuongBenh;
import com.sixam.entities.KhoThuoc;
import com.sixam.entities.LichLamViec;
import com.sixam.entities.PhongBenh;
import com.sixam.entities.Thuoc;
import com.sixam.service.QuanLyGiuongBenhService;
import com.sixam.service.QuanLyKhoThuocService;
import com.sixam.service.QuanLyLichLamViecService;
import com.sixam.service.QuanLyPhongBenhService;
import com.sixam.service.QuanLyThongTinBenhNhanService;
import com.sixam.service.QuanLyThuocService;

@Controller
public class NhanVienHanhChinhController {
	@Autowired
	QuanLyThongTinBenhNhanService quanLyThongTinBenhNhan_NVHCService;
	@Autowired
	QuanLyGiuongBenhService quanLyGiuongBenh_NVHCService;
	@Autowired
	QuanLyThuocService quanLyThuocService;
	@Autowired
	QuanLyPhongBenhService quanLyPhongBenh_NVHCService;
	@Autowired
	QuanLyLichLamViecService quanLyLichLamViec_NVHCService;
	@Autowired
	QuanLyKhoThuocService quanLyKhoThuoc_NVHCService;

	@RequestMapping("/Quan_Ly_Thong_Tin_Benh_Nhan_NVHC")
	public String getAllInforTTBN(Model model) {
		List<BenhNhan> qlttbn = quanLyThongTinBenhNhan_NVHCService.findAll();
		model.addAttribute("qlttbn", qlttbn);
		return "quanlythongtinbenhnhan_NVHC.jsp";

	}

	@RequestMapping("/Quan_Ly_Kho_Thuoc_NVHC")
	public String getAllInforKT(Model model) {
		List<KhoThuoc> Khothuoc = quanLyKhoThuoc_NVHCService.findAll();
		model.addAttribute("Khothuoc", Khothuoc);
		return "quanlykhothuoc_NVHC.jsp";
	}

	@RequestMapping("/Quan_Ly_Thuoc_NVHC")
	public String getAllInforT(Model model) {
		List<Thuoc> thuoc = quanLyThuocService.findAll();
		model.addAttribute("thuoc", thuoc);
		return "quanlythuoc_NVHC.jsp";
	}

	@RequestMapping("/Quan_ly_Phong_Benh_NVHC")
	public String getAllInforPB(Model model) {
		List<PhongBenh> phongbenh = quanLyPhongBenh_NVHCService.findAll();
		model.addAttribute("phongbenh", phongbenh);
		return "quanlyphongbenh_NVHC.jsp";
	}

	@RequestMapping("/Quan_ly_giuong_Benh_NVHC")
	public String getAllInforGB(Model model) {
		List<GiuongBenh> giuongBenh = quanLyGiuongBenh_NVHCService.findAll();
		model.addAttribute("giuongBenh", giuongBenh);
		return "quanlygiuongbenh_NVHC.jsp";
	}

	@RequestMapping("/Quan_ly_Lich_Lam_Viec_NVHC")
	public String getAllInforLLV(Model model) {

		List<LichLamViec> lichLamViec = quanLyLichLamViec_NVHCService.findAll();
		model.addAttribute("lichLamViec", lichLamViec);
		return "quanlylichlamviec_NVHC.jsp";
	}

	@RequestMapping("/Them_Thuoc_NVHC")
	public String showAddThuoc(Model model) {
		model.addAttribute("ThuocForm", new Thuoc());
		return "themthuoc.jsp";
	}

	@RequestMapping(value = "/Quan_ly_Thuoc_add", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public String addThuoc(@ModelAttribute(name = "ThuocForm") Thuoc thuoc) {
		quanLyThuocService.saveOrUpdate(thuoc);
		return "redirect:/Quan_Ly_Thuoc_NVHC";
	}

	@RequestMapping("/Them_Kho_Thuoc_NVHC")
	public String showAddKhoThuoc(Model model) {
		model.addAttribute("KhoThuocForm", new KhoThuoc());
		return "themthuocvaokho.jsp";
	}

	@RequestMapping(value = "/Quan_ly_Kho_Thuoc_add", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public String addKhoThuoc(@ModelAttribute(name = "KhoThuocForm") KhoThuoc khothuoc) {
		quanLyKhoThuoc_NVHCService.saveOrUpdate(khothuoc);
		return "redirect:/Quan_Ly_Kho_Thuoc_NVHC";
	}

	@RequestMapping("/Them_giuong_benh_NVHC")
	public String showAddGiuongBenh(Model model) {
		model.addAttribute("giuongBenhForm", new GiuongBenh());
		return "themgiuongbenh.jsp";
	}

	@RequestMapping(value = "/Quan_ly_giuong_benh_add", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public String addGiuongBenh(@ModelAttribute(name = "giuongBenhForm") GiuongBenh giuongbenh) {
		quanLyGiuongBenh_NVHCService.saveOrUpdate(giuongbenh);
		return "redirect:/Quan_ly_giuong_Benh_NVHC";
	}

	@RequestMapping("/Them_phong_benh_NVHC")
	public String showAddPhongBenh(Model model) {
		model.addAttribute("phongBenhForm", new PhongBenh());
		return "themphongbenh.jsp";
	}

	@RequestMapping(value = "/Quan_ly_phong_benh_add", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public String addPhongBenh(@ModelAttribute(name = "phongBenhForm") PhongBenh phongbenh) {
		quanLyPhongBenh_NVHCService.saveOrUpdate(phongbenh);
		return "redirect:/Quan_ly_Phong_Benh_NVHC";
	}
	@RequestMapping("/Them_lich_lam_viec_NVHC")
	public String showAddLichLamViec(Model model) {
		model.addAttribute("lichlamViecForm", new LichLamViec());
		return  "themlichlamviec.jsp";
	}
	
	@RequestMapping(value = "/Quan_ly_Lich_Lam_Viec_add", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public String addLichLamViec(@ModelAttribute(name = "lichlamViecForm")LichLamViec lichlamviec) {
		quanLyLichLamViec_NVHCService.saveOrUpdate(lichlamviec);
		return "redirect:/Quan_ly_Lich_Lam_Viec_NVHC";
	}
	@RequestMapping("/Them_benh_nhan_NVHC")
	public String showAddBenhNhan(Model model) {
		model.addAttribute("benhNhanForm", new BenhNhan());
		return  "thembenhnhan.jsp";
	}
	@RequestMapping(value = "/Quan_ly_benh_nhan_add", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public String addLichLamViec(@ModelAttribute(name = "benhNhanForm")BenhNhan benhnhan) {
		quanLyThongTinBenhNhan_NVHCService.saveOrUpdate(benhnhan);
		return "redirect:/Quan_Ly_Thong_Tin_Benh_Nhan_NVHC";
	}
}
