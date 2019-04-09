package com.pfe.municipal.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="contrat")
public class Contrat implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private UUID id_contrat;
	
	@Column(name="titre")
	private String titre_contrat;
	
	@Column(name="debut")
	private LocalDate date_debut;
	
	@Column(name="fin")
	private LocalDate date_fin;
	
	@Column(name="prix")
	private double prix;
	
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Column(name="modification")
	private LocalDate date_modification;

	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="contrat")
	private List<Payement> payements = new ArrayList<>();
	
	@OneToOne
	private Propriete propriete;
	
	
	public Contrat() {
		super();
	}

	public Contrat(UUID id_contrat, String titre_contrat, LocalDate date_debut, LocalDate date_fin, double prix,
			LocalDate date_ajout, LocalDate date_modification) {
		super();
		this.id_contrat = id_contrat;
		this.titre_contrat = titre_contrat;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.prix = prix;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
	}

	public UUID getId_contrat() {
		return id_contrat;
	}

	public void setId_contrat(UUID id_contrat) {
		this.id_contrat = id_contrat;
	}

	public String getTitre_contrat() {
		return titre_contrat;
	}

	public void setTitre_contrat(String titre_contrat) {
		this.titre_contrat = titre_contrat;
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

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
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

	public List<Payement> getPayement() {
		return payements;
	}

	public void setPayement(List<Payement> payements) {
		this.payements = payements;
	}

	public Propriete getPropriete() {
		return propriete;
	}

	public void setPropriete(Propriete propriete) {
		this.propriete = propriete;
	}

	
	
	
	
}
