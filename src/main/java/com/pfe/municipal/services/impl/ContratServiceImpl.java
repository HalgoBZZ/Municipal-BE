package com.pfe.municipal.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.municipal.dao.ContratDao;
import com.pfe.municipal.entities.Contrat;
import com.pfe.municipal.services.ContratService;

@Service
@Transactional
public class ContratServiceImpl implements ContratService {

	@Autowired
	private ContratDao dao;
	
	@Override
	public void add(Contrat contrat) {
		contrat.setDate_ajout(LocalDate.now());
		contrat.setDate_modification(LocalDate.now());
		dao.save(contrat);
	}

	@Override
	public void update(Contrat contrat) {
		contrat.setDate_modification(LocalDate.now());
		dao.save(contrat);
		
	}

	@Override
	public void delete(UUID id) {
		dao.deleteById(id);
		
	}

	@Override
	public Optional<Contrat> find(UUID id) {
		return dao.findById(id);
	}

	@Override
	public List<Contrat> findAll() {
		return dao.findAll();
	}

}
