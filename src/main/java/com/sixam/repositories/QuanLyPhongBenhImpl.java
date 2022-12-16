package com.sixam.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sixam.entities.PhongBenh;

@Repository
public class QuanLyPhongBenhImpl implements QuanLyPhongBenhRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<PhongBenh> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<PhongBenh> phongbenh = session.createQuery("SELECT a FROM PhongBenh a", PhongBenh.class).getResultList();
		return phongbenh;
	}

	@Override
	public void saveOrUpdate(PhongBenh phongbenh) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(phongbenh);
		
	}


}
