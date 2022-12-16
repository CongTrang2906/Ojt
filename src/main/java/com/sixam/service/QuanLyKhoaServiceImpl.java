package com.sixam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sixam.entities.Khoa;
import com.sixam.repositories.QuanLyKhoaRepository;


@Service
public class QuanLyKhoaServiceImpl implements QuanLyKhoaService {

	@Autowired
	private QuanLyKhoaRepository quanLyKhoaRepository;

	@Override
	@Transactional
	public List<Khoa> findAll() {
		// TODO Auto-generated method stub
		return quanLyKhoaRepository.findAll();
	}

}
