package com.pfe.municipal.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.pfe.municipal.entities.Notification;

public interface NotificationService {
	
	public void add(Notification notification);
	
	public void update(Notification notification);
	
	public void delete(UUID id);
	
	public Optional<Notification> find(UUID id);
	
	public List<Notification> findAll();

}
