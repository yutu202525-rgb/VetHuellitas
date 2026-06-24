package com.veterinaria.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.veterinaria.entity.Veterinario;

public interface VeterinarioRepository
extends JpaRepository<Veterinario,Integer>{

    List<Veterinario> findByNombresContainingIgnoreCase(String nombres);

}