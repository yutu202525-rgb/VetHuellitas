package com.veterinaria.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.veterinaria.entity.Veterinario;
import com.veterinaria.service.VeterinarioService;

@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {

    private final VeterinarioService service;

    public VeterinarioController(VeterinarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Veterinario> listar() {
        return service.listar();
    }

    @PostMapping
    public Veterinario registrar(@RequestBody Veterinario v) {
        return service.registrar(v);
    }

    @PutMapping
    public Veterinario actualizar(@RequestBody Veterinario v) {
        return service.actualizar(v);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/{id}")
    public Veterinario buscar(@PathVariable Integer id) {
        return service.buscar(id);
    }
}