package com.pfe.municipal.entities;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.pfe.municipal.entities.type.Type;

@Entity
@Table(name="propriete")
public class Propriete {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private UUID id_prop;
	
	@Column(name="surface")
	private double surface_prop;
	
	@Column(name="adresse")
	private String adresse;
	
	@Enumerated(EnumType.STRING)
	@Column(name="type")
	private Type type;
	
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Column(name="modification")
	private LocalDate date_modification;
	
	@OneToMany
	private List<Offre> offres;
	
	@OneToOne
	private Contrat contrat;
	
	@ManyToOne
	private Client client;

	public Propriete() {
		super();
	}
	
	

	public Propriete(UUID id_prop, double surface_prop, String adresse, Type type, LocalDate date_ajout,
			LocalDate date_modification) {
		super();
		this.id_prop = id_prop;
		this.surface_prop = surface_prop;
		this.adresse = adresse;
		this.type = type;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
		offres = new ArrayList<>();
	}



	public UUID getId_prop() {
		return id_prop;
	}

	public void setId_prop(UUID id_prop) {
		this.id_prop = id_prop;
	}

	public double getSurface_prop() {
		return surface_prop;
	}

	public void setSurface_prop(double surface_prop) {
		this.surface_prop = surface_prop;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
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



	public List<Offre> getOffres() {
		return offres;
	}



	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}



	public Contrat getContrat() {
		return contrat;
	}



	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}



	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}
	
	
}
