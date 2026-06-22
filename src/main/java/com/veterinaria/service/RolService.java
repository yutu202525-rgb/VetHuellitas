package com.veterinaria.service;

import java.util.List;
import com.veterinaria.entity.Rol;

public interface RolService {

	List<Rol> listar();

	Rol registrar(Rol r);

	Rol actualizar(Rol r);

	void eliminar(Integer id);

	Rol buscar(Integer id);
}
