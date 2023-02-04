package com.valorant.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.valorant.api.entity.Arma;
import com.valorant.api.service.WeaponService;

@RequestMapping("/Weapon")
@RestController
public class WeaponController {

	@Autowired
	private WeaponService weaponService;

	@GetMapping("/Obtener/Todas")
	public ResponseEntity<List<Arma>> getAllWeapons() {
		try {
			List<Arma> armalist = this.weaponService.getAllWeapons();
			if (armalist.isEmpty() == true) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(armalist);
		} catch (Exception e) {
			System.out.println("Error en getAllWeapons" + e);
			return ResponseEntity.badRequest().build();
		}
	}

	@GetMapping("/Obtener/{id}")
	public ResponseEntity<Arma> getWeapon(@PathVariable("id") int id) {
		try {
			Arma weapon = this.weaponService.getWeapon(id);
			if (weapon == null) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(weapon);

		} catch (Exception e) {
			System.out.println("Error en getWeapon" + e);
			return ResponseEntity.badRequest().build();
		}
	}

}
