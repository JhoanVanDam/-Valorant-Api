package com.valorant.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valorant.api.entity.Map;
import com.valorant.api.repository.MapRepository;

@Service
public class MapService {
	@Autowired
	private MapRepository mapRepository;

	public Map getMap(int id) {
		return this.mapRepository.findById(id).orElse(null);
	}

	public List<Map> getAllMaps() {
		return this.mapRepository.findAll();
	}

	public Map saveMap(Map map) {
		return this.mapRepository.save(map);
	}

	public Map deleteMap(int id) {
		Map map = this.mapRepository.findById(id).orElse(null);
		this.mapRepository.deleteById(id);
		return map;
	}
	
}
