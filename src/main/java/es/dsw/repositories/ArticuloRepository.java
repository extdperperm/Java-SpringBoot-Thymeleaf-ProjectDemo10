package es.dsw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.dsw.models.Articulo;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {
	  
}
