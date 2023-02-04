package com.valorant.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.valorant.api.entity.Map;
import com.valorant.api.service.MapService;

@RequestMapping("/Map")
@RestController
public class MapController {
	@Autowired
	private MapService mapService;

	@GetMapping("/Obtener/{id}")
	public ResponseEntity<Map> getMap(@PathVariable("id") int id) {
		try {
			Map map = this.mapService.getMap(id);
			if (map == null) {
				return ResponseEntity.noContent().build();

			}
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			System.out.println("Error en getMap " + e);
			return ResponseEntity.badRequest().build();
		}
	}

	@GetMapping("/Obtener/Todos")
	public ResponseEntity<List<Map>> getAllMaps() {
		try {
			List<Map> maps = this.mapService.getAllMaps();
			if (maps.isEmpty() == true) {
				return ResponseEntity.noContent().build();

			}
			return ResponseEntity.ok(maps);
		} catch (Exception e) {
			System.out.println("Error en getMap " + e);
			return ResponseEntity.badRequest().build();
		}
	}

}
