package com.veterinaria.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.veterinaria.entity.Rol;
import com.veterinaria.service.RolService;

@RestController
@RequestMapping("/roles")
public class RolController {

    private final RolService service;

    RolController(RolService service) {
        this.service = service;
    }

    @GetMapping
    public List<Rol> listar() {
        return service.listar();
    }

    @PostMapping
    public Rol registrar(@RequestBody Rol r) {
        return service.registrar(r);
    }

    @PutMapping
    public Rol actualizar(@RequestBody Rol r) {
        return service.actualizar(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/{id}")
    public Rol buscar(@PathVariable Integer id) {
        return service.buscar(id);
    }
}