package com.sixam.repositories;

import java.util.List;

import com.sixam.entities.NhanVien;

public interface QuanLyNhanVienRepository {

	public List<NhanVien> findAll();
	public void saveOrUpdate(NhanVien nhanvien);
}
