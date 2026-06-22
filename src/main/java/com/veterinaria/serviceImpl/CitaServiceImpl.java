package com.veterinaria.serviceImpl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.veterinaria.entity.Cita;
import com.veterinaria.repository.CitaRepository;
import com.veterinaria.service.CitaService;

@Service
public class CitaServiceImpl implements CitaService{

	private final CitaRepository repo;

	CitaServiceImpl(CitaRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Cita> listar() {
		return repo.findAll();
	}

	@Override
	public Cita registrar(Cita c) {
		return repo.save(c);
	}

	@Override
	public Cita actualizar(Cita c) {
		return repo.save(c);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Cita buscar(Integer id) {
		return repo.findById(id).orElse(null);
	}
}