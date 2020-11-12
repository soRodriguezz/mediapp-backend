package com.escalab.mediappbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.escalab.mediappbackend.model.Paciente;
import com.escalab.mediappbackend.service.PacienteService;

@RestController
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	
	@GetMapping("/paciente")
	public @ResponseBody List<Paciente> getAll(){
		return pacienteService.getAll();
	}
	
	@PostMapping("/paciente")
	public @ResponseBody Paciente save(@RequestBody Paciente paciente) {
		return pacienteService.save(paciente);
	}

}
