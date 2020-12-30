package com.my.service;

import java.util.List;

import com.my.dao.CustomerDAO;
import com.my.dao.CustomerDAOList;
import com.my.exception.FindException;
import com.my.vo.Customer;

public class CustomerService {

	private CustomerDAO dao = new CustomerDAOList(3);
	public List<Customer> findAll() throws FindException {
			List<Customer> cAll = dao.selectAll();		
			return cAll;

	}

	}


