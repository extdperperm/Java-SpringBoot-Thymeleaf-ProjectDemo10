package es.dsw.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipoarticulo")
public class TipoArticulo {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idtipoarticulo_tar")
	private int IdTipoArticulo;
	
	@Column(name="descripcion_tar")
	private String Descripcion;

	public TipoArticulo() {
		
	}
	
	public int getIdTipoArticulo() {
		return IdTipoArticulo;
	}

	public void setIdTipoArticulo(int idTipoArticulo) {
		IdTipoArticulo = idTipoArticulo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
}
