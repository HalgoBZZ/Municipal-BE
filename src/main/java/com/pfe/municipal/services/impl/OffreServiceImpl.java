package com.pfe.municipal.services.impl;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Offre offre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Offre> find(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Offre> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
