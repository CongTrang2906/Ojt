package com.sixam.repositories;

import java.util.List;

import com.sixam.entities.KhoThuoc;


public interface QuanLyKhoThuocRepository {

	public List<KhoThuoc> findAll();
	public void saveOrUpdate(KhoThuoc khothuoc);
}
