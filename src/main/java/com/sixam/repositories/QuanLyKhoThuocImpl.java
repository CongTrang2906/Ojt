package com.sixam.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sixam.entities.KhoThuoc;


@Repository
public class QuanLyKhoThuocImpl implements QuanLyKhoThuocRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<KhoThuoc> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<KhoThuoc> khothuoc= session.createQuery("SELECT a FROM KhoThuoc a", KhoThuoc.class).getResultList(); 
		return khothuoc;
	}
	@Override
	public void saveOrUpdate(KhoThuoc khothuoc) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(khothuoc);
		
	}

}
