package com.accenture.nuclear.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="incidencias")
public class Incidencia {

	// Attributes
	@Id
    @GeneratedValue
    private Integer id;
    private Integer id_usuario;
    private Integer id_central;
    private String texto;
    private String fecha;
    private Boolean resuelta;

    
    // Constructors
    public Incidencia() {
    	
    }

	
    
    // Getters and Setters
    public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}


	public Integer getId_central() {
		return id_central;
	}


	public void setId_central(Integer id_central) {
		this.id_central = id_central;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public Boolean getResuelta() {
		return resuelta;
	}


	public void setResuelta(Boolean resuelta) {
		this.resuelta = resuelta;
	}

	// Methods
	@Override
	public String toString() {
		return "Incidencia [id=" + id + ", id_usuario=" + id_usuario + ", id_central=" + id_central + ", texto=" + texto
				+ ", fecha=" + fecha + ", resuelta=" + resuelta + "]";
	}

}
