package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.service.UsuarioService;

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
	@DeleteMapping("delete")
	public void delete(@RequestBody Usuario usuario) {
		usuarioService.delete(usuario);
	}

}
