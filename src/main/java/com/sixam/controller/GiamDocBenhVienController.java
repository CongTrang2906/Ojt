package com.sixam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sixam.entities.BenhAn;
import com.sixam.entities.Khoa;
import com.sixam.entities.NhanVien;
import com.sixam.service.QuanLyBenhAnService;
import com.sixam.service.QuanLyKhoaService;
import com.sixam.service.QuanLyNhanVienService;

@Controller
public class GiamDocBenhVienController {

	@Autowired
	QuanLyNhanVienService quanLyNhanVienService;
	@Autowired
	QuanLyBenhAnService quanLyBenhAnService;
	@Autowired
	QuanLyKhoaService quanLyKhoaService;

	@RequestMapping("/Quan_ly_nhan_vien_GDBV")
	public String quanLyNhanVien(Model model) {
		List<NhanVien> nhanVien = quanLyNhanVienService.findAll();
		model.addAttribute("nhanVien", nhanVien);
		return "quanlynhanvien_GDBV.jsp";
	}

	@RequestMapping("/Quan_ly_Khoa_GDBV")
	public String getAllInforK(Model model) {
		List<Khoa> Khoa = quanLyKhoaService.findAll();
		model.addAttribute("Khoa", Khoa);
		return "quanlykhoa_GDBV.jsp";
	}

	@RequestMapping("/Quan_ly_benh_an_GDBV")
	public String quanLyBenhAn(Model model) {
		List<BenhAn> benhan = quanLyBenhAnService.findAll();
		model.addAttribute("benhan", benhan);
		return "quanlybenhan_GDBV.jsp";
	}

	@RequestMapping("/Them_nhan_vien_GDBV")
	public String showAddNhanVien(Model model) {
		model.addAttribute("nhanVienForm", new NhanVien());
		return "themnhanvien.jsp";
	}

	@RequestMapping(value = "/Quan_ly_nhan_vien_add", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public String addNhanVien(@ModelAttribute(name = "nhanVienForm") NhanVien nhanvien) {
		quanLyNhanVienService.saveOrUpdate(nhanvien);
		return "redirect:/Quan_ly_nhan_vien_GDBV";
	}

	@RequestMapping("/Them_benh_an_GDBV")
	public String showAddBenhAn(Model model) {
		model.addAttribute("benhAnForm1", new BenhAn());
		return "thembenhan1.jsp";
	}

	@RequestMapping(value = "/Quan_ly_Benh_An_GDBV_add", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public String addBenhAn(@ModelAttribute(name = "benhAnForm1") BenhAn benhan) {
		quanLyBenhAnService.saveOrUpdate(benhan);
		return "redirect:/Quan_ly_benh_an_GDBV";
	}
}
