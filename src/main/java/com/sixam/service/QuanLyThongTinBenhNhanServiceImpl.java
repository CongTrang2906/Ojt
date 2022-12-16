package com.sixam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixam.entities.BenhNhan;
import com.sixam.repositories.QuanLyThongTinBenhNhanRepository;

@Service
public class QuanLyThongTinBenhNhanServiceImpl implements QuanLyThongTinBenhNhanService {

	@Autowired
	private QuanLyThongTinBenhNhanRepository quanLyThongTinBenhNhan_HVHCRepository;

	@Override
	@Transactional
	public List<BenhNhan> findAll() {
		// TODO Auto-generated method stub
		return quanLyThongTinBenhNhan_HVHCRepository.findAll();
	}

	@Override
	@Transactional
	public void saveOrUpdate(BenhNhan benhnhan) {
		// TODO Auto-generated method stub
		quanLyThongTinBenhNhan_HVHCRepository.saveOrUpdate(benhnhan);
	}

	

}
