package com.veterinaria.entity;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tb_cita")

public class Cita {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cita")
	private int idCita;

	@Column(name="fecha")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;

	@Column(name="motivo")
	private String motivo;

	@Column(name="estado")
	private String estado;
	
	@Column(name="hora")
	private String hora;

	@Column(name="mascota")
	private String mascota;

	@Column(name="propietario")
	private String propietario;

	@Column(name="veterinario")
	private String veterinario;

	public Cita() {
		super();
	}

	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getHora() {
	    return hora;
	}

	public void setHora(String hora) {
	    this.hora = hora;
	}

	public String getMascota() {
	    return mascota;
	}

	public void setMascota(String mascota) {
	    this.mascota = mascota;
	}

	public String getPropietario() {
	    return propietario;
	}

	public void setPropietario(String propietario) {
	    this.propietario = propietario;
	}

	public String getVeterinario() {
	    return veterinario;
	}

	public void setVeterinario(String veterinario) {
	    this.veterinario = veterinario;
	}

}