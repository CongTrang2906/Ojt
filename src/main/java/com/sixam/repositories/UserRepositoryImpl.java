package com.sixam.repositories;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sixam.entities.Account;
import com.sixam.entities.Role;



@Repository
public class UserRepositoryImpl implements UserRepository {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Account getAccountRole(String userName) {
		// TODO Auto-generated method stub
		Session session = null;
		 
        try {
            session = sessionFactory.openSession();
            List<Account> users = new ArrayList<Account>();
            users =session.createQuery("from Account where userName=?").setParameter(0, userName).list();
            if (users.size() > 0) {
                return users.get(0);
            }else
            	return null;
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Role getAccountRole(int roleId) {
		// TODO Auto-generated method stub
		Session session = null;
		 
        try {
            session = sessionFactory.openSession();
            List<Role> role = new ArrayList<Role>();
            role =session.createQuery("from Role where roleID=?").setParameter(0, roleId).list();
            if (role.size() > 0) {
            	System.out.println("hahaha");
                return role.get(0);
            }else
            	return null;
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


}
