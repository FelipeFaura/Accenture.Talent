package com.accenture.nuclear.dao;

import org.springframework.data.repository.CrudRepository;

import com.accenture.nuclear.pojos.Usuarios;

public interface UsuariosRepo extends CrudRepository<Usuarios, Integer> {
	public Usuarios findByCorreo(String correo);
	
}
