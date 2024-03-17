package com.capas.microservicios.app.usuarios.services;

import java.util.List;

import com.capas.microservicios.app.commons.services.CommonService;
import com.capas.microservicios.commons.alumnos.models.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno>{
	public List<Alumno> findByNombreOrApellido(String term);
}
