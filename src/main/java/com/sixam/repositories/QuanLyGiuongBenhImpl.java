package com.sixam.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sixam.entities.GiuongBenh;

@Repository
public class QuanLyGiuongBenhImpl implements QuanLyGiuongBenhRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<GiuongBenh> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<GiuongBenh> giuongbenh = session.createQuery("SELECT a FROM GiuongBenh a", GiuongBenh.class)
				.getResultList();
		return giuongbenh;
	}

	@Override
	public void saveOrUpdate(GiuongBenh giuongbenh) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(giuongbenh);

	}

}
