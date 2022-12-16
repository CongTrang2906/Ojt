package com.sixam.repositories;

import java.util.List;


import com.sixam.entities.PhongBenh;


public interface QuanLyPhongBenhRepository {

	public List<PhongBenh> findAll();
	public void saveOrUpdate(PhongBenh phongbenh);
}
