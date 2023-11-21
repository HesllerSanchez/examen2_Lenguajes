package hn.unah.lenguajes.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen2.modelos.TipoVehiculo;
import hn.unah.lenguajes.examen2.servicios.impl.TipoVehiculoImpl;

@RestController
@RequestMapping("api/TipoVehiculo")
public class TipoVehiculoController {
    @Autowired
    private TipoVehiculoImpl tipoVehiculoImpl;

    @PostMapping("/guardar")
    public  TipoVehiculo guardarTipoCliente(@RequestBody TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoImpl.guardarTipoVehiculo(tipoVehiculo);
    }
}
