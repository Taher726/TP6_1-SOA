package com.example.FaresDammak_SOA_TP6;

import com.example.FaresDammak_SOA_TP6.entities.Compte;
import com.example.FaresDammak_SOA_TP6.entities.EtatCompte;
import com.example.FaresDammak_SOA_TP6.entities.TypeCompte;
import com.example.FaresDammak_SOA_TP6.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class FaresDammakSoaTp6Application {

	public static void main(String[] args) {

		SpringApplication.run(FaresDammakSoaTp6Application.class, args);
	}
	@Bean
	public CommandLineRunner start(CompteRepository compt){
		return args -> {
			compt.save(new Compte(null,150,new Date(), TypeCompte.COURANT, EtatCompte.ACTIVE));
			compt.save(new Compte(null,500,new Date(), TypeCompte.COURANT,EtatCompte.SUSPENDU));
			compt.save(new Compte(null,750,new Date(), TypeCompte.EPARGNE,EtatCompte.BLOQUE));
			compt.findAll().forEach(compte ->{
				System.out.println(compte.getSolde());
			} );
		};

	}
}
