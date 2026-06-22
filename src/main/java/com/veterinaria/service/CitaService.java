package com.veterinaria.service;

import java.util.List;
import com.veterinaria.entity.Cita;

public interface CitaService {

	List<Cita> listar();

	Cita registrar(Cita c);

	Cita actualizar(Cita c);

	void eliminar(Integer id);

	Cita buscar(Integer id);
}