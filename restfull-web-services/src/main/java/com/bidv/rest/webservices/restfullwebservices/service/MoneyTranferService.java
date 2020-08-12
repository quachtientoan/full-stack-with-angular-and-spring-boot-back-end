
package com.bidv.rest.webservices.restfullwebservices.service;

import java.util.List;

import com.bidv.rest.webservices.restfullwebservices.entity.MoneyTranferEntity;

public interface MoneyTranferService {

	public List<MoneyTranferEntity> findAll();

	public MoneyTranferEntity create(MoneyTranferEntity entity);

}
