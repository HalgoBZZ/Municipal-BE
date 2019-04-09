package com.pfe.municipal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pfe.municipal.entities.Compte;
import com.pfe.municipal.entities.type.Role;
import com.pfe.municipal.services.CompteService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class PunicipalApplication implements CommandLineRunner{
	
	@Autowired
	private CompteService service;

	public static void main(String[] args) {
		SpringApplication.run(PunicipalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Compte compte = new Compte();
		compte.setEmail("admin@gmail.com");
		compte.setPwd("admin");
		compte.setRole(Role.Admin);
		
		if(!(service.findByEmail("admin@gmail.com").isPresent())) {
			service.add(compte);
		}
		
		
	}

}
