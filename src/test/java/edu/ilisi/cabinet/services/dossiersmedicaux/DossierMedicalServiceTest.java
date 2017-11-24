package edu.ilisi.cabinet.services.dossiersmedicaux;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DossierMedicalServiceTest {

	@Autowired
	private DossierMedicalService dossierService;
	private DossierMedical dossier;
	private Consultation consultation;

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void update() {
		int before, after;
		
		dossier = dossierService.getDossierMedical(5L);
		
		consultation = new Consultation();
		consultation.setDateConsultation(new Date());
		consultation.setDossierMedical(dossier);
		
		before = dossier.getConsultations().size();
		
		 dossierService.addConsultation(5L, consultation);
		//dossier.getConsultations().add(consultation);
		//dossierService.addDossieMecial(dossier);

		dossier = dossierService.getDossierMedical(5L);
		after = dossier.getConsultations().size();
		System.err.println("Before "+before);
		System.err.println("AFter "+after);
		assertNotEquals(before, after);
	}
}
