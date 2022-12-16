package com.sixam.service;

import java.util.List;


import com.sixam.entities.PhongBenh;


public interface QuanLyPhongBenhService {

	public List<PhongBenh> findAll();
	public void saveOrUpdate(PhongBenh phongbenh);
}
