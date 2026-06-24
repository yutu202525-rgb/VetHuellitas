package com.veterinaria.serviceImpl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.veterinaria.entity.Veterinario;
import com.veterinaria.repository.VeterinarioRepository;
import com.veterinaria.service.VeterinarioService;

@Service
public class VeterinarioServiceImpl implements VeterinarioService{

	private final VeterinarioRepository repo;

	public VeterinarioServiceImpl(VeterinarioRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Veterinario> listar() {
		return repo.findAll();
	}

	@Override
	public Veterinario registrar(Veterinario v) {
		return repo.save(v);
	}

	@Override
	public Veterinario actualizar(Veterinario v) {
		return repo.save(v);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Veterinario buscar(Integer id) {
		return repo.findById(id).orElse(null);
	}
	
	@Override
	public List<Veterinario> buscar(String nombres) {
	    return repo.findByNombresContainingIgnoreCase(nombres);
	}
	
}