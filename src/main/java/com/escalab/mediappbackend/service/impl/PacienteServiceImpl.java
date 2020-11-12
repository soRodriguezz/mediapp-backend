package com.escalab.mediappbackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escalab.mediappbackend.model.Paciente;
import com.escalab.mediappbackend.repo.PacienteRepoInterface;
import com.escalab.mediappbackend.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	private PacienteRepoInterface repoInterface;

	@Override
	public List<Paciente> getAll() {
		return repoInterface.findAll();
	}

	@Override
	public Paciente save(Paciente paciente) {
		return repoInterface.save(paciente);
	}
	
	

}
