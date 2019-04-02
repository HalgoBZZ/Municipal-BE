package com.pfe.municipal.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import ch.qos.logback.core.net.server.Client;

public interface ClientService {
	
	public void add(Client client);
	
	public void update(Client client);
	
	public void delete(UUID id);
	
	public Optional<Client> find(UUID id);
	
	public List<Client> findAll();


}
