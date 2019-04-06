package com.pfe.municipal.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.municipal.dao.PayementDao;
import com.pfe.municipal.entities.Payement;
import com.pfe.municipal.services.PayementService;

@Service
@Transactional
public class PayementServiceImpl implements PayementService{

	@Autowired
	private PayementDao dao;
	
	
	@Override
	public void add(Payement payement) {
		payement.setDate_ajout(LocalDate.now());
		payement.setDate_modification(LocalDate.now());
		dao.save(payement);
	}

	@Override
	public void update(Payement payement) {
		payement.setDate_modification(LocalDate.now());
		dao.save(payement);
	}

	@Override
	public void delete(UUID id) {
		dao.deleteById(id);
	}

	@Override
	public Optional<Payement> find(UUID id) {
		return dao.findById(id);
	}

	@Override
	public List<Payement> findAll() {
		return dao.findAll();
	}

}
