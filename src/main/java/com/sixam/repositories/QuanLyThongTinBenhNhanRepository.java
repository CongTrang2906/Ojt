package com.sixam.repositories;

import java.util.List;

import com.sixam.entities.BenhNhan;

public interface QuanLyThongTinBenhNhanRepository {

	public List<BenhNhan> findAll();

	public void saveOrUpdate(BenhNhan benhnhan);
}
