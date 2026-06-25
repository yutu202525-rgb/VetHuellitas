package com.veterinaria.service;

import java.util.List;
import com.veterinaria.entity.Usuario;

public interface UsuarioService {

	List<Usuario> listar();

	Usuario registrar(Usuario u);

	Usuario actualizar(Usuario u);

	void eliminar(Integer id);

	Usuario buscar(Integer id);
	
	Usuario login(String usuario, String password);
}