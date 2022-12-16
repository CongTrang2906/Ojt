package com.sixam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixam.entities.PhongBenh;

import com.sixam.repositories.QuanLyPhongBenhRepository;

@Service
public class QuanLyPhongBenhServiceImpl implements QuanLyPhongBenhService {

	@Autowired
	private QuanLyPhongBenhRepository quanLyPhongBenhRepository;

	@Override
	@Transactional
	public List<PhongBenh> findAll() {
		// TODO Auto-generated method stub
		return quanLyPhongBenhRepository.findAll();
	}

	@Override
	@Transactional
	public void saveOrUpdate(PhongBenh phongbenh) {
		// TODO Auto-generated method stub
		quanLyPhongBenhRepository.saveOrUpdate(phongbenh);
	}
}
