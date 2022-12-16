package com.sixam.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sixam.entities.NhanVien;

@Repository
public class QuanLyNhanVienImpl implements QuanLyNhanVienRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<NhanVien> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<NhanVien> nhanvien= session.createQuery("SELECT a FROM NhanVien a", NhanVien.class).getResultList(); 
		return nhanvien;
	}

	@Override
	public void saveOrUpdate(NhanVien nhanvien) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(nhanvien);
		
	}

}
