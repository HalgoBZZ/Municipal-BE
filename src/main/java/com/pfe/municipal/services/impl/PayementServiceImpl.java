package com.pfe.municipal.services.impl;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Payement payement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Payement> find(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payement> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
