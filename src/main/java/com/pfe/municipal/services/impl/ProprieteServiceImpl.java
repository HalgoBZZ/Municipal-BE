package com.pfe.municipal.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.municipal.dao.ProprieteDao;
import com.pfe.municipal.entities.Propriete;
import com.pfe.municipal.services.ProprieteService;

@Service
@Transactional
public class ProprieteServiceImpl implements ProprieteService{

	@Autowired
	private ProprieteDao dao;

	@Override
	public void add(Propriete propriete) {
		propriete.setDate_ajout(LocalDate.now());
		propriete.setDate_modification(LocalDate.now());
		dao.save(propriete);
	}

	@Override
	public void update(Propriete propriete) {
		propriete.setDate_modification(LocalDate.now());
		dao.save(propriete);
	}

	@Override
	public void delete(UUID id) {
		dao.deleteById(id);
	}

	@Override
	public Optional<Propriete> find(UUID id) {
		return dao.findById(id);
	}

	@Override
	public List<Propriete> findAll() {
		return dao.findAll();
	}

	
}
