package com.veterinaria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_veterinario")

public class Veterinario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_veterinario")
	private int idVeterinario;

	@Column(name="nombres")
	private String nombres;

	@Column(name="especialidad")
	private String especialidad;

	@Column(name="telefono")
	private String telefono;

	@Column(name="correo")
	private String correo;
	
	@Column(name="estado")
	private String estado;

	public Veterinario() {
		super();
	}

	public int getIdVeterinario() {
		return idVeterinario;
	}

	public void setIdVeterinario(int idVeterinario) {
		this.idVeterinario = idVeterinario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getEstado() {
	    return estado;
	}

	public void setEstado(String estado) {
	    this.estado = estado;
	}
}