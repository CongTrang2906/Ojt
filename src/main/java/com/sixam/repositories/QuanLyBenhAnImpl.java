package com.sixam.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sixam.entities.BenhAn;


@Repository
public class QuanLyBenhAnImpl implements QuanLyBenhAnRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<BenhAn> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<BenhAn> benhan = session.createQuery("SELECT a FROM BenhAn a", BenhAn.class).getResultList(); 
		return benhan;
	}
	@Override
	public void saveOrUpdate(BenhAn benhan) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(benhan);
		
	}
}
