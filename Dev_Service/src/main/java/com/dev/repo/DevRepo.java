package com.dev.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.model.Dev;

@Repository
public interface DevRepo extends JpaRepository<Dev, Integer>{

}
