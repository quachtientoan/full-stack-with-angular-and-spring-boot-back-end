package com.bidv.rest.webservices.restfullwebservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bidv.rest.webservices.restfullwebservices.entity.CustomerEntity;

@Service
public interface CustomerService {

	public List<CustomerEntity> findAll();
	
	public CustomerEntity findById(Integer id);
	
	public CustomerEntity create(CustomerEntity entity);

	public boolean delete(Integer cusId);

	public CustomerEntity save(CustomerEntity customer);
}
