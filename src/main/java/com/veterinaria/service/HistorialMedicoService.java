package com.veterinaria.service;

import java.util.List;
import com.veterinaria.entity.HistorialMedico;

public interface HistorialMedicoService {

	List<HistorialMedico> listar();

	HistorialMedico registrar(HistorialMedico h);

	HistorialMedico actualizar(HistorialMedico h);

	void eliminar(Integer id);

	HistorialMedico buscar(Integer id);
}
