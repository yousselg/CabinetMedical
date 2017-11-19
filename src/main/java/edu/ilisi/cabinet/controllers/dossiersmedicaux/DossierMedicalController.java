package edu.ilisi.cabinet.controllers.dossiersmedicaux;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
import edu.ilisi.cabinet.services.dossiersmedicaux.DossierMedicalService;

@RequestMapping("/dossiermedical")
@RestController
@CrossOrigin
public class DossierMedicalController {

	@Autowired
	private DossierMedicalService dmService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<DossierMedical>> getAllDossiersMedicaux() {
		List<DossierMedical> dossierMedicals = (List<DossierMedical>) dmService.getAllDossierMedicaux();
		if (dossierMedicals.isEmpty()) {
			return new ResponseEntity<List<DossierMedical>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DossierMedical>>(dossierMedicals, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addDossierMedical(@RequestBody Patient input) {
		DossierMedical dossierMedical = new DossierMedical();
		dossierMedical.setPatient(input);
		dossierMedical.setDateCreation(new Date());
		dmService.addDossieMecial(dossierMedical);
		return new ResponseEntity<DossierMedical>(dossierMedical, HttpStatus.CREATED);

	}

	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteDossierMedical(@PathVariable Long id) {
		dmService.deleteDossierMedical(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> updateDossierMedical(@RequestBody DossierMedical dossierMedical) {
		dmService.updateDossierMedical(dossierMedical);
		return new ResponseEntity<DossierMedical>(dossierMedical, HttpStatus.ACCEPTED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getDossierMedicalById(@PathVariable Long id) {
		
		DossierMedical dossierMedical = dmService.getDossierMedical(id);
		if (dossierMedical == null) {
			return new ResponseEntity<DossierMedical>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<DossierMedical>(dossierMedical, HttpStatus.OK);

	}

	@RequestMapping(value = "/{id}/consultation", method = RequestMethod.POST)
	public ResponseEntity<?> addConsultationToDossierMedical(@PathVariable Long id, @RequestBody Consultation consultation) {
		dmService.addConsultation(id, consultation);
		return new ResponseEntity<>(dmService.getDossierMedical(id),HttpStatus.CREATED);

	}
	
	@RequestMapping(value = "/{id}/consultation", method = RequestMethod.GET)
	public ResponseEntity<?> getConsultationsOfDossierMedical(@PathVariable Long id) {
		List<Consultation> consultations = dmService.getDossierMedical(id).getConsultations();
		if (consultations.isEmpty()) {
			return new ResponseEntity<List<Consultation>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Consultation>>(consultations, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}/consultation/{idConsultation}", method = RequestMethod.GET)
	public ResponseEntity<?> getDetailsConsultationsOfDossierMedical(@PathVariable Long id,@PathVariable Long idConsultation) {
		 HttpHeaders headers = new HttpHeaders();
	     headers.add("Location", "/consultation/"+idConsultation);
	     return new ResponseEntity<Consultation>(headers, HttpStatus.MOVED_PERMANENTLY);
	}
}
