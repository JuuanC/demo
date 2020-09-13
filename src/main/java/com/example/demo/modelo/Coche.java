package com.example.demo.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "coche")
@Data
public class Coche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String marca;
	
	@Column
	private String modelo;
	
	@Column
	private String color;
	
	@Column
	private Long id_usuario;

	public Coche(Long id, String marca, String modelo, String color, Long id_usuario) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.id_usuario = id_usuario;
	}

}
