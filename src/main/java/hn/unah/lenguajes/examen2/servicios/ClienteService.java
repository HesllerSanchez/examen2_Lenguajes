package hn.unah.lenguajes.examen2.servicios;

import hn.unah.lenguajes.examen2.modelos.Cliente;

public interface ClienteService {
    public Cliente obtenerClientes();

    public Cliente guardarCliente(Cliente cliente);
}
