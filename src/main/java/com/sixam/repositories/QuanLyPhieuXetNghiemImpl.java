package com.sixam.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sixam.entities.PhieuXetNghiem;


@Repository
public class QuanLyPhieuXetNghiemImpl implements QuanLyPhieuXetNghiemRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<PhieuXetNghiem> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<PhieuXetNghiem> phieuxetnghiem = session.createQuery("SELECT a FROM PhieuXetNghiem a", PhieuXetNghiem.class).getResultList(); 
		return phieuxetnghiem;
	}
	@Override
	public void saveOrUpdate(PhieuXetNghiem phieuxetnghiem) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(phieuxetnghiem);
		
	}

}
