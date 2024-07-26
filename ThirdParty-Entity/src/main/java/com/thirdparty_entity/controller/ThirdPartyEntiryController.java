package com.thirdparty_entity.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirdparty_entity.model.ThirdPartyEntity;
import com.thirdparty_entity.service.ThirdPartyService;

@RestController
@RequestMapping("/create")
public class ThirdPartyEntiryController {

	@Autowired
	private ThirdPartyService service;

	Logger LOGGER = LoggerFactory.getLogger(ThirdPartyEntiryController.class);

	@PostMapping("/customer")
	public ResponseEntity<Boolean> createCustomer(@RequestBody ThirdPartyEntity thirdPartyEntity) {
		service.addCustomer(thirdPartyEntity);
		LOGGER.info("Got Request From Enrollment Service with-> {}", thirdPartyEntity);
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
}
