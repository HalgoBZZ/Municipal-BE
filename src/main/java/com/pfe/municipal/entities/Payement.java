package com.pfe.municipal.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.pfe.municipal.entities.type.Etat;

@Entity
@Table(name="payement")
public class Payement implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private UUID id;
	
	@Column(name="debut")
	private LocalDate date_debut;
	
	@Column(name="fin")
	private LocalDate date_fin;
	
	@Enumerated(EnumType.STRING)
	@Column(name="etat")
	private Etat etat;
	
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Column(name="modification")
	private LocalDate date_modification;
	
	@OneToMany
	private List<Avertissement> avertissements = new ArrayList<>();
	
	@ManyToOne
	private Contrat contrat;
	
	@OneToMany
	private List<Notification> notifications = new ArrayList<>();
	

	public Payement() {
		super();
	}

	public Payement(UUID id, LocalDate date_debut, LocalDate date_fin, Etat etat, LocalDate date_ajout, LocalDate date_modification) {
		super();
		this.id = id;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.etat = etat;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
	}



	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDate getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(LocalDate date_debut) {
		this.date_debut = date_debut;
	}

	public LocalDate getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(LocalDate date_fin) {
		this.date_fin = date_fin;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
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

	public List<Avertissement> getAvertissements() {
		return avertissements;
	}

	public void setAvertissements(List<Avertissement> avertissements) {
		this.avertissements = avertissements;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}
	

}
