package com.equipo4.misiontic2022.tiendasgenericas.tiendaelmercado.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.equipo4.misiontic2022.tiendasgenericas.tiendaelmercado.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
	List<Usuario> findByUsername(String username); 
	
	//List<Usuario> findByNombre(String nombre);

}
