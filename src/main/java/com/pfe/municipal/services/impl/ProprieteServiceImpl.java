package com.pfe.municipal.services.impl;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Propriete propriete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Propriete> find(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Propriete> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
