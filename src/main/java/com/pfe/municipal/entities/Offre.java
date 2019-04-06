package com.pfe.municipal.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.pfe.municipal.entities.type.EtatOffre;

@Entity
@Table(name="offre")
public class Offre implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private UUID id_offre;
	
	@Column(name="titre")
	private String titre_offre;
	
	@Column(name="description")
	private String description_offre;
	
	@Enumerated(EnumType.STRING)
	@Column(name="etat")
	private EtatOffre etat;
	
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Column(name="modification")
	private LocalDate date_modification;
	
	@Column(name="prix")
	private double prix_offre;
	
	@ManyToOne
	private Propriete propriete;
	

	public Offre() {
		super();
	}

	public Offre(UUID id_offre, String titre_offre, String description_offre, EtatOffre etat, LocalDate date_ajout,
			LocalDate date_modification, double prix_offre) {
		super();
		this.id_offre = id_offre;
		this.titre_offre = titre_offre;
		this.description_offre = description_offre;
		this.etat = etat;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
		this.prix_offre = prix_offre;
	}

	public UUID getId_offre() {
		return id_offre;
	}

	public void setId_offre(UUID id_offre) {
		this.id_offre = id_offre;
	}

	public String getTitre_offre() {
		return titre_offre;
	}

	public void setTitre_offre(String titre_offre) {
		this.titre_offre = titre_offre;
	}

	public String getDescription_offre() {
		return description_offre;
	}

	public void setDescription_offre(String description_offre) {
		this.description_offre = description_offre;
	}

	public EtatOffre getEtat() {
		return etat;
	}

	public void setEtat(EtatOffre etat) {
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

	public double getPrix_offre() {
		return prix_offre;
	}

	public void setPrix_offre(double prix_offre) {
		this.prix_offre = prix_offre;
	}

	public Propriete getPropriete() {
		return propriete;
	}

	public void setPropriete(Propriete propriete) {
		this.propriete = propriete;
	}
	

}
