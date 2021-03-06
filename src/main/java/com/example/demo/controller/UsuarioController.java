package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.service.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class UsuarioController implements IController<Usuario> {
	
	UsuarioService usuarioService;
	
	@Autowired
    UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

	@Override
	@GetMapping("/getAll")
	public Object getAll() {
		return usuarioService.getALL();
	}

	@Override
	@GetMapping("/getById/{id}")
	public Usuario getById(@PathVariable("id") Long id) {
		return usuarioService.getById(id);
	}

	@Override
	@PostMapping("/save")
	public Usuario save(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}

	@Override
	@CrossOrigin
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		Usuario tem = usuarioService.getById(id);
		usuarioService.delete(tem);
	}

	@Override
	public Usuario update(Usuario t) {
		// TODO Auto-generated method stub
		return null;
	}

}
