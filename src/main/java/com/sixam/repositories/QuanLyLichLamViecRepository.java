package com.sixam.repositories;

import java.util.List;

import com.sixam.entities.LichLamViec;




public interface QuanLyLichLamViecRepository {

	public List<LichLamViec> findAll();
	public void saveOrUpdate(LichLamViec lichlamviec);
}
