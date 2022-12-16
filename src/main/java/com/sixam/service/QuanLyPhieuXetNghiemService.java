package com.sixam.service;
import java.util.List;

import com.sixam.entities.PhieuXetNghiem;

public interface QuanLyPhieuXetNghiemService {
	public List<PhieuXetNghiem> findAll();
	
	public void saveOrUpdate(PhieuXetNghiem phieuxetnghiem);

}
