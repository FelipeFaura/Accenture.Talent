package com.accenture.nuclear.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {

	// Attributes
	@Id
    @GeneratedValue
    private Integer id;
    private Integer id_rol;
    private String nombre;
    private String correo;
    private String clave;
    
    // Constructors
    public Usuarios() {
    	
    }
    
    // Getters and Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_rol() {
		return id_rol;
	}
	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}


	
	// Methods
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", id_rol=" + id_rol + ", nombre=" + nombre + ", correo=" + correo + ", clave="
				+ clave + "]";
	}
}
