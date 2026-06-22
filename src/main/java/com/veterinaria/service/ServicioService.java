package com.veterinaria.service;

import java.util.List;
import com.veterinaria.entity.Servicio;

public interface ServicioService {

	List<Servicio> listar();

	Servicio registrar(Servicio s);

	Servicio actualizar(Servicio s);

	void eliminar(Integer id);

	Servicio buscar(Integer id);
}