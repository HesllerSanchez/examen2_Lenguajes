package hn.unah.lenguajes.examen2.servicios;

import hn.unah.lenguajes.examen2.modelos.Cliente;
import hn.unah.lenguajes.examen2.modelos.Vehiculo;

public interface ClienteService {
    public Cliente obtenerClientes();

    public Cliente guardarCliente(Cliente cliente);

     public Cliente obtenerClienteById(Integer id);
}
