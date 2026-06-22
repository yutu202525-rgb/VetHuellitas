package com.veterinaria.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.veterinaria.entity.HistorialMedico;
import com.veterinaria.service.HistorialMedicoService;

@RestController
@RequestMapping("/historial")
public class HistorialMedicoController {

    private final HistorialMedicoService service;

    HistorialMedicoController(HistorialMedicoService service) {
        this.service = service;
    }

    @GetMapping
    public List<HistorialMedico> listar() {
        return service.listar();
    }

    @PostMapping
    public HistorialMedico registrar(@RequestBody HistorialMedico h) {
        return service.registrar(h);
    }

    @PutMapping
    public HistorialMedico actualizar(@RequestBody HistorialMedico h) {
        return service.actualizar(h);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/{id}")
    public HistorialMedico buscar(@PathVariable Integer id) {
        return service.buscar(id);
    }
}