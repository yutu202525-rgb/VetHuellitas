package com.veterinaria.service;

import java.util.List;
import com.veterinaria.entity.Cliente;

public interface ClienteService {

	List<Cliente> listar();

	Cliente registrar(Cliente c);

	Cliente actualizar(Cliente c);

	void eliminar(Integer id);

	Cliente buscar(Integer id);
}
