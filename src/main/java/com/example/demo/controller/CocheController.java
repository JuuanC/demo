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

import com.example.demo.modelo.Coche;
import com.example.demo.service.CocheService;

@CrossOrigin
@RestController
@RequestMapping("/coche")
public class CocheController implements IController<Coche> {
	
	CocheService cocheService;
	
	@Autowired
	CocheController(CocheService cocheService) {
        this.cocheService = cocheService;
    }

	@Override
	@GetMapping("/getAll")
	public Object getAll() {
		return cocheService.getALL();
	}

	@Override
	@GetMapping("/getById/{id}")
	public Coche getById(@PathVariable("id") Long id) {
		return cocheService.getById(id);
	}

	@Override
	@PostMapping("/save")
	public Coche save(@RequestBody Coche coche) {
		System.out.println(coche);
		return cocheService.save(coche);
	}

	@Override
	@CrossOrigin
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		Coche cocheTem = cocheService.getById(id);
		cocheService.delete(cocheTem);
	}

}
