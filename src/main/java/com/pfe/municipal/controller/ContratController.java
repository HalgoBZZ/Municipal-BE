package com.pfe.municipal.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.municipal.entities.Contrat;
import com.pfe.municipal.services.ContratService;

@RestController
@RequestMapping(value="contrat")
public class ContratController {
	
	@Autowired
	private ContratService service;
	
	@PostMapping(value="/create")
	public void add(@RequestBody Contrat contrat) {
		service.add(contrat);
	}
	
	@PutMapping(value="/update")
	public void update(@RequestBody Contrat contrat) {
		service.update(contrat);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional<Contrat> find(@PathVariable("id") UUID id) {
		return service.find(id);
	}
	
	@GetMapping(value="/all")
	public List<Contrat> findAll() {
		return service.findAll();
	}
	
	@DeleteMapping(value="/delete")
	public void delete(@PathVariable("id") UUID id) {
		service.delete(id);
	}

}
