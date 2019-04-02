package com.pfe.municipal.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.pfe.municipal.entities.Propriete;

public interface ProprieteService {
	
	public void add(Propriete propriete);
	
	public void update(Propriete propriete);
	
	public void delete(UUID id);
	
	public Optional<Propriete> find(UUID id);
	
	public List<Propriete> findAll();

}
