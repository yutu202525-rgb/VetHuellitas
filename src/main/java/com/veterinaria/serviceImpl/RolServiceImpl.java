package com.veterinaria.serviceImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.veterinaria.entity.Rol;
import com.veterinaria.repository.RolRepository;
import com.veterinaria.service.RolService;
@Service
public class RolServiceImpl implements RolService{
	private final RolRepository repo;

	public RolServiceImpl(RolRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Rol> listar() {
		return repo.findAll();
	}
	@Override
	public Rol registrar(Rol r) {
		return repo.save(r);
	}
	@Override
	public Rol actualizar(Rol r) {
		return repo.save(r);
	}
	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
	@Override
	public Rol buscar(Integer id) {
		return repo.findById(id).orElse(null);
	}
}