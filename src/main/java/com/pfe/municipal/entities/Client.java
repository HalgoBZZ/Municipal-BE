package com.pfe.municipal.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.pfe.municipal.entities.type.Role;

@Entity
@Table(name="client")
public class Client extends Compte implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="nom")
	private String nom_client;
	
	@Column(name="prenom")
	private String prenom_client;
	
	@Column(name="date_naissance")
	private LocalDate date_naissance;
	
	@Column(name="cin")
	private int cin;
	
	@OneToMany
	private List<Avertissement> avertissements = new ArrayList<>();
	
	@OneToOne
	private Contrat contrat;
	
	@OneToMany
	private List<Propriete> proprietes = new ArrayList<>();

	public Client() {
		super();
	}
	

	public Client(UUID id_compte, String pwd, String email, Role role, LocalDate date_ajout,
			LocalDate date_modification) {
		super(id_compte, pwd, email, role, date_ajout, date_modification);
		
	}


	public Client(String nom_client, String prenom_client, LocalDate date_naissance, int cin) {
		super();
		this.nom_client = nom_client;
		this.prenom_client = prenom_client;
		this.date_naissance = date_naissance;
		this.cin = cin;
	}

	public Client(UUID id_compte, String pwd, String email, Role role, LocalDate date_ajout,
			LocalDate date_modification, String nom_client, String prenom_client, LocalDate date_naissance, int cin) {
		super(id_compte, pwd, email, role, date_ajout, date_modification);
		this.nom_client = nom_client;
		this.prenom_client = prenom_client;
		this.date_naissance = date_naissance;
		this.cin = cin;
	}

	public String getNom_client() {
		return nom_client;
	}

	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}

	public String getPrenom_client() {
		return prenom_client;
	}

	public void setPrenom_client(String prenom_client) {
		this.prenom_client = prenom_client;
	}

	public LocalDate getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(LocalDate date_naissance) {
		this.date_naissance = date_naissance;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
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


	public List<Propriete> getProprietes() {
		return proprietes;
	}


	public void setProprietes(List<Propriete> proprietes) {
		this.proprietes = proprietes;
	}

	
}
