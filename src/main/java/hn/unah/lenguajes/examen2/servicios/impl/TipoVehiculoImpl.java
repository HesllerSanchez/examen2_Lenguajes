package hn.unah.lenguajes.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen2.modelos.TipoVehiculo;
import hn.unah.lenguajes.examen2.repositorios.TipoVehiculoRepository;
import hn.unah.lenguajes.examen2.servicios.TipoVehiculoService;

@Service
public class TipoVehiculoImpl implements TipoVehiculoService {

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo guardarTipoVehiculo(TipoVehiculo tipoVehiculo) {
        // TODO Auto-generated method stub
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

}
