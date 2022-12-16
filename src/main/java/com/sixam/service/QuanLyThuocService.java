package com.sixam.service;
import java.util.List;

import com.sixam.entities.Thuoc;

public interface QuanLyThuocService {
	public List<Thuoc> findAll();
	public void saveOrUpdate(Thuoc thuoc);
}
