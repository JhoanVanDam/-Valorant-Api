package com.valorant.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valorant.api.entity.Map;

@Repository
public interface MapRepository extends JpaRepository<Map, Integer>{

}
