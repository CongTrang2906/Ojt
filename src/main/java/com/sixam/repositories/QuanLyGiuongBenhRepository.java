package com.sixam.repositories;

import java.util.List;

import com.sixam.entities.GiuongBenh;


public interface QuanLyGiuongBenhRepository {

	public List<GiuongBenh> findAll();
	public void saveOrUpdate(GiuongBenh giuongbenh);
}
