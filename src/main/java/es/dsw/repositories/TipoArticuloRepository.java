package es.dsw.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.dsw.models.TipoArticulo;

@Repository
public interface TipoArticuloRepository extends JpaRepository<TipoArticulo, Integer> {
  
    @Query("SELECT t FROM TipoArticulo t WHERE t.IdTipoArticulo > :valor")
    List<TipoArticulo> findTipoArticulosByIdGreaterThan(@Param("valor") int valor);
}
