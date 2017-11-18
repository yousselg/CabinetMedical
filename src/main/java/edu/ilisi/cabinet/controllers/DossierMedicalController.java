package edu.ilisi.cabinet.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.ilisi.cabinet.model.actors.Patient;
import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;
import edu.ilisi.cabinet.services.ConsultationService;
import edu.ilisi.cabinet.services.DossierMedicalService;

@RequestMapping("/dossiermedical")
@RestController
@CrossOrigin
public class DossierMedicalController {
	@Autowired
	private DossierMedicalService service;
	@Autowired
	private ConsultationService consultationService;
	// @Autowired
	// private PatientService patientService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<DossierMedical>> listAll() {
		List<DossierMedical> dossierMedicals = (List<DossierMedical>) service.getAllDossierMedicaux();
		if (dossierMedicals.isEmpty()) {
			return new ResponseEntity<List<DossierMedical>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DossierMedical>>(dossierMedicals, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> add(@RequestBody Patient input) {
		// patientService.addPatient(input);
		DossierMedical dossierMedical = new DossierMedical();
		dossierMedical.setPatient(input);
		dossierMedical.setDateCreation(new Date());
		service.addDossieMecial(dossierMedical);
		return new ResponseEntity<>(HttpStatus.CREATED);

	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@RequestBody DossierMedical dossierMedical) {
		service.deleteDossierMedical(dossierMedical.getIdDossierMedical());
		return null;
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> update(@RequestBody DossierMedical dossierMedical) {
		service.updateDossierMedical(dossierMedical);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@RequestMapping(value = "/dossiermedical/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> get(@PathVariable Long id) {
		service.getDossierMedical(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@RequestMapping(value = "/dossiermedical/consultation", method = RequestMethod.GET)
	public ResponseEntity<?> addConsultation(@PathVariable Consultation consultation) {
		consultationService.addConsultation(consultation);
		return new ResponseEntity<>(HttpStatus.CREATED);

	}
}
