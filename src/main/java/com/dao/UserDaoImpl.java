package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.model.MyUser;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	public List<MyUser> getUsers() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<MyUser> users= em.createQuery("SELECT u from MyUser u").getResultList();
		return users;
	}

}
