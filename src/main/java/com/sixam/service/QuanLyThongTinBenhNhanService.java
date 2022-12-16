package com.sixam.service;

import java.util.List;

import com.sixam.entities.BenhNhan;

public interface QuanLyThongTinBenhNhanService {

	public List<BenhNhan> findAll();

	public void saveOrUpdate(BenhNhan benhnhan);
}
