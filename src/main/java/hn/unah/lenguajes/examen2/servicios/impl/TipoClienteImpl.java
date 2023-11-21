package hn.unah.lenguajes.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen2.modelos.TipoCliente;
import hn.unah.lenguajes.examen2.repositorios.TipoClienteRepository;
import hn.unah.lenguajes.examen2.servicios.TipoClienteService;

@Service 
public class TipoClienteImpl implements TipoClienteService {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;


    @Override
    public TipoCliente guardarTipoCliente(TipoCliente tipoCliente) {
        // TODO Auto-generated method stub
        return this.tipoClienteRepository.save(tipoCliente);
    }
    
}
