package com.olx.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olx.entity.StatusEntity;

public interface MasterStatusDataRepo extends JpaRepository<StatusEntity, Integer> {

}
