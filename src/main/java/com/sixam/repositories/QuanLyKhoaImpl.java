package com.sixam.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sixam.entities.Khoa;
@Repository
public class QuanLyKhoaImpl implements QuanLyKhoaRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Khoa> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Khoa> quanlykhoa= session.createQuery("SELECT a FROM Khoa a", Khoa.class).getResultList(); 
		return quanlykhoa;
	}

}
