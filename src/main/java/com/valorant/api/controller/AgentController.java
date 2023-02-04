package com.valorant.api.controller;

import java.util.List;
import java.util.Map;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.valorant.api.entity.Agent;
import com.valorant.api.entity.Hability;
import com.valorant.api.service.AgentService;

@RequestMapping("/Agent")
@RestController
public class AgentController {

	@Autowired
	private AgentService agentService;

	@GetMapping("/Obtener/{id}")
	public ResponseEntity<Agent> getAgent(@PathVariable("id") int id) {
		try {
			Agent agent = this.agentService.getAgent(id);
			if (agent == null) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(agent);
		} catch (Exception e) {
			System.out.println("Error en getAgent " + e);
			return ResponseEntity.badRequest().build();
		}
	}

	@GetMapping("/Obtener/todos")
	public ResponseEntity<List<Agent>> getAllAgents() {
		try {
			List<Agent> ListAgent = this.agentService.getAllAgents();
			if (ListAgent.isEmpty() == true) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(ListAgent);
		} catch (Exception e) {
			System.out.println("Error en getAllAgents " + e);
			return ResponseEntity.badRequest().build();
		}
	}

}
