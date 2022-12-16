package com.sixam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixam.entities.Thuoc;
import com.sixam.repositories.QuanLyThuocRepository;

@Service
public class QuanLyThuocServiceImpl implements QuanLyThuocService {

	@Autowired
	private QuanLyThuocRepository quanLyThuocRepository;

	@Override
	@Transactional
	public List<Thuoc> findAll() {
		// TODO Auto-generated method stub
		return quanLyThuocRepository.findAll();
	}

	@Override
	@Transactional
	public void saveOrUpdate(Thuoc thuoc) {
		// TODO Auto-generated method stub
		quanLyThuocRepository.saveOrUpdate(thuoc);
	}
}
