package com.veterinaria.serviceImpl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.veterinaria.entity.HistorialMedico;
import com.veterinaria.repository.HistorialMedicoRepository;
import com.veterinaria.service.HistorialMedicoService;

@Service
public class HistorialMedicoServiceImpl implements HistorialMedicoService{

	private final HistorialMedicoRepository repo;

	public HistorialMedicoServiceImpl(HistorialMedicoRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<HistorialMedico> listar() {
		return repo.findAll();
	}

	@Override
	public HistorialMedico registrar(HistorialMedico h) {
		return repo.save(h);
	}

	@Override
	public HistorialMedico actualizar(HistorialMedico h) {
		return repo.save(h);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public HistorialMedico buscar(Integer id) {
		return repo.findById(id).orElse(null);
	}
}