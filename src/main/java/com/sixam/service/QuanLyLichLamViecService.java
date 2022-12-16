package com.sixam.service;

import java.util.List;

import com.sixam.entities.LichLamViec;


public interface QuanLyLichLamViecService {

	public List<LichLamViec> findAll();
	public void saveOrUpdate(LichLamViec lichlammviec);
}
