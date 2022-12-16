package com.sixam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixam.entities.GiuongBenh;
import com.sixam.repositories.QuanLyGiuongBenhRepository;

@Service
public class QuanLyGiuongBenhServiceImpl implements QuanLyGiuongBenhService {

	@Autowired
	private QuanLyGiuongBenhRepository quanLyGiuongBenh_NVHCRepository;

	@Override
	@Transactional
	public List<GiuongBenh> findAll() {
		// TODO Auto-generated method stub
		return quanLyGiuongBenh_NVHCRepository.findAll();
	}

	@Override
	@Transactional
	public void saveOrUpdate(GiuongBenh giuongbenh) {
		// TODO Auto-generated method stub
		quanLyGiuongBenh_NVHCRepository.saveOrUpdate(giuongbenh);
	}
}
