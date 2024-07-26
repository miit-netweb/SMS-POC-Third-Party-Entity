package com.thirdparty_entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thirdparty_entity.model.ThirdPartyEntity;

public interface ThirdPartyRepository extends JpaRepository<ThirdPartyEntity, Long> {

}
