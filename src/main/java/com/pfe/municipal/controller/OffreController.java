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

import com.pfe.municipal.entities.Offre;
import com.pfe.municipal.services.OffreService;

@RestController
@RequestMapping(value="offre")
public class OffreController {
	
	@Autowired
	private OffreService service;
	
	@PostMapping(value="/create")
	public void add(@RequestBody Offre offre) {
		service.add(offre);
	}
	
	@PutMapping(value="/update")
	public void update(@RequestBody Offre offre) {
		service.update(offre);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional<Offre> find(@PathVariable("id") UUID id) {
		return service.find(id);
	}
	
	@GetMapping(value="/all")
	public List<Offre> findAll() {
		return service.findAll();
	}
	
	@DeleteMapping(value="/delete")
	public void delete(@PathVariable("id") UUID id) {
		service.delete(id);
	}

}
