package com.bidv.rest.webservices.restfullwebservices.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidv.rest.webservices.restfullwebservices.entity.CustomerEntity;
import com.bidv.rest.webservices.restfullwebservices.entity.SourceAccountEntity;
import com.bidv.rest.webservices.restfullwebservices.repository.CustomerRepository;
import com.bidv.rest.webservices.restfullwebservices.repository.SourceAccountRepository;
import com.bidv.rest.webservices.restfullwebservices.service.CustomerService;
import com.bidv.rest.webservices.restfullwebservices.service.SourceAccountService;

@Service
public class SourceAccountServiceImpl implements SourceAccountService {

	@Autowired
	SourceAccountRepository repository;

	@Override
	public List<SourceAccountEntity> findAll() {
		return repository.findAll();
	}

//	@Override
//	public CustomerEntity create(CustomerEntity entity) {
//		return repository.save(entity);
//	}
//
//	@Override
//	public boolean delete(Integer cusId) {
//		CustomerEntity entity = findById(cusId);
//		if(entity != null) {
//			repository.delete(entity);
//			return true;
//		}
//		
//		return false;
//	}
//
//	@Override
//	public CustomerEntity findById(Integer id) {
//		// TODO Auto-generated method stub
//		return repository.findById(id).orElse(new CustomerEntity());
//	}
//
//	@Override
//	public CustomerEntity save(CustomerEntity customer) {
//		// TODO Auto-generated method stub
//		return repository.save(customer);
//	}

}
