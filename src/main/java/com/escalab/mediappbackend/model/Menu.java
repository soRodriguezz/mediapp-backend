package com.escalab.mediappbackend.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu{
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMenu;
	
	@Column(name = "nombre", nullable = false, length = 70)
	private String nombre;
	
	@Column(name = "url", nullable = false, length = 70)
	private String url;
	
	@Column(name = "icono", nullable = false, length = 70)
	private String icono;
	
	@JoinTable(name = "menu_rol", joinColumns = @JoinColumn(name = "idMenu", nullable = false),
		     inverseJoinColumns = @JoinColumn(name="idRol", nullable = false))
		     @ManyToMany(cascade = CascadeType.ALL)
		     private List<Rol> menuRol;
	
	
	
}
