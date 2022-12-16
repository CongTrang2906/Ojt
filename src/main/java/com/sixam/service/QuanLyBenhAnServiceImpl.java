package com.sixam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixam.entities.BenhAn;
import com.sixam.repositories.QuanLyBenhAnRepository;

@Service
public class QuanLyBenhAnServiceImpl implements QuanLyBenhAnService {

	@Autowired
	private QuanLyBenhAnRepository quanLyBenhAnRepository;

	@Override
	@Transactional
	public List<BenhAn> findAll() {
		// TODO Auto-generated method stub
		return quanLyBenhAnRepository.findAll();
	}

	@Override
	@Transactional
	public void saveOrUpdate(BenhAn benhan) {
		// TODO Auto-generated method stub
		quanLyBenhAnRepository.saveOrUpdate(benhan);
	}
}
