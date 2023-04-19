package com.valorant.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.valorant.api.entity.Agent;
import com.valorant.api.service.AgentService;

@RequestMapping("/Agent")
@Controller
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

	@PostMapping("/Guardar/")
	public ResponseEntity<Agent> saveAgent(@RequestBody Agent agent) {
		try {
			Agent agenteBuscar = this.agentService.getAgent(agent.getId());
			if (agenteBuscar == null) {
				this.agentService.saveAgent(agent);
				return ResponseEntity.ok(agent);
			}
			return ResponseEntity.badRequest().build();
		} catch (Exception e) {
			System.out.println("Error en saveAgent " + e);
			return ResponseEntity.badRequest().build();
		}
	}

	@PutMapping("/Editar/{id}")
	public ResponseEntity<Agent> editAgent(@PathVariable("id") int id, @RequestBody Agent agent) {
		try {
			agent.setId(id);
			this.agentService.editAgent(agent);
			return ResponseEntity.ok(agent);
		} catch (Exception e) {
			System.out.println("Error en editAgent " + e);
			return ResponseEntity.badRequest().build();
		}
	}

	@DeleteMapping("/Borrar/{id}")
	public ResponseEntity<Agent> deleteAgent(@PathVariable("id") int id) {
		try {
			Agent agent = this.agentService.getAgent(id);
			if (agent == null) {

				return ResponseEntity.badRequest().build();
			}
			this.agentService.deleteAgent(id);
			return ResponseEntity.ok(agent);

		} catch (Exception e) {
			System.out.println("Error en deleteAgent " + e);
			return ResponseEntity.badRequest().build();
		}
	}


}
