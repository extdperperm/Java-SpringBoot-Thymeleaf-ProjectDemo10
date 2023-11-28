package es.dsw.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import es.dsw.models.Articulo;
import es.dsw.models.TipoArticulo;
import es.dsw.services.ArticuloService;
import es.dsw.services.TipoArticuloService;


@Controller
public class IndexController {

	//Se deben declarar los servicios que se usarán.
    @Autowired
    private TipoArticuloService objTipoArticuloImplement;
    @Autowired
    private ArticuloService objArticuloService;
    
    @GetMapping(value= {"/","/index"})
    public String idx() {
    	
    	//################# EJEMPLOS DEL MAPEO OBJETO: TIPOARTICULO ############################
    	//SELECT ALL
    	//Obtener todos los tipos de artículos desde la bbdd
    	//@SuppressWarnings("unused") se añadió para anular avisos por variable no usada.
        @SuppressWarnings("unused")
		List<TipoArticulo> objTipoArticulos = objTipoArticuloImplement.getAll();
        
        //SELECT ONE
        //Obtener un tipo de artículo por su clave primaria desde la bbdd
        TipoArticulo objTipoArticulo = objTipoArticuloImplement.getById(1);
        
        //Se modifica un atributo de un objeto obtenido desde la bbdd
        objTipoArticulo.setDescripcion("Ropa");
        
        //UPDATE
        //Se modifica un tipo de artículo existente que se obtuvo desde bbdd.
        objTipoArticuloImplement.set(objTipoArticulo);
        
        //INSERT
        //Se crea un nuevo objeto
        TipoArticulo newTipoArticulo = new TipoArticulo();
        
        //Se modifica un atributo
        newTipoArticulo.setDescripcion("Maquillaje");
        
        //Se inserta un nuevo registro en la bbdd
        objTipoArticuloImplement.set(newTipoArticulo);
        
        //DELETE
        //Eliminar un tipo de artículo. El que se creó en la línea 53.
        objTipoArticuloImplement.delete(newTipoArticulo);
        
        //Ejemplo de: SELECT CONDICIONAL CON HQL. HQL PARAMETRIZADA
        objTipoArticulos = objTipoArticuloImplement.getGreaterThan(5);
        
        
        
        //################# EJEMPLOS DEL MAPEO OBJETO: ARTICULO ############################
    	//SELECT ALL
    	//Obtener todos los artículos. Observa como cada artículo cuenta ya con el objeto TipoArticulo.
    	//@SuppressWarnings("unused") se añadió para anular avisos por variable no usada.
        @SuppressWarnings("unused")
		List<Articulo> objArticulos = objArticuloService.getAll();
        
        //SELECT ONE
        //Obtener un artículo por su clave primaria
        @SuppressWarnings("unused")
		Articulo objArticulo = objArticuloService.getById(3);
        
        return "index"; 
    }
}
