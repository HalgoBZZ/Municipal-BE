package com.pfe.municipal.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.pfe.municipal.entities.Compte;

public interface CompteService {

	public void add(Compte compte);
	
	public void update(Compte compte);
	
	public void delete(UUID id);
	
	public Optional<Compte> find(UUID id);
	
	public List<Compte> findAll();
	
	public Optional<Compte> findByEmail(String email);
}
