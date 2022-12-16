package com.sixam.repositories;

import java.util.List;

import com.sixam.entities.Thuoc;

public interface QuanLyThuocRepository {

	public List<Thuoc> findAll();
	public void saveOrUpdate(Thuoc thuoc);
}
