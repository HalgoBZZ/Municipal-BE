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

import com.pfe.municipal.entities.Propriete;
import com.pfe.municipal.services.ProprieteService;

@RestController
@RequestMapping(value="propriete")
public class ProprieteController {
	
	@Autowired
	private ProprieteService service;
	
	@PostMapping(value="/create")
	public  void add(@RequestBody Propriete propriete) {
		service.add(propriete);
	}
	
	@PutMapping(value="/update")
	public void update(@RequestBody Propriete propriete) {
	service.update(propriete);
	}

	@GetMapping(value="/find/{id}")
	public Optional<Propriete> find(@PathVariable("id") UUID id){
		return service.find(id);
	}
	
	@GetMapping(value="/all")
	public List<Propriete> findAll(){
		return service.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") UUID id) {
		service.delete(id);
	}

}
