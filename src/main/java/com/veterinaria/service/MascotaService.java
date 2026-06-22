package com.veterinaria.service;

import java.util.List;
import com.veterinaria.entity.Mascota;

public interface MascotaService {

	List<Mascota> listar();

	Mascota registrar(Mascota m);

	Mascota actualizar(Mascota m);

	void eliminar(Integer id);

	Mascota buscar(Integer id);
}