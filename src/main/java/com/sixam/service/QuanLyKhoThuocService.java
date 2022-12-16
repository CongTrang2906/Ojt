package com.sixam.service;

import java.util.List;

import com.sixam.entities.KhoThuoc;


public interface QuanLyKhoThuocService {

	public List<KhoThuoc> findAll();
	public void saveOrUpdate(KhoThuoc khothuoc);
}
