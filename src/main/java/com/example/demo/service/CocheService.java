package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Coche;
import com.example.demo.persistence.ICocheRepositorio;

@Service
public class CocheService {
	
	private final ICocheRepositorio cocheRepositorio;
	
	@Autowired
	private CocheService(ICocheRepositorio cocheRepositorio) {
		this.cocheRepositorio = cocheRepositorio;
	}
	
	public Coche save(Coche coche) {
		return cocheRepositorio.save(coche);
	}
	
	public void delete(Coche coche) {
		cocheRepositorio.delete(coche);
	}
	
	public List<Coche> getALL() {
		return cocheRepositorio.findAll();
	}
	
	public Coche getById(Long id){
		Optional<Coche> optionalCoche = cocheRepositorio.findById(id);
        if (optionalCoche.isPresent()) {
            return optionalCoche.get();
        } else {
            return null;
        }
	}
	
	public Coche update(Coche coche) {
		return cocheRepositorio.save(coche);
	}


}
