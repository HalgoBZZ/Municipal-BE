package com.pfe.municipal.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="notification")
public class Notification implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private UUID id_notification;
	
	@Column(name="nb_jour")
	private int nb_jour;
	
	@Column(name="titre")
	private String titre_notification;
	
	@Column(name="description")
	private String description_notification;
	
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Column(name="modification")
	private LocalDate date_modification;
	
	@ManyToOne
	private Payement payement;

	public Notification() {
		super();
	}

	public Notification(UUID id_notification, int nb_jour, String titre_notification, String description_notification,
			LocalDate date_ajout, LocalDate date_modification) {
		super();
		this.id_notification = id_notification;
		this.nb_jour = nb_jour;
		this.titre_notification = titre_notification;
		this.description_notification = description_notification;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
	}

	public UUID getId_notification() {
		return id_notification;
	}

	public void setId_notification(UUID id_notification) {
		this.id_notification = id_notification;
	}

	public int getNb_jour() {
		return nb_jour;
	}

	public void setNb_jour(int nb_jour) {
		this.nb_jour = nb_jour;
	}

	public String getTitre_notification() {
		return titre_notification;
	}

	public void setTitre_notification(String titre_notification) {
		this.titre_notification = titre_notification;
	}

	public String getDescription_notification() {
		return description_notification;
	}

	public void setDescription_notification(String description_notification) {
		this.description_notification = description_notification;
	}

	public LocalDate getDate_ajout() {
		return date_ajout;
	}

	public void setDate_ajout(LocalDate date_ajout) {
		this.date_ajout = date_ajout;
	}

	public LocalDate getDate_modification() {
		return date_modification;
	}

	public void setDate_modification(LocalDate date_modification) {
		this.date_modification = date_modification;
	}

	public Payement getPayement() {
		return payement;
	}

	public void setPayement(Payement payement) {
		this.payement = payement;
	}
	
	

}
