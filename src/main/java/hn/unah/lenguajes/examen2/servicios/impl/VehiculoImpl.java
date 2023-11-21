package hn.unah.lenguajes.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen2.modelos.Vehiculo;
import hn.unah.lenguajes.examen2.repositorios.VehiculoRepository;
import hn.unah.lenguajes.examen2.servicios.VehiculoService;

@Service
public class VehiculoImpl implements VehiculoService{
     @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo obtenerVehiculos() {
        // TODO Auto-generated method stub
        return this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        return this.vehiculoRepository.save(vehiculo);
    }
    
}
