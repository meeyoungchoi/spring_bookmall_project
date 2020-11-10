package com.bookkurly.bookmall.customer.register.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookkurly.bookmall.customer.register.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public Customer checkLogin(Customer login) {
		System.out.println("b");
		return sqlSession.selectOne("CustomerDAO.selectOne", login);
	}
	
	
	
	
	

}