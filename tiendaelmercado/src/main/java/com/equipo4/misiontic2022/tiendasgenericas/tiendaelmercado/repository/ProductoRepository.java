package com.equipo4.misiontic2022.tiendasgenericas.tiendaelmercado.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.equipo4.misiontic2022.tiendasgenericas.tiendaelmercado.model.Producto;

public interface ProductoRepository extends MongoRepository<Producto, String> {
	
	List<Producto> findByCodigoproducto(Long codigoproducto);
	
	List<Producto> findByNombreproducto(String nombreproducto);

}
