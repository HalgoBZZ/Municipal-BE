package com.pfe.municipal.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.municipal.dao.CompteDao;
import com.pfe.municipal.entities.Compte;
import com.pfe.municipal.services.CompteService;

@Service
@Transactional
public class CompteServiceImpl implements CompteService{

	@Autowired
	private CompteDao dao;
	
	@Override
	public void add(Compte compte) {
		compte.setDate_ajout(LocalDate.now());
		compte.setDate_modification(LocalDate.now());
		dao.save(compte);
		
	}

	@Override
	public void update(Compte compte) {
		compte.setDate_modification(LocalDate.now());
		dao.save(compte);
	}

	@Override
	public void delete(UUID id) {
		dao.deleteById(id);
	}

	@Override
	public Optional<Compte> find(UUID id) {
		return dao.findById(id);
	}

	@Override
	public List<Compte> findAll() {
		return dao.findAll();
	}

	@Override
	public Optional<Compte> findByEmail(String email) {
		return dao.findByEmail(email);
	}

	
}
