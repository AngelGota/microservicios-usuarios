package com.capas.microservicios.app.usuarios.services;

import org.springframework.stereotype.Service;

import com.capas.microservicios.app.commons.services.CommonServiceImplement;
import com.capas.microservicios.app.usuarios.models.entity.Alumno;
import com.capas.microservicios.app.usuarios.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImplement extends CommonServiceImplement<Alumno, AlumnoRepository> implements AlumnoService {


}
