package com.veterinaria.serviceImpl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.veterinaria.entity.Usuario;
import com.veterinaria.repository.UsuarioRepository;
import com.veterinaria.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	private final UsuarioRepository repo;

	public UsuarioServiceImpl(UsuarioRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Usuario> listar() {
		return repo.findAll();
	}

	@Override
	public Usuario registrar(Usuario u) {
		return repo.save(u);
	}

	@Override
	public Usuario actualizar(Usuario u) {
		return repo.save(u);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Usuario buscar(Integer id) {
		return repo.findById(id).orElse(null);
	}
}