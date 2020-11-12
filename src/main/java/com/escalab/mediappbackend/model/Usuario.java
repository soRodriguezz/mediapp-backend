package com.escalab.mediappbackend.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario{
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	
	@Column(name = "nombre", nullable = false, length = 70)
	private String nombre;
	
	@Column(name = "clave", nullable = false, length = 70)
	private String clave;
	
	@Column(name = "estado", nullable = false, length = 70)
	private boolean estado;
	
	
	@ManyToMany(mappedBy = "usuarioRol")
    private List<Rol> urol;
	
}
