package com.sixam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixam.entities.PhieuXetNghiem;
import com.sixam.repositories.QuanLyPhieuXetNghiemRepository;

@Service
public class QuanLyPhieuXetNghiemServiceImpl implements QuanLyPhieuXetNghiemService {

	@Autowired
	private QuanLyPhieuXetNghiemRepository quanLyPhieuXetNghiemRepository;

	@Override
	@Transactional
	public List<PhieuXetNghiem> findAll() {
		// TODO Auto-generated method stub
		return quanLyPhieuXetNghiemRepository.findAll();
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(PhieuXetNghiem phieuxetnghiem) {
		// TODO Auto-generated method stub
		quanLyPhieuXetNghiemRepository.saveOrUpdate(phieuxetnghiem);
	}

}
