package com.valorant.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.valorant.api.entity.Agent;
import com.valorant.api.entity.Hability;
import com.valorant.api.service.HabiltyService;

@RequestMapping("/Hability")
@RestController
public class HabilityController { 
	

	@Autowired
	private HabiltyService habiltyService;

	@GetMapping("/Obtener/Todas")
	public ResponseEntity<List<Hability>> getAllHabilitys() {
		try {
			List<Hability> ListaHabilidades = this.habiltyService.getAllHabilitys();
			if (ListaHabilidades.isEmpty() == true) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(ListaHabilidades);
		} catch (Exception e) {
			System.out.println("Error en getAllHabilitys" + e);
			return ResponseEntity.badRequest().build();
		}

	}

	@GetMapping("/Obtener/{id}")
	public ResponseEntity<Hability> getHability(@PathVariable("id") int id) {
		try {
			Hability hability = this.habiltyService.getHability(id);
			if (hability == null) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(hability);
		} catch (Exception e) {
			System.out.println("Error en getHability" + e);
			return ResponseEntity.badRequest().build();
		}

	}

	@GetMapping("/Obtener/Habilidades/{agentId}")
	public ResponseEntity<List<Hability>> getAgentWithHabilitys(@PathVariable("agentId") int agentId) {
		try {
			List<Hability> lista = this.habiltyService.getHabilidades(agentId);
			if(lista.isEmpty()==true) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(lista);

		} catch (Exception e) {
			System.out.println("Error en getAgentWithHabilitys" + e);
			return ResponseEntity.badRequest().build();
		}
	}
}
