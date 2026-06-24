package com.veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.veterinaria.service.ClienteService;

@Controller
public class ClienteViewController {

    private final ClienteService service;

    ClienteViewController(ClienteService service) {
        this.service = service;
    }

    @GetMapping("/vista-propietarios")
    public String listar(Model model){
        model.addAttribute("mensaje", "Bienvenido al módulo de propietarios");
        model.addAttribute("codigo", service.listar());
        return "propietario/listarPropietario";
    }
}