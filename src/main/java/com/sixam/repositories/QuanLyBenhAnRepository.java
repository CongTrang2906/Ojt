package com.sixam.repositories;

import java.util.List;

import com.sixam.entities.BenhAn;

public interface QuanLyBenhAnRepository {

	public List<BenhAn> findAll();

	public void saveOrUpdate(BenhAn benhan);
}
