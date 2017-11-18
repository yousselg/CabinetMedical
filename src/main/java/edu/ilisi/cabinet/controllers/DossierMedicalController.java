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
import edu.ilisi.cabinet.services.DossierMedicalService;

@RequestMapping("/dossiermedical")
@RestController
@CrossOrigin
public class DossierMedicalController {

	@Autowired
	private DossierMedicalService dmService;

	// @Autowired
	// private PatientService patientService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<DossierMedical>> listAll() {
		List<DossierMedical> dossierMedicals = (List<DossierMedical>) dmService.getAllDossierMedicaux();
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
		dmService.addDossieMecial(dossierMedical);
		return new ResponseEntity<DossierMedical>(dossierMedical, HttpStatus.CREATED);

	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@RequestBody DossierMedical dossierMedical) {
		dmService.deleteDossierMedical(dossierMedical.getIdDossierMedical());
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> update(@RequestBody DossierMedical dossierMedical) {
		dmService.updateDossierMedical(dossierMedical);
		return new ResponseEntity<DossierMedical>(dossierMedical, HttpStatus.OK);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> get(@PathVariable Long id) {
		return new ResponseEntity<DossierMedical>(dmService.getDossierMedical(id), HttpStatus.OK);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> addConsultation(@PathVariable Long id, @RequestBody Consultation consultation) {
		dmService.addConsultation(id, consultation);
		return new ResponseEntity<>(dmService.getDossierMedical(id),HttpStatus.CREATED);

	}
}
