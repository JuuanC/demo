package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity(name = "usuario")
@Data
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nombre;
	
	@Column
	private String telefono;
	
	@Column
	private String correo;
	
	@Column
	private String usuario;
	
	@Column
	private String contrasenia;

	public Usuario(String nombre, String telefono, String correo, String usuario, String contrasenia) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}
	
}
