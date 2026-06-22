package com.veterinaria.serviceImpl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.veterinaria.entity.Servicio;
import com.veterinaria.repository.ServicioRepository;
import com.veterinaria.service.ServicioService;

@Service
public class ServicioServiceImpl implements ServicioService{

	private final ServicioRepository repo;

	public ServicioServiceImpl(ServicioRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Servicio> listar() {
		return repo.findAll();
	}

	@Override
	public Servicio registrar(Servicio s) {
		return repo.save(s);
	}

	@Override
	public Servicio actualizar(Servicio s) {
		return repo.save(s);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Servicio buscar(Integer id) {
		return repo.findById(id).orElse(null);
	}
}