package edu.ilisi.cabinet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.ilisi.cabinet.model.dossiersmedicaux.Medicament;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.MedicamentRepository;

@SpringBootApplication
public class CabinetMedApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabinetMedApplication.class, args);

	}
	
	@Autowired
	MedicamentRepository repo;
	private Medicament medicament = new Medicament();

	@Bean
	public CommandLineRunner init() {

		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				medicament.setLibelle("Doliprane");
				medicament.setDescription("Doliprane pout tlm");
				System.err.println("ehllo");
				medicament = repo.save(medicament);
				System.out.println(repo.findAll());
			}
		};

	}
}
