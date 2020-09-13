package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Usuario;
import com.example.demo.persistence.IUsuarioRepositorio;


@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepositorio usuarioRepositorio;
	
	public Usuario save(Usuario usuario) {
		return usuarioRepositorio.save(usuario);
	}
	
	public void delete(Usuario usuario) {
		usuarioRepositorio.delete(usuario);
	}
	
	public List<Usuario> getALL() {
		return usuarioRepositorio.findAll();
	}
	
	public Usuario getById(Long id){
		Optional<Usuario> optionalUsuario = usuarioRepositorio.findById(id);
        if (optionalUsuario.isPresent()) {
            return optionalUsuario.get();
        } else {
            return null;
        }
	}

}
