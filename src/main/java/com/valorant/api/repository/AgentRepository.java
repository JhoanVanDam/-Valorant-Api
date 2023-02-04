package com.valorant.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valorant.api.entity.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Integer> {
	Agent findAgentById(int id);

	
}
