package com.pfe.municipal.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.municipal.dao.ClientDao;
import com.pfe.municipal.entities.Client;
import com.pfe.municipal.services.ClientService;


@Service
@Transactional
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientDao dao;

	@Override
	public void add(Client client) {
		client.setDate_ajout(LocalDate.now());
		client.setDate_modification(LocalDate.now());
		dao.save(client);
		
	}

	@Override
	public void update(Client client) {
		client.setDate_modification(LocalDate.now());
		dao.save(client);
	}

	@Override
	public void delete(UUID id) {
		dao.deleteById(id);
		
	}

	@Override
	public Optional<Client> find(UUID id) {
		return dao.findById(id);
	}

	@Override
	public List<Client> findAll() {
		return dao.findAll();
	}

}
