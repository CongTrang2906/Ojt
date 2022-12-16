package com.sixam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixam.entities.KhoThuoc;
import com.sixam.repositories.QuanLyKhoThuocRepository;

@Service
public class QuanLyKhoThuocServiceImpl implements QuanLyKhoThuocService {

	@Autowired
	private QuanLyKhoThuocRepository quanLyKhoThuoc_NVHCRepository;

	@Override
	@Transactional
	public List<KhoThuoc> findAll() {
		// TODO Auto-generated method stub
		return quanLyKhoThuoc_NVHCRepository.findAll();
	}

	@Override
	@Transactional
	public void saveOrUpdate(KhoThuoc khothuoc) {
		// TODO Auto-generated method stub
		quanLyKhoThuoc_NVHCRepository.saveOrUpdate(khothuoc);
	}
}
