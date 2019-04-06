package com.pfe.municipal.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.municipal.dao.AvertissementDao;
import com.pfe.municipal.entities.Avertissement;
import com.pfe.municipal.services.AvertissementService;

@Service
@Transactional
public class AvertissementServiceImpl implements AvertissementService{
	
	@Autowired
	private AvertissementDao dao;

	@Override
	public void add(Avertissement avertissement) {
		avertissement.setDate_ajout(LocalDate.now());
		avertissement.setDate_modification(LocalDate.now());
		dao.save(avertissement);
		
	}

	@Override
	public void update(Avertissement avertissement) {
		avertissement.setDate_modification(LocalDate.now());
		dao.save(avertissement);
	}

	@Override
	public void delete(UUID id) {
		dao.deleteById(id);
		
	}

	@Override
	public Optional<Avertissement> find(UUID id) {
		return dao.findById(id);
	}

	@Override
	public List<Avertissement> findAll() {
		return dao.findAll();
	}


}
