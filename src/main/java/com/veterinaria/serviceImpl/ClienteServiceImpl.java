package com.veterinaria.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.veterinaria.entity.Cliente;
import com.veterinaria.repository.ClienteRepository;
import com.veterinaria.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repo;

    public ClienteServiceImpl(ClienteRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Cliente> listar() {
        return repo.findAll();
    }

    @Override
    public Cliente registrar(Cliente c) {
        return repo.save(c);
    }

    @Override
    public Cliente actualizar(Cliente c) {
        return repo.save(c);
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Cliente buscar(Integer id) {
        return repo.findById(id).orElse(null);
    }
}