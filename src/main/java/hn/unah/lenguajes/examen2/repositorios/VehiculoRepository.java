package hn.unah.lenguajes.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.examen2.modelos.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer>{
    
}
