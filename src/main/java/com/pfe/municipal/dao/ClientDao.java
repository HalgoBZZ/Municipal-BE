package com.pfe.municipal.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.municipal.entities.Client;


@Repository
public interface ClientDao extends JpaRepository<Client, UUID>{

}
