package com.capas.microservicios.app.usuarios.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capas.microservicios.app.commons.services.CommonServiceImplement;
import com.capas.microservicios.commons.alumnos.models.entity.Alumno;

import com.capas.microservicios.app.usuarios.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImplement extends CommonServiceImplement<Alumno, AlumnoRepository> implements AlumnoService {

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreOrApellido(String term) {
		return repository.findByNombreOrApellido(term);
	}
}
