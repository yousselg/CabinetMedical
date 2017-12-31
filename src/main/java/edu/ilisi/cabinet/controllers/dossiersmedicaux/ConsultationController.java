package edu.ilisi.cabinet.controllers.dossiersmedicaux;

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

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.Ordonnance;
import edu.ilisi.cabinet.services.dossiersmedicaux.ConsultationService;

@RequestMapping("/consultation")
@RestController
@CrossOrigin
public class ConsultationController {

	@Autowired
	private ConsultationService consultationService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Consultation>> getAllConsultations() {
		List<Consultation> consultations = consultationService.getAllConsultations();
		if (consultations.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(consultations, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Consultation> deleteConsultation(@PathVariable Long id) {
		consultationService.deleteConsultation(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Consultation> updateConsultation(@RequestBody Consultation consultation) {
		consultationService.updateConsultation(consultation);
		return new ResponseEntity<>(consultation, HttpStatus.ACCEPTED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Consultation> getConsultationById(@PathVariable Long id) {
		Consultation consultation = consultationService.getConsultation(id);
		if (consultation == null)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(consultation, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}/ordonnance", method = RequestMethod.POST)
	public ResponseEntity<Long> addConsultationToDossierMedical(@PathVariable Long id,
			@RequestBody Ordonnance ordonnance) {
		Long idConsulLong = consultationService.addOrdonnace(id, ordonnance);
		if (idConsulLong != null)
			return new ResponseEntity<>(idConsulLong, HttpStatus.CREATED);
		return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);

	}

}
