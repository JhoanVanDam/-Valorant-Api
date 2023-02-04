package com.valorant.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valorant.api.entity.Hability;
import com.valorant.api.repository.HabilityRepository;

@Service
public class HabiltyService {
	@Autowired
	private HabilityRepository habilityRepository;

	public Hability getHability(int id) {
		return this.habilityRepository.findById(id).orElse(null);
	}

	public List<Hability> getAllHabilitys() {
		return this.habilityRepository.findAll();
	}

	public Hability saveHability(Hability hability) {
		return this.habilityRepository.save(hability);
	}

	public List<Hability> getHabilidades(int agentId) {
		return this.habilityRepository.findByagentId(agentId);
	}
}
