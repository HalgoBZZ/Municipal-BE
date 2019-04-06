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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.pfe.municipal.entities.type.Role;

@Entity
@Table(name="compte")
@Proxy(lazy=false)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Compte implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	protected UUID id_compte;
	
	@Column(name="pwd")
	protected String pwd;
	
	@Column(name="email")
	protected String email;
	
	@Enumerated(EnumType.STRING)
	@Column(name="role")
	protected Role role;
	
	@Column(name="ajout")
	protected LocalDate date_ajout;
	
	@Column(name="modifie")
	protected LocalDate date_modification;
	

	public Compte() {
		super();
	}

	public Compte(UUID id_compte, String pwd, String email, Role role, LocalDate date_ajout,
			LocalDate date_modification) {
		super();
		this.id_compte = id_compte;
		this.pwd = pwd;
		this.email = email;
		this.role = role;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
	}



	public UUID getId_compte() {
		return id_compte;
	}

	public void setId_compte(UUID id_compte) {
		this.id_compte = id_compte;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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
	

}
