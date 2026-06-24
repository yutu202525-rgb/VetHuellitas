package com.veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.veterinaria.service.CitaService;

@Controller
public class CitaViewController {

    private final CitaService service;

    CitaViewController(CitaService service) {
        this.service = service;
    }

    @GetMapping("/vista-citas")
    public String listar(Model model){

        model.addAttribute(
            "listaCitas",
            service.listar()
        );

        return "citas";
    }

}