package com.pfe.municipal.services.impl;

import java.time.LocalDate;
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
		notification.setDate_ajout(LocalDate.now());
		notification.setDate_modification(LocalDate.now());
		dao.save(notification);
	}

	@Override
	public void update(Notification notification) {
		notification.setDate_modification(LocalDate.now());
		dao.save(notification);
	}

	@Override
	public void delete(UUID id) {
		dao.deleteById(id);
	}

	@Override
	public Optional<Notification> find(UUID id) {
		return dao.findById(id);
	}

	@Override
	public List<Notification> findAll() {
		return dao.findAll();
	}

}
