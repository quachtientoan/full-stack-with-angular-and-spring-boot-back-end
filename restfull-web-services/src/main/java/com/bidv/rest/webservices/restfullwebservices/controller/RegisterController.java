package com.bidv.rest.webservices.restfullwebservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bidv.rest.webservices.restfullwebservices.entity.UserEntity;
import com.bidv.rest.webservices.restfullwebservices.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegisterController {

	@Autowired
	UserService service;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/jpa/users/register")
	public ResponseEntity<HttpStatus> createUser(@RequestBody UserEntity user) {
		try {
			if (service.findByUsername(user.getUsername()) != null) {
				return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);

			}

			user.setPassword(passwordEncoder.encode(user.getPassword()));
			service.save(user);

			
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);

	}
}
