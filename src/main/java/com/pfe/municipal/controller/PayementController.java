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

import com.pfe.municipal.entities.Payement;
import com.pfe.municipal.services.PayementService;

@RestController
@RequestMapping(value="payement")
public class PayementController {

	@Autowired
	private PayementService service;
	
	@PostMapping(value="/create")
	public void add(@RequestBody Payement payement) {
		service.add(payement);
	}
	
	@PutMapping(value="/update")
	public void update(@RequestBody Payement payement) {
		service.update(payement);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional<Payement> findPayement(@PathVariable("id")UUID id){
		return service.find(id);
	}
	
	@GetMapping(value="/all")
	public List<Payement> findAll() {
		return service.findAll();
	}
	
	@DeleteMapping(value="/dalete/{id}")
	public void delete(@PathVariable("id") UUID id) {
		service.delete(id);
	}
}
