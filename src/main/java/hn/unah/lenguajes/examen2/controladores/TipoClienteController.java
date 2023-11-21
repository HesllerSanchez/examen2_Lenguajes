package hn.unah.lenguajes.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen2.modelos.TipoCliente;
import hn.unah.lenguajes.examen2.servicios.impl.TipoClienteImpl;

@RestController
@RequestMapping("api/TipoCliente")
public class TipoClienteController {

    @Autowired
    private TipoClienteImpl tipoClienteImpl;

    @PostMapping("/guardar")
    public TipoCliente guardarTipoCliente(@RequestBody TipoCliente descripcion) {
        return this.tipoClienteImpl.guardarTipoCliente(descripcion);
    }

}
