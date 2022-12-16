package com.sixam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixam.entities.NhanVien;
import com.sixam.repositories.QuanLyNhanVienRepository;

@Service
public class QuanLyNhanVienServiceImpl implements QuanLyNhanVienService {

	@Autowired
	private QuanLyNhanVienRepository quanLyNhanVienRepository;

	@Override
	@Transactional
	public List<NhanVien> findAll() {
		// TODO Auto-generated method stub
		System.out.println(quanLyNhanVienRepository.findAll());
		return quanLyNhanVienRepository.findAll();
	}

	@Override
	@Transactional
	public void saveOrUpdate(NhanVien nhanvien) {
		// TODO Auto-generated method stub
		quanLyNhanVienRepository.saveOrUpdate(nhanvien);
	}

}
