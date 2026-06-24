package com.veterinaria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.veterinaria.service.CitaService;
import com.veterinaria.service.MascotaService;
import com.veterinaria.service.VeterinarioService;
import com.veterinaria.entity.Cita;
import com.veterinaria.entity.Mascota;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.veterinaria.entity.Veterinario;

@Controller
public class WebController {

    private final VeterinarioService veterinarioService;
    private final CitaService citaService;
    private final MascotaService mascotaService;

    public WebController(VeterinarioService veterinarioService,
                         CitaService citaService, MascotaService mascotaService) {

        this.veterinarioService = veterinarioService;
        this.citaService = citaService;
        this.mascotaService = mascotaService;
    }

    @GetMapping("/vista/veterinarios")
    public String listar(
    @RequestParam(required=false,defaultValue="") String buscar,
    Model model){

        if(buscar.isEmpty()){

            model.addAttribute(
                "listaVeterinarios",
                veterinarioService.listar()
            );

        }else{

            model.addAttribute(
                "listaVeterinarios",
                veterinarioService.buscar(buscar)
            );
        }

        return "veterinarios";
    }
    
    @GetMapping("/nueva-cita")
    public String formulario(Model model){

        model.addAttribute(
            "cita",
            new Cita()
        );

        model.addAttribute(
            "listaVeterinarios",
            veterinarioService.listar()
        );

        return "nueva-cita";
    }

    @PostMapping("/guardar-cita")
    public String guardar(Cita cita){

        if(cita.getIdCita()==0){

            citaService.registrar(cita);

        }else{

            citaService.actualizar(cita);

        }

        return "redirect:/vista/citas";
    }
    
    @GetMapping("/vista/citas")
    public String listarCitas(Model model){

        model.addAttribute(
            "listaCitas",
            citaService.listar()
        );

        return "citas";
    }
    
    @GetMapping("/eliminar-cita/{id}")
    public String eliminar(@PathVariable Integer id){

        citaService.eliminar(id);

        return "redirect:/vista/citas";
    }


    @GetMapping("/editar-cita/{id}")
    public String editar(@PathVariable Integer id,
                         Model model){

        model.addAttribute(
            "cita",
            citaService.buscar(id)
        );

        return "nueva-cita";
    }
    
    @GetMapping("/nuevo-veterinario")
    public String nuevoVeterinario(Model model){

        model.addAttribute(
            "veterinario",
            new Veterinario()
        );

        return "nuevo-veterinario";
    }


    @PostMapping("/guardar-veterinario")
    public String guardarVeterinario(
    Veterinario veterinario){

        if(veterinario.getIdVeterinario()==0){

            veterinarioService.registrar(veterinario);

        }else{

            veterinarioService.actualizar(veterinario);
        }

        return "redirect:/vista/veterinarios";
    }
    
    @GetMapping("/editar-veterinario/{id}")
    public String editarVeterinario(
    @PathVariable Integer id,
    Model model){

        model.addAttribute(
            "veterinario",
            veterinarioService.buscar(id)
        );

        return "nuevo-veterinario";
    }


    @GetMapping("/eliminar-veterinario/{id}")
    public String eliminarVeterinario(
    @PathVariable Integer id){

        veterinarioService.eliminar(id);

        return "redirect:/vista/veterinarios";
    }
    
 // FORMULARIO MASCOTA
    @GetMapping("/vista/mascotas")
    public String listarMascotas(@RequestParam(required=false, defaultValue="") String buscar, Model model) {
        List<Mascota> lista = new ArrayList<Mascota>();
        if (buscar.isEmpty()) {
            lista = mascotaService.listar();
        } else {
            try {
                Integer id = Integer.parseInt(buscar);
                Mascota m = mascotaService.buscar(id);
                if (m != null) {
                    lista.add(m); 
                }
            } catch (NumberFormatException e) {
                // devolverá la lista vacía.
            }
        }
        model.addAttribute("listaMascotas", lista);
        return "mascotas"; // Asegúrate de que el HTML se llame exactamente mascotas.html
    }
    
    // FORMULARIO NUEVA MASCOTA
    @GetMapping("/vista/nueva-mascota")
    public String nuevaMascota(Model model) {
        model.addAttribute("mascota", new Mascota());
        return "nueva-mascota";
    }

    // GUARDAR O ACTUALIZAR MASCOTA
    @PostMapping("/guardar-mascota")
    public String guardarMascota(Mascota mascota) {
        if (mascota.getIdMascota() == 0) {
            mascotaService.registrar(mascota);
        } else {
            mascotaService.actualizar(mascota);
        }
        return "redirect:/vista/mascotas";
    }

    // FORMULARIO EDITAR MASCOTA
    @GetMapping("/vista/editar-mascota/{id}")
    public String editarMascota(@PathVariable Integer id, Model model) {
        model.addAttribute("mascota", mascotaService.buscar(id));
        return "nueva-mascota"; 
    }

    // ELIMINAR MASCOTA
    @GetMapping("/vista/eliminar-mascota/{id}")
    public String eliminarMascota(@PathVariable Integer id) {
        mascotaService.eliminar(id);
        return "redirect:/vista/mascotas";
    }
}