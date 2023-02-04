package com.valorant.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Nombre;
    private String Descripcion;
    private String Tipo;
    private int Costo;
    private String Tipo_disparo;
    private String Velocidad;
    private short Cargador;
    private String Penetracion;
    private String Zoom;

    public Arma() {
    }

    public Arma(int id, String nombre, String descripcion, String tipo, int costo, String tipo_disparo, String velocidad, short cargador, String penetracion, String zoom) {
        this.id = id;
        Nombre = nombre;
        Descripcion = descripcion;
        Tipo = tipo;
        Costo = costo;
        Tipo_disparo = tipo_disparo;
        Velocidad = velocidad;
        Cargador = cargador;
        Penetracion = penetracion;
        Zoom = zoom;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int costo) {
        Costo = costo;
    }

    public String getTipo_disparo() {
        return Tipo_disparo;
    }

    public void setTipo_disparo(String tipo_disparo) {
        Tipo_disparo = tipo_disparo;
    }

    public String getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(String velocidad) {
        Velocidad = velocidad;
    }

    public short getCargador() {
        return Cargador;
    }

    public void setCargador(short cargador) {
        Cargador = cargador;
    }

    public String getPenetracion() {
        return Penetracion;
    }

    public void setPenetracion(String penetracion) {
        Penetracion = penetracion;
    }

    public String getZoom() {
        return Zoom;
    }

    public void setZoom(String zoom) {
        Zoom = zoom;
    }
}
