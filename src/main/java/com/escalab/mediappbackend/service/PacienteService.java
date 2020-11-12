package com.escalab.mediappbackend.service;

import java.util.List;

import com.escalab.mediappbackend.model.Paciente;

public interface PacienteService {
	
	List<Paciente> getAll();
	
	Paciente save(Paciente paciente);

}
