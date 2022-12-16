package com.sixam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixam.entities.LichLamViec;
import com.sixam.repositories.QuanLyLichLamViecRepository;


@Service
public class QuanLyLichLamViecServiceImpl implements QuanLyLichLamViecService {

	@Autowired
	private QuanLyLichLamViecRepository quanLyLichLamViec_NVHCRepository;

	@Override
	@Transactional
	public List<LichLamViec> findAll() {
		// TODO Auto-generated method stub
		return quanLyLichLamViec_NVHCRepository.findAll();
	}
	@Override
	@Transactional
	public void saveOrUpdate(LichLamViec lichlamviec) {
		// TODO Auto-generated method stub
		quanLyLichLamViec_NVHCRepository.saveOrUpdate(lichlamviec);
	}

}
