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
@Table(name = "rol")
public class Rol {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer idRol;

	    @Column(name = "nombre", nullable = false, length = 70)
	    private String nombre;
	
	    @ManyToMany(mappedBy = "menuRol")
	    private List<Menu> mrol;
	    
	    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "idRol", nullable = false),
			     inverseJoinColumns = @JoinColumn(name="idUsuario", nullable = false))
			     @ManyToMany(cascade = CascadeType.ALL)
			     private List<Usuario> usuarioRol;
	    
}
