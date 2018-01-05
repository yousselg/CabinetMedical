package edu.ilisi.cabinet.servicesimpl.dossiermedicaux;

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
import edu.ilisi.cabinet.services.dossiersmedicaux.DossierMedicalService;

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
		dossier = dossierService.getDossierMedical(5L);
		after = dossier.getConsultations().size();
		
		assertNotEquals(before, after);
	}
}
