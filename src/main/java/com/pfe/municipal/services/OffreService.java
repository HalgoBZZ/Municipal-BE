package com.pfe.municipal.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.pfe.municipal.entities.Offre;

public interface OffreService {
	
	public void add(Offre offre);
	
	public void update(Offre offre);
	
	public void delete(UUID id);
	
	public Optional<Offre> find(UUID id);
	
	public List<Offre> findAll();

}
