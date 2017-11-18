package edu.ilisi.cabinet;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.ilisi.cabinet.model.actors.Docteur;
import edu.ilisi.cabinet.model.actors.Patient;
import edu.ilisi.cabinet.model.actors.RefSex;
import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.DocteurRepository;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.SexRepository;
import edu.ilisi.cabinet.services.DossierMedicalService;

@SpringBootApplication
public class CabinetMedApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CabinetMedApplication.class, args);
	}

	@Autowired
	private DossierMedicalService medicalService;

	@Autowired
	private DocteurRepository docteurRepository;

	@Autowired
	private SexRepository sexRepository;

	Patient patient;
	DossierMedical dossierMedical;
	Consultation consultation;
	Docteur docteur ;
	Docteur docteurA = new Docteur();
	Docteur docteurB = new Docteur();
	RefSex homme = new RefSex();
	RefSex femme = new RefSex();
	Random random = new Random();
	int year, month, day;

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... arg0) throws Exception {
		homme.setLibelle("Homme");
		femme.setLibelle("Femme");
		homme = sexRepository.save(homme);
		femme = sexRepository.save(femme);
		/** Setting doctor */
		docteurA.setCIN("AA5289");
		docteurA.setEmail("docSami@email.com");
		docteurA.setNom("SAMADI");
		docteurA.setPrenom("Samad");
		docteurA.setTelephone("0661234589");
		docteurA = docteurRepository.save(docteurA);
		
		docteurB.setCIN("AA5289");
		docteurB.setEmail("docMourad@email.com");
		docteurB.setNom("ALAMI");
		docteurB.setPrenom("Mourad");
		docteurB.setTelephone("0661234589");
		docteurB = docteurRepository.save(docteurB);
		
		for (int i = 0; i < 30; i++) {

			/** Creating Date attributes */
			year = random.nextInt(2000 - 1960) + 1960;
			month = random.nextInt(12 - 1) + 1;
			day = random.nextInt(30 - 1) + 1;

			/** Creating and setting Patient */
			patient = new Patient();
			patient.setCIN("CIN" + i);
			patient.setDate_naissance(new Date(year + "/" + month + "/" + day));
			patient.setEmail("email" + i + i + "@mail.com");
			patient.setNom("nom" + i);
			patient.setPrenom("prenom" + i);

			/** Creating and initiating Sex Reference */
			if (random.nextInt() < 10)
				patient.setRef_sex(homme);
			else
				patient.setRef_sex(femme);
			year = random.nextInt(2017 - 2010) + 2010;
			patient.setTelephone(100000000 + random.nextInt(900000) + "");

			/** Creating and setting Dossier medical */
			dossierMedical = new DossierMedical();
			dossierMedical.setDate_creation(new Date(year + "/" + month + "/" + day));
			dossierMedical.setPatient(patient);
			
			/**Selecting doctor*/
			if (random.nextInt() < 10)
				docteur = docteurA;
			else
				docteur = docteurB;
			for (int j = 0; j < 6; j++) {
				/** Creating and setting consultation */
				month = random.nextInt(12 - 1) + 1;
				day = random.nextInt(30 - 1) + 1;
				consultation = new Consultation();
				consultation.setDate_consultation(new Date(year + "/" + month + "/" + day));
				consultation.setDossiermedical(dossierMedical);
				consultation.setDocteur(docteur);
				dossierMedical.getConsultations().add(consultation);
			}
			medicalService.addDossieMecial(dossierMedical);
		}
	}
}
