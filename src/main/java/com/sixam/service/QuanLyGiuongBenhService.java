package com.sixam.service;

import java.util.List;

import com.sixam.entities.GiuongBenh;


public interface QuanLyGiuongBenhService {

	public List<GiuongBenh> findAll();
	public void saveOrUpdate(GiuongBenh giuongbenh);
}
