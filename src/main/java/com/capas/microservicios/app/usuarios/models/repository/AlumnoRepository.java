package com.capas.microservicios.app.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.capas.microservicios.app.usuarios.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
	
}
