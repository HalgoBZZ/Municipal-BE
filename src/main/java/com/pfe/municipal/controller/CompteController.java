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

import com.pfe.municipal.entities.Compte;
import com.pfe.municipal.services.CompteService;

@RestController
@RequestMapping(value="compte")
public class CompteController {

	@Autowired
	private CompteService service;
	
	@PostMapping(value="/create")
	public void add(@RequestBody Compte compte) {
		service.add(compte);
	}
	
	@PutMapping(value="/update")
	public void update(@RequestBody Compte compte) {
		service.update(compte);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional<Compte> find(@PathVariable("id") UUID id) {
		return service.find(id);
	}
	
	@GetMapping(value="/all")
	public List<Compte> findAll() {
		return service.findAll();
	}
	
	@DeleteMapping(value="/delete")
	public void delete(@PathVariable("id") UUID id) {
		service.delete(id);
	}
	
	@GetMapping(value="/findByEmail/{email}")
	public Optional<Compte> findByEmail(@PathVariable("email") String email) {
		return service.findByEmail(email);
	}
}
