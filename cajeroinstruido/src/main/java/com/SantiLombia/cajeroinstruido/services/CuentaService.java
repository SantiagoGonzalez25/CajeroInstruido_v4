package com.SantiLombia.cajeroinstruido.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SantiLombia.cajeroinstruido.entity.Cliente;
import com.SantiLombia.cajeroinstruido.entity.Cuenta;
import com.SantiLombia.cajeroinstruido.entity.TipoCuenta;
import com.SantiLombia.cajeroinstruido.repository.CuentaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CuentaService {
     private final CuentaRepository cuentaRepository;
     public Cuenta crearCuenta(Cliente cliente, 
     String numero, TipoCuenta tipo, double saldoInicial){
        Cuenta cuenta = Cuenta.builder()
        .cliente(cliente.getId() != null ? cliente : null) // Asegura que el cliente no sea nulo
        .numero(numero)
        .tipo(tipo)
        .saldo(saldoInicial)
        .build();
        return cuentaRepository.save(cuenta);
    }

    public Optional<Cuenta> buscarPorNumero(String numero){
        return cuentaRepository.findByNumero(numero);
    }

    public double consultarSaldo(Cuenta cuenta){
        return cuenta.getSaldo();
    }

    public List<Cuenta> obtenerCuentasCliente(Cliente cliente){
        return cliente.getCuentas(); 
    }

    public void actualizarSaldo(Cuenta cuenta, double nuevoSaldo) {
        cuenta.setSaldo(nuevoSaldo);
        cuentaRepository.save(cuenta);
    }

    public List<Cuenta> buscarPorCliente(Cliente cliente) {
        return cuentaRepository.findByCliente(cliente);
    }

    public Cuenta obtenerCuentaPorClienteActual(String username){
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}


