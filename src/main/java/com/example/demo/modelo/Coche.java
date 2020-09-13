package com.example.demo.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "coche")
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

}