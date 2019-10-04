package com.accenture.nuclear.dao;

import org.springframework.data.repository.CrudRepository;

import com.accenture.nuclear.pojos.Incidencia;

public interface IncidenciasRepo extends CrudRepository<Incidencia, Integer> {
}
