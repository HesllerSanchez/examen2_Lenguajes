package hn.unah.lenguajes.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen2.modelos.Cliente;
import hn.unah.lenguajes.examen2.modelos.Vehiculo;
import hn.unah.lenguajes.examen2.repositorios.ClienteRepository;
import hn.unah.lenguajes.examen2.repositorios.TipoClienteRepository;
import hn.unah.lenguajes.examen2.servicios.ClienteService;

@Service
public class ClienteImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public Cliente obtenerClientes() {
        // TODO Auto-generated method stub
        return this.clienteRepository.findAll();
    }


    @Override
    public Cliente guardarCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        return this.clienteRepository.save(cliente);
    }
    
        @Override
    public Cliente obtenerClienteById(Integer id) {
        // TODO Auto-generated method stub
        return this.clienteRepository.findById(id).orElse(null);
    }

    
}
