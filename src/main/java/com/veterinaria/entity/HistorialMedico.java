package com.veterinaria.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_historial")

public class HistorialMedico {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_historial")
	private int idHistorial;

	@Column(name="diagnostico")
	private String diagnostico;

	@Column(name="tratamiento")
	private String tratamiento;

	public HistorialMedico() {
		super();
	}

	public int getIdHistorial() {
		return idHistorial;
	}

	public void setIdHistorial(int idHistorial) {
		this.idHistorial = idHistorial;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

}