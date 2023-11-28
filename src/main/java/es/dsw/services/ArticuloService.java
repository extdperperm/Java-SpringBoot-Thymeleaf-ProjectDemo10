package es.dsw.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.dsw.models.Articulo;
import es.dsw.repositories.ArticuloRepository;

@Service
public class ArticuloService {

	@Autowired
	private ArticuloRepository articuloRepository;
	
	//SELECT ALL
	public List<Articulo> getAll() {
		
		return articuloRepository.findAll();
	}
	
	//SELECT ONE
	public Articulo getById(int IdArticulo) {
		Optional<Articulo> ArticuloOptional = articuloRepository.findById(IdArticulo);
		
		if (ArticuloOptional.isPresent()) {
			return ArticuloOptional.get();
		} else {
			return null;
		}
	}
}
