package com.bidv.rest.webservices.restfullwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bidv.rest.webservices.restfullwebservices.entity.MoneyTranferEntity;
import com.bidv.rest.webservices.restfullwebservices.entity.MoneyTranferView;
import com.bidv.rest.webservices.restfullwebservices.service.MoneyTranferService;
import com.bidv.rest.webservices.restfullwebservices.service.MoneyTranferViewService;

@RestController()
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class MoneyTranferController {

	@Autowired
	MoneyTranferService service;
	
	MoneyTranferViewService viewService;

//	@GetMapping("/api/user/{username}/money-tranfer")
//	public List<MoneyTranferView> getAll(@PathVariable("username") String username) {
//		System.out.println("=====> " + viewService.findAll());
//		return viewService.findAll();
//	}
	
	@GetMapping("/api/user/{username}/money-tranfer")
	public List<MoneyTranferEntity> getAll(@PathVariable("username") String username) {
		System.out.println("=====> " + service.findAll());
		return service.findAll();
	}

	@PostMapping("/api/user/{username}/money-tranfer")
	public MoneyTranferEntity create(@PathVariable("username") String username,
			@RequestBody MoneyTranferEntity entity) {
		return service.create(entity);
	}

}
