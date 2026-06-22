package com.veterinaria.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.veterinaria.entity.Cliente;
import com.veterinaria.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listar(){
        return service.listar();
    }

    @PostMapping
    public Cliente registrar(@RequestBody Cliente c){
        return service.registrar(c);
    }

    @PutMapping
    public Cliente actualizar(@RequestBody Cliente c){
        return service.actualizar(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        service.eliminar(id);
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Integer id){
        return service.buscar(id);
    }

}