package com.veterinaria.service;

import java.util.List;
import com.veterinaria.entity.Veterinario;

public interface VeterinarioService {

	List<Veterinario> listar();

	Veterinario registrar(Veterinario v);

	Veterinario actualizar(Veterinario v);

	void eliminar(Integer id);

	Veterinario buscar(Integer id);
	
	List<Veterinario> buscar(String nombres);
	
	
}