package edu.ilisi.cabinet;

import java.security.SecureRandom;
import java.sql.Time;
import java.util.Date;
import java.util.List;
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
import edu.ilisi.cabinet.model.gestionfinanciere.Depense;
import edu.ilisi.cabinet.model.rendezvous.RendezVous;
import edu.ilisi.cabinet.repositories.actors.SexRepository;
import edu.ilisi.cabinet.repositories.gestionfinanciere.DepenseRepository;
import edu.ilisi.cabinet.services.actors.DocteurService;
import edu.ilisi.cabinet.services.actors.PatientService;
import edu.ilisi.cabinet.services.dossiersmedicaux.DossierMedicalService;
import edu.ilisi.cabinet.services.rendezvous.RendezVousService;

@Component
@Profile(value = { "create", "create-drop" })
public class CreatingDataSet implements CommandLineRunner {

	@Autowired
	private DossierMedicalService medicalService;

	@Autowired
  private DocteurService docteurService;
	
	@Autowired
  private PatientService patientService;

	@Autowired
	private SexRepository sexRepository;

	@Autowired
	DepenseRepository depenseRepository;

	@Autowired
	RendezVousService rendezvousService;

	Patient patient;
	DossierMedical dossierMedical;
	Consultation consultation;
	Docteur docteur;
	Docteur docteurA = new Docteur();
	Docteur docteurB = new Docteur();
	Examen examen;
	Date dateConsultation = null;
	RendezVous rendezVous;
	List<Consultation> consultations;
	int year;
	int month;
	int day;

	RefSex homme = new RefSex();
	RefSex femme = new RefSex();
	Random random = new SecureRandom();
	Depense depense = null;

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
		docteurA.setUsername("samadi");
		docteurA.setPassword("password");
		docteurA = docteurService.addDocteur(docteurA);

		docteurB.setCIN("AA5289");
		docteurB.setEmail("docMourad@email.com");
		docteurB.setNom("ALAMI");
		docteurB.setPrenom("Mourad");
		docteurB.setTelephone("0661234589");
		docteurB.setDateNaissance(new Date(1961, 1, 26));
		docteurB.setUsername("alami");
    docteurB.setPassword("password");
		docteurB = docteurService.addDocteur(docteurB);

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
			patient.setUsername("nom" + i);
			patient.setPassword("password");
			depense = new Depense();
			depense.setDate(new Date("2017/" + month + "/" + day));
			depense.setLibelle("Depense " + i);
			depense.setMontant(random.nextDouble() * (400 - 250) + 100);
			depenseRepository.save(depense);

			/** Creating and initiating Sex Reference */
			if (random.nextInt() < 10)
				patient.setRefSex(homme);
			else
				patient.setRefSex(femme);
			year = 2017;
			patient.setTelephone(100_000_000 + random.nextInt(900_000) + "");
			patient = patientService.addPatient(patient);
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

				month = random.nextInt(12 - 1) + 1;
				day = random.nextInt(30 - 1) + 1;
				dateConsultation = new Date(year + "/" + month + "/" + day);

				/** Creating and setting consultation */
				consultation = new Consultation();
				consultation.setDateConsultation(dateConsultation);
				consultation.setDossierMedical(dossierMedical);
				consultation.setDocteur(docteur);
				consultation.setPoid(random.nextDouble() * (120 - 40) + 40);
				consultation.setTemperature(random.nextDouble() * (40 - 30) + 30);
				consultation.setMontant_payee(random.nextDouble() * (500 - 250) + 200);
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

			/** Creating Rendez-vous */
			patient = dossierMedical.getPatient();
			consultations = dossierMedical.getConsultations();
			for (Consultation varConsultation: consultations) {
				rendezVous = new RendezVous();
				rendezVous.setDocteur(varConsultation.getDocteur());
				rendezVous.setDate(varConsultation.getDateConsultation());
				rendezVous.setPatient(patient);
				rendezVous.setEtat(1);
				rendezVous.setHeure(new Time(10, 0, 0));
				rendezvousService.addRendezVous(rendezVous);
			}

		}

	}

}
