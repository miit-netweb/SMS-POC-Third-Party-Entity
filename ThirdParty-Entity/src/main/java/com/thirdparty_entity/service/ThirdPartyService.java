package com.thirdparty_entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdparty_entity.model.ThirdPartyEntity;
import com.thirdparty_entity.repository.ThirdPartyRepository;

@Service
public class ThirdPartyService {

	@Autowired
	private ThirdPartyRepository thirdPartyRepo;
	
	public boolean addCustomer(ThirdPartyEntity entity) {
		thirdPartyRepo.save(entity);
		return true;
	}
}
