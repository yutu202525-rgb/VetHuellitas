package com.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.veterinaria.entity.HistorialMedico;

public interface HistorialMedicoRepository 
extends JpaRepository<HistorialMedico, Integer>{

}