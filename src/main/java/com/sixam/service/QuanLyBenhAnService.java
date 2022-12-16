package com.sixam.service;
import java.util.List;

import com.sixam.entities.BenhAn;

public interface QuanLyBenhAnService {
	public List<BenhAn> findAll();
	public void saveOrUpdate(BenhAn benhan);
}
