package com.pfe.municipal.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.municipal.entities.Compte;

@Repository
public interface CompteDao extends JpaRepository<Compte, UUID>{
	
	@Query("select c from Compte c where c.email = :email")
	public Optional<Compte> findByEmail(@Param("email")String email);
}
