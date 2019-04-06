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
@Table(name="avertissement")
public class Avertissement implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private UUID id_avert;
	
	@Column(name="titre")
	private String titre_avert;
	
	@Column(name="contenu")
	private String contenu;
	
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Column(name="modifie")
	private LocalDate date_modification;
	
	@ManyToOne
	private Client client;
	
	@ManyToOne
	private Payement payement;

	public Avertissement() {
		super();
	}

	public Avertissement(UUID id_avert, String titre_avert, String contenu, LocalDate date_ajout,
			LocalDate date_modification) {
		super();
		this.id_avert = id_avert;
		this.titre_avert = titre_avert;
		this.contenu = contenu;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
	}

	public UUID getId_avert() {
		return id_avert;
	}

	public void setId_avert(UUID id_avert) {
		this.id_avert = id_avert;
	}

	public String getTitre_avert() {
		return titre_avert;
	}

	public void setTitre_avert(String titre_avert) {
		this.titre_avert = titre_avert;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Payement getPayement() {
		return payement;
	}

	public void setPayement(Payement payement) {
		this.payement = payement;
	}

	
}
