package com.valorant.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valorant.api.entity.Agent;
import com.valorant.api.repository.AgentRepository;

@Service
public class AgentService {
	@Autowired
	private AgentRepository agentRepository;

	public Agent saveAgent(Agent agent) {
		return this.agentRepository.save(agent);
	}

	public Agent getAgent(int id) {
		return this.agentRepository.findAgentById(id);
	}

	public Agent editAgent(Agent agent) {
		return this.agentRepository.save(agent);
	}

	public void deleteAgent(int id) {
		this.agentRepository.deleteById(id);
	}
	

}
