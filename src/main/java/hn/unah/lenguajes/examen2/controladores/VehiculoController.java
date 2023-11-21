package hn.unah.lenguajes.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen2.modelos.Vehiculo;
import hn.unah.lenguajes.examen2.servicios.impl.VehiculoImpl;

@RestController
@RequestMapping("api/Vehiculo")
public class VehiculoController {
     @Autowired
    private VehiculoImpl vehiculoImpl;

    @PostMapping("/guardar")
    public Vehiculo guardarVehiculo(@RequestBody Vehiculo vehiculo) {
        return this.vehiculoImpl.guardarVehiculo(vehiculo);
    }

     @GetMapping("/obtener/{id}")
    public Vehiculo obtenerVehiculoById(@PathVariable(name="id") Integer id) {
        return this.vehiculoImpl.obtenerVehiculoById(id);
    }

}
