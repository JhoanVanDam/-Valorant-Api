package com.valorant.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valorant.api.entity.Arma;
import com.valorant.api.repository.WeaponRepository;

@Service
public class WeaponService {

	@Autowired
	private WeaponRepository weaponRepository;
	
	public Arma getWeapon(int id) {
		return this.weaponRepository.findById(id).orElse(null);
	}

	public List<Arma> getAllWeapons() {
		return this.weaponRepository.findAll();
	}

	public Arma saveWeapon(Arma arma) {
		return this.weaponRepository.save(arma);
	}

	public Arma deleteWeapon(int id) {
		Arma arma = this.weaponRepository.findById(id).orElse(null);
		this.weaponRepository.deleteById(id);
		return arma;
	}
}
