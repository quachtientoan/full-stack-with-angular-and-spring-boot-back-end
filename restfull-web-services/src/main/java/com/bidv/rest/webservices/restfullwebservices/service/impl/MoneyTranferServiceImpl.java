package com.bidv.rest.webservices.restfullwebservices.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidv.rest.webservices.restfullwebservices.entity.MoneyTranferEntity;
import com.bidv.rest.webservices.restfullwebservices.repository.MoneyTranferRepository;
import com.bidv.rest.webservices.restfullwebservices.service.MoneyTranferService;

@Service
public class MoneyTranferServiceImpl implements MoneyTranferService {

	@Autowired
	MoneyTranferRepository repository;

	@Override
	public List<MoneyTranferEntity> findAll() {
		return repository.findAll();
	}

	@Override
	public MoneyTranferEntity create(MoneyTranferEntity entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

}
