package com.formacionbdi.microservicios.app.respuestas.models.services;

import com.formacionbdi.microservicios.app.respuestas.models.entity.Respuesta;

public interface RespuestaService {

	public Iterable<Respuesta> saveAll(Iterable<Respuesta> repsuestas);
	
	public Iterable<Respuesta> findRespuestaByAlumnoByExamen(Long alumnoId, Long examenId);

	public Iterable<Long> findExamenesIdsConRespuestasByAlumno(Long alumnoId);

	public Iterable<Respuesta> findByAlumnoId(Long alumnoId);
	
}
