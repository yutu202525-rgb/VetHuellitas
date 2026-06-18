package com.veterinaria.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_servicio")

public class Servicio {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_servicio")
	private int idServicio;

	@Column(name="nombre")
	private String nombre;

	@Column(name="precio")
	private double precio;

	public Servicio() {
		super();
	}

	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}