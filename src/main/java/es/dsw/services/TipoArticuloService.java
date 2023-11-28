package es.dsw.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.dsw.models.TipoArticulo;
import es.dsw.repositories.TipoArticuloRepository;

@Service
public class TipoArticuloService {

	@Autowired
	private TipoArticuloRepository tipoArticuloRepository;
	
	//SELECT ALL
	public List<TipoArticulo> getAll() {
		
		return tipoArticuloRepository.findAll();
	}
	
	//SELECT ONE
	public TipoArticulo getById(int IdTipoArticulo) {
		Optional<TipoArticulo> tipoArticuloOptional = tipoArticuloRepository.findById(IdTipoArticulo);
		
		if (tipoArticuloOptional.isPresent()) {
			return tipoArticuloOptional.get();
		} else {
			return null;
		}
	}
	
	//UPDATE/INSERT ONE
	public void set(TipoArticulo objTipoArticulo) {
		
		tipoArticuloRepository.save(objTipoArticulo);
		
	}
	
	//DELETE ONE
	public void delete(TipoArticulo objTipoArticulo) {
		
		tipoArticuloRepository.delete(objTipoArticulo); 
		
	}
	
	//SELECT CONDICIONAL
    public List<TipoArticulo> getGreaterThan(int valor) {
        return tipoArticuloRepository.findTipoArticulosByIdGreaterThan(valor);
    }
	
  
	
}
