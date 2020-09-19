package com.example.demo.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Coche;

@Repository
public interface ICocheRepositorio extends CrudRepository<Coche, Long> {
	List<Coche> findAll();

}
