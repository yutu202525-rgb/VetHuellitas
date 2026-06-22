package com.veterinaria.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.veterinaria.entity.Servicio;
import com.veterinaria.service.ServicioService;

@RestController
@RequestMapping("/servicios")
public class ServicioController {

    private final ServicioService service;

    ServicioController(ServicioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Servicio> listar() {
        return service.listar();
    }

    @PostMapping
    public Servicio registrar(@RequestBody Servicio s) {
        return service.registrar(s);
    }

    @PutMapping
    public Servicio actualizar(@RequestBody Servicio s) {
        return service.actualizar(s);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/{id}")
    public Servicio buscar(@PathVariable Integer id) {
        return service.buscar(id);
    }
}