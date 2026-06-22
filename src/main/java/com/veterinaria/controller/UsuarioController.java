package com.veterinaria.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.veterinaria.entity.Usuario;
import com.veterinaria.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    @PostMapping
    public Usuario registrar(@RequestBody Usuario u) {
        return service.registrar(u);
    }

    @PutMapping
    public Usuario actualizar(@RequestBody Usuario u) {
        return service.actualizar(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Integer id) {
        return service.buscar(id);
    }
}