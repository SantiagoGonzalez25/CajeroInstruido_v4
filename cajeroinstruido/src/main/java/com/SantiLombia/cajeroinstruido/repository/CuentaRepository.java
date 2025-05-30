package com.SantiLombia.cajeroinstruido.repository;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SantiLombia.cajeroinstruido.entity.Cliente;
import com.SantiLombia.cajeroinstruido.entity.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta , Long> {
    Optional<Cuenta> findByNumero(String numero);
    List<Cuenta> findByCliente(Cliente cliente);

}