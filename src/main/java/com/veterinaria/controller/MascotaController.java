package com.veterinaria.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.veterinaria.entity.Mascota;
import com.veterinaria.service.MascotaService;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    private final MascotaService service;

    MascotaController(MascotaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Mascota> listar() {
        return service.listar();
    }

    @PostMapping
    public Mascota registrar(@RequestBody Mascota m) {
        return service.registrar(m);
    }

    @PutMapping
    public Mascota actualizar(@RequestBody Mascota m) {
        return service.actualizar(m);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

    @GetMapping("/{id}")
    public Mascota buscar(@PathVariable Integer id) {
        return service.buscar(id);
    }
}