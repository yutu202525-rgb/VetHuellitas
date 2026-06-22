package com.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.veterinaria.entity.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer>{

}