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

import com.pfe.municipal.entities.Avertissement;
import com.pfe.municipal.services.AvertissementService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="avertissement")
public class AvertissementController {
	
	@Autowired
	private AvertissementService service;
	
	@PostMapping(value="/create")
	public void add(@RequestBody Avertissement avertisement) {
		service.add(avertisement);
	}
	
	@PutMapping(value="/update")
	public void update(@RequestBody Avertissement avertissement) {
		service.update(avertissement);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional<Avertissement> find(@PathVariable("id") UUID id) {
		return service.find(id);
	}
	
	@ApiOperation(value = "View a list of available products", response = Iterable.class)
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	@GetMapping(value="/all")
	public List<Avertissement> findAll() {
		return service.findAll();
	}
	
	@DeleteMapping(value="/delete")
	public void delete(@PathVariable("id") UUID id) {
		service.delete(id);
	}

}
