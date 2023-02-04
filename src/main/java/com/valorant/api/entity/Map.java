package com.valorant.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Map {
	@Id
	private short id;
	private String nombre;
	private String ubicacion;
	private String fecha_lanzamiento;
	private short numero_sites;
	private String especialidad;
	private String descripcion;

	public Map() {
		super();
	}

	public Map(short id, String nombre, String ubicacion, String fecha_lanzamiento, short numero_sites,
			String especialidad, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.fecha_lanzamiento = fecha_lanzamiento;
		this.numero_sites = numero_sites;
		this.especialidad = especialidad;
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getFecha_lanzamiento() {
		return fecha_lanzamiento;
	}

	public void setFecha_lanzamiento(String fecha_lanzamiento) {
		this.fecha_lanzamiento = fecha_lanzamiento;
	}

	public short getNumero_sites() {
		return numero_sites;
	}

	public void setNumero_sites(short numero_sites) {
		this.numero_sites = numero_sites;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
