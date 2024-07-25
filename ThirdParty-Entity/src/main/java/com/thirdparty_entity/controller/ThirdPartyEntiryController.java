package com.thirdparty_entity.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirdparty_entity.dto.ThirdPartyEntityDto;

@RestController
@RequestMapping("/create")
public class ThirdPartyEntiryController {
	
	Logger LOGGER=LoggerFactory.getLogger(ThirdPartyEntiryController.class);

	@PostMapping("/customer")
	public ResponseEntity<Boolean> createCustomer(@RequestBody ThirdPartyEntityDto thirdPartyEntityDto){
		//TODO need to implement service method and call here
		LOGGER.info("Got Request From Enrollment Service with-> {}"+thirdPartyEntityDto);
		return new ResponseEntity<>(true,HttpStatus.OK);
	}
}
