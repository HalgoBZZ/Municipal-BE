package com.pfe.municipal.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.pfe.municipal.entities.Payement;

public interface PayementService {
	
	public void add(Payement payement);
	
	public void update(Payement payement);
	
	public void delete(UUID id);
	
	public Optional<Payement> find(UUID id);
	
	public List<Payement> findAll();

}
