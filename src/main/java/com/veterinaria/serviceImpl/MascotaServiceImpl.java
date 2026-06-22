package com.veterinaria.serviceImpl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.veterinaria.entity.Mascota;
import com.veterinaria.repository.MascotaRepository;
import com.veterinaria.service.MascotaService;

@Service
public class MascotaServiceImpl implements MascotaService{

	private final MascotaRepository repo;

	public MascotaServiceImpl(MascotaRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Mascota> listar() {
		return repo.findAll();
	}

	@Override
	public Mascota registrar(Mascota m) {
		return repo.save(m);
	}

	@Override
	public Mascota actualizar(Mascota m) {
		return repo.save(m);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Mascota buscar(Integer id) {
		return repo.findById(id).orElse(null);
	}
}