package com.SantiLombia.cajeroinstruido.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SantiLombia.cajeroinstruido.entity.Cuenta;
import com.SantiLombia.cajeroinstruido.entity.Movimiento;


public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
   List<Movimiento> findByCuenta(Cuenta cuenta);
   List<Movimiento> findByCuentaOrderByFechaDesc(Cuenta cuenta);

}