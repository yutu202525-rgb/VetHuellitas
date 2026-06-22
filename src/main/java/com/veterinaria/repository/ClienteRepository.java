package com.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.veterinaria.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}