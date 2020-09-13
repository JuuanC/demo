package com.example.demo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Coche;

@Repository
public interface ICocheRepositorio extends JpaRepository<Coche, Long> {

}
