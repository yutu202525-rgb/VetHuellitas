package com.veterinaria.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.veterinaria.entity.Cita;
import com.veterinaria.service.CitaService;

@RestController
@RequestMapping("/citas")
public class CitaController {

    private final CitaService service;

    CitaController(CitaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cita> listar() {
        return service.listar();
    }

    @PostMapping
    public Cita registrar(@RequestBody Cita c) {
        return service.registrar(c);
    }

    @PutMapping
    public Cita actualizar(@RequestBody Cita c) {
        return service.actualizar(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/{id}")
    public Cita buscar(@PathVariable Integer id) {
        return service.buscar(id);
    }
}