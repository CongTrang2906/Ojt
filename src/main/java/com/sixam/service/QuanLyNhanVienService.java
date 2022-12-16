package com.sixam.service;

import java.util.List;

import com.sixam.entities.NhanVien;

public interface QuanLyNhanVienService {

	public List<NhanVien> findAll();
	
	public void saveOrUpdate(NhanVien nhanvien);
}
