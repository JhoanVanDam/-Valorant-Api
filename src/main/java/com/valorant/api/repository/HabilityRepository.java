package com.valorant.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valorant.api.entity.Hability;

@Repository
public interface HabilityRepository extends JpaRepository<Hability, Integer> {
	List<Hability> findByagentId(int agentId);
}
