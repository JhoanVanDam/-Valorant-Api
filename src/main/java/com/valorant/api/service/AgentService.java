package com.valorant.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valorant.api.entity.Agent;
import com.valorant.api.entity.Hability;
import com.valorant.api.repository.AgentRepository;

@Service
public class AgentService {
	@Autowired
	private AgentRepository agentRepository;

	public List<Agent> getAllAgents() {
		return this.agentRepository.findAll();
	}

	public Agent getAgent(int id) {
		return this.agentRepository.findAgentById(id);
	}
	

}
