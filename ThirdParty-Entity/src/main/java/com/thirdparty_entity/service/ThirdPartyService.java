package com.thirdparty_entity.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdparty_entity.model.ThirdPartyEntity;
import com.thirdparty_entity.repository.ThirdPartyRepository;

@Service
public class ThirdPartyService {
	Logger logger=LoggerFactory.getLogger(ThirdPartyEntity.class);

	@Autowired
	private ThirdPartyRepository thirdPartyRepo;
	
	public boolean addCustomer(ThirdPartyEntity entity) {
		thirdPartyRepo.save(entity);
		logger.info("ThirdPartyEntity-Service-> Entity Saved in Db Successfully");
		return true;
	}
}
