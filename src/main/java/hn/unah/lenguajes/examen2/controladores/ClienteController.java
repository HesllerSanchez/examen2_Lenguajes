package hn.unah.lenguajes.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen2.modelos.Cliente;
import hn.unah.lenguajes.examen2.servicios.impl.ClienteImpl;

@RestController
@RequestMapping("api/Cliente")
public class ClienteController {
    @Autowired
    private ClienteImpl clienteImpl;

    @PostMapping("/guardar")
    public Cliente guardarCliente(@RequestBody Cliente cliente) {

        if(cliente.getTipoCliente() !=null){
            cliente.getTipoCliente().setIdTipocliente(cliente.getIdCliente());
        }
        return this.clienteImpl.guardarCliente(cliente);

    }

         @GetMapping("/obtener/{id}")
    public Cliente obtenerClienteById(@PathVariable(name="id") Integer id) {
        return this.clienteImpl.obtenerClienteById(id);
    }
}
