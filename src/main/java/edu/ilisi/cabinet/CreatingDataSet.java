package edu.ilisi.cabinet;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import edu.ilisi.cabinet.model.actors.Docteur;
import edu.ilisi.cabinet.model.actors.Patient;
import edu.ilisi.cabinet.model.actors.RefSex;
import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;
import edu.ilisi.cabinet.model.dossiersmedicaux.Examen;
import edu.ilisi.cabinet.repositories.actors.DocteurRepository;
import edu.ilisi.cabinet.repositories.actors.SexRepository;
import edu.ilisi.cabinet.services.dossiersmedicaux.DossierMedicalService;

@Component
@Profile(value={"create","create-drop"})
public class CreatingDataSet implements CommandLineRunner {

	@Autowired
	private DossierMedicalService medicalService;

	@Autowired
	private DocteurRepository docteurRepository;

	@Autowired
	private SexRepository sexRepository;

	Patient patient;
	DossierMedical dossierMedical;
	Consultation consultation;
	Docteur docteur;
	Docteur docteurA = new Docteur();
	Docteur docteurB = new Docteur();
	Examen examen;
	int year, month, day;

	RefSex homme = new RefSex();
	RefSex femme = new RefSex();
	Random random = new Random();

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
		docteurA.setDateNaissance(new Date(1970, 10, 15));
		docteurA = docteurRepository.save(docteurA);

		docteurB.setCIN("AA5289");
		docteurB.setEmail("docMourad@email.com");
		docteurB.setNom("ALAMI");
		docteurB.setPrenom("Mourad");
		docteurB.setTelephone("0661234589");
		docteurB.setDateNaissance(new Date(1961, 1, 26));
		docteurB = docteurRepository.save(docteurB);

		for (int i = 0; i < 30; i++) {

			/** Creating Date attributes */
			year = random.nextInt(2000 - 1960) + 1960;
			month = random.nextInt(12 - 1) + 1;
			day = random.nextInt(30 - 1) + 1;

			/** Creating and setting Patient */
			patient = new Patient();
			patient.setCIN("CIN" + i);
			patient.setDateNaissance(new Date(year + "/" + month + "/" + day));
			patient.setEmail("email" + i + i + "@mail.com");
			patient.setNom("nom" + i);
			patient.setPrenom("prenom" + i);

			/** Creating and initiating Sex Reference */
			if (random.nextInt() < 10)
				patient.setRefSex(homme);
			else
				patient.setRefSex(femme);
			year = random.nextInt(2017 - 2010) + 2010;
			patient.setTelephone(100000000 + random.nextInt(900000) + "");

			/** Creating and setting Dossier medical */
			dossierMedical = new DossierMedical();
			dossierMedical.setDateCreation((new Date(year + "/" + month + "/" + day)));
			dossierMedical.setPatient(patient);

			/** Selecting doctor */
			if (random.nextInt() < 10)
				docteur = docteurA;
			else
				docteur = docteurB;
			for (int j = 0; j < 6; j++) {
				/** Creating and setting consultation */
				month = random.nextInt(12 - 1) + 1;
				day = random.nextInt(30 - 1) + 1;
				consultation = new Consultation();
				consultation.setDateConsultation(new Date(year + "/" + month + "/" + day));
				consultation.setDossierMedical(dossierMedical);
				consultation.setDocteur(docteur);
				consultation.setDuree(30);

				if (month < 6) {
					examen = new Examen();
					examen.setConsultation(consultation);
					examen.setDescription(UUID.randomUUID().toString());
					examen.setConsultation(consultation);
					consultation.setExamen(examen);
				}

				dossierMedical.getConsultations().add(consultation);
			}
			medicalService.addDossieMecial(dossierMedical);
		}
	}

}
