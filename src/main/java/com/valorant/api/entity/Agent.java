package com.valorant.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Agent {
	@Id
	private int id;

	private String Nombre;
	private Short Edad;
	private String Rol;
	private String Nacionalidad;
	private String Genero;
	private String Raza;
	private String Afiliacion;
	private String Apodo;

	public Agent() {
		super();
	}

	public Agent(int id, String nombre, Short edad, String rol, String nacionalidad, String genero, String raza,
			String afiliacion, String apodo) {
		super();
		this.id = id;
		Nombre = nombre;
		Edad = edad;
		Rol = rol;
		Nacionalidad = nacionalidad;
		Genero = genero;
		Raza = raza;
		Afiliacion = afiliacion;
		Apodo = apodo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Short getEdad() {
		return Edad;
	}

	public void setEdad(Short edad) {
		Edad = edad;
	}

	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		Rol = rol;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getRaza() {
		return Raza;
	}

	public void setRaza(String raza) {
		Raza = raza;
	}

	public String getAfiliacion() {
		return Afiliacion;
	}

	public void setAfiliacion(String afiliacion) {
		Afiliacion = afiliacion;
	}

	public String getApodo() {
		return Apodo;
	}

	public void setApodo(String apodo) {
		Apodo = apodo;
	}

}
