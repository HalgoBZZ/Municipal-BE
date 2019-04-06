package com.pfe.municipal.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.municipal.dao.OffreDao;
import com.pfe.municipal.entities.Offre;
import com.pfe.municipal.services.OffreService;

@Service
@Transactional
public class OffreServiceImpl implements OffreService{

	@Autowired
	private OffreDao dao;
	
	@Override
	public void add(Offre offre) {
		offre.setDate_ajout(LocalDate.now());
		offre.setDate_modification(LocalDate.now());
		dao.save(offre);
	}

	@Override
	public void update(Offre offre) {
		offre.setDate_modification(LocalDate.now());
		dao.save(offre);
	}

	@Override
	public void delete(UUID id) {
		dao.deleteById(id);
	}

	@Override
	public Optional<Offre> find(UUID id) {
		return dao.findById(id);
	}

	@Override
	public List<Offre> findAll() {
		return dao.findAll();
	}

}
