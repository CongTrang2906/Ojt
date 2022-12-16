package com.sixam.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sixam.entities.BenhNhan;

@Repository
public class QuanLyThongTinBenhNhanImpl implements QuanLyThongTinBenhNhanRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<BenhNhan> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<BenhNhan> nhanvien= session.createQuery("SELECT a FROM BenhNhan a", BenhNhan.class).getResultList(); 
		System.out.println(nhanvien);
		return nhanvien;
	}

	@Override
	public void saveOrUpdate(BenhNhan benhnhan) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(benhnhan);
	}

}
