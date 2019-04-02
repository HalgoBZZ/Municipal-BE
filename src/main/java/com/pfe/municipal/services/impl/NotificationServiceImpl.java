package com.pfe.municipal.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.municipal.dao.NotificationDao;
import com.pfe.municipal.entities.Notification;
import com.pfe.municipal.services.NotificationService;

@Service
@Transactional
public class NotificationServiceImpl implements NotificationService{

	@Autowired
	private NotificationDao dao;
	
	@Override
	public void add(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Notification> find(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notification> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
