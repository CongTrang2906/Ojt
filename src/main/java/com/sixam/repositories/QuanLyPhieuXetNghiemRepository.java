package com.sixam.repositories;

import java.util.List;

import com.sixam.entities.PhieuXetNghiem;

public interface QuanLyPhieuXetNghiemRepository {

	public List<PhieuXetNghiem> findAll();

	public void saveOrUpdate(PhieuXetNghiem phieuxetnghiem);

}
