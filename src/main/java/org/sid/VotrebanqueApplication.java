package org.sid;

import org.sid.dao.ClientRepository;
import org.sid.dao.CompteRepository;
import org.sid.dao.OperationRepository;
import org.sid.entities.*;
import org.sid.metier.IBanqueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

@SpringBootApplication
public class VotrebanqueApplication implements CommandLineRunner {
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private OperationRepository operationRepository;

	@Autowired
	private IBanqueMetier banqueMetier;

	public static void main(String[] args) {
		SpringApplication.run(VotrebanqueApplication.class, args);
		}

	@Override
	public void run(String... strings) throws Exception {

	/*
		Client c1=clientRepository.save(new Client("hassan", "hassan@gmailcom"));
		Client c2=clientRepository.save(new Client("mizo", "mizo@gmailcom"));
		
		Compte cp1=compteRepository.save(
				new CompteCourant("c1",new Date(),9000.0,c1,6000));
		Compte cp2=compteRepository.save(
				new CompteEpargne("c2",new Date(),6500.0,c2,5.5));

		operationRepository.save(new Versement(new Date(),9000,cp1));
		operationRepository.save(new Versement(new Date(),6000,cp1));
		operationRepository.save(new Versement(new Date(),2300,cp1));
		operationRepository.save(new Retrait(new Date(),9000,cp1));

		operationRepository.save(new Versement(new Date(),10000,cp2));
		operationRepository.save(new Versement(new Date(),2300,cp2));
		operationRepository.save(new Versement(new Date(),9000,cp2));
		operationRepository.save(new Retrait(new Date(),8000,cp2));

		banqueMetier.verser("c1",111111);
		*/

	}
}
