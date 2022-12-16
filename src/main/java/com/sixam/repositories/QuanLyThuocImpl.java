package com.sixam.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sixam.entities.Thuoc;

@Repository
public class QuanLyThuocImpl implements QuanLyThuocRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override

	public List<Thuoc> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Thuoc> thuoc = session.createQuery("SELECT a FROM Thuoc a", Thuoc.class).getResultList();
		return thuoc;
	}

	@Override
	public void saveOrUpdate(Thuoc thuoc) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(thuoc);

	}

}
