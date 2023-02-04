package com.valorant.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hability {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String tipo;
	private String costo;
	private String funcion;
	private int agentId;

	public Hability(int id, String nombre, String tipo, String costo, String funcion, int AgentId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.costo = costo;
		this.funcion = funcion;
		agentId = AgentId;
	}

	public Hability() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int AgentId) {
		agentId = AgentId;
	}

}
