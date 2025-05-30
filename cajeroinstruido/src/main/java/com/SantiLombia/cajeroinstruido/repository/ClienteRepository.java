package com.SantiLombia.cajeroinstruido.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SantiLombia.cajeroinstruido.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByIdentificacion(String identificacion);
    

}