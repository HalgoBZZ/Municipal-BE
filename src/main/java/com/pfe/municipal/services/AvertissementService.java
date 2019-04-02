package com.pfe.municipal.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pfe.municipal.entities.Avertissement;

@Service
@Transactional
public interface AvertissementService {
	
	public void add(Avertissement avertissement);
	
	public void update(Avertissement avertissement);
	
	public void delete(UUID id);
	
	public Optional<Avertissement> find(UUID id);
	
	public List<Avertissement> findAll();

}
