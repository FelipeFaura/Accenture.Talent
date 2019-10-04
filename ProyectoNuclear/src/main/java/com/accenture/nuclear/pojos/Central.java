package com.accenture.nuclear.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="centrales")
public class Central {

	// Attributes
	@Id
    @GeneratedValue
    private Integer id;
    private Integer id_tipo;
    private String latitud;
    private String longitud;
    private String descripcion;
    private String imagen;
    private Integer potencia;
    private String id_provincia;
    private Boolean activa;
    private String inicio;
    private String fin;
    private String observaciones;
    
    // Constructors
    public Central() {
    	
    }

	
    
    // Getters and Setters
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(Integer id_tipo) {
		this.id_tipo = id_tipo;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public String getId_provincia() {
		return id_provincia;
	}

	public void setId_provincia(String id_provincia) {
		this.id_provincia = id_provincia;
	}

	public Boolean getActiva() {
		return activa;
	}

	public void setActiva(Boolean activa) {
		this.activa = activa;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	// Methods
	@Override
	public String toString() {
		return "Central [id=" + id + ", id_tipo=" + id_tipo + ", latitud=" + latitud + ", longitud=" + longitud
				+ ", descripcion=" + descripcion + ", imagen=" + imagen + ", potencia=" + potencia + ", id_provincia="
				+ id_provincia + ", activa=" + activa + ", inicio=" + inicio + ", fin=" + fin + ", observaciones="
				+ observaciones + "]";
	}

}
