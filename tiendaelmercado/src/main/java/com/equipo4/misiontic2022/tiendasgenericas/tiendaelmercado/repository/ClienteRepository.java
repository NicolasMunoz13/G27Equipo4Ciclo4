package com.equipo4.misiontic2022.tiendasgenericas.tiendaelmercado.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.equipo4.misiontic2022.tiendasgenericas.tiendaelmercado.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
	List<Cliente> findByCedula(Long cedula);

}
