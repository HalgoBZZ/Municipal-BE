package com.pfe.municipal.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.pfe.municipal.entities.Contrat;

public interface ContratService {
	
	public void add(Contrat contrat);
	
	public void update(Contrat contrat);
	
	public void delete(UUID id);
	
	public Optional<Contrat> find(UUID id);
	
	public List<Contrat> findAll();

}
