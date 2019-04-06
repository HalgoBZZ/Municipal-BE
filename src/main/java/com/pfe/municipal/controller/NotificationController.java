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

import com.pfe.municipal.entities.Notification;
import com.pfe.municipal.services.NotificationService;

@RestController
@RequestMapping(value="notification")
public class NotificationController {

	@Autowired
	private NotificationService service;
	
	@PostMapping(value="/create")
	public void add(@RequestBody Notification notification) {
		service.add(notification);
	}
	
	@PutMapping(value="/update")
	public void update(@RequestBody Notification notification) {
		service.update(notification);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional<Notification> find(@PathVariable("id") UUID id) {
		return service.find(id);
	}
	
	@GetMapping(value="/all")
	public List<Notification> findAll() {
		return service.findAll();
	}
	
	@DeleteMapping(value="/delete")
	public void delete(@PathVariable("id") UUID id) {
		service.delete(id);
	}
}
