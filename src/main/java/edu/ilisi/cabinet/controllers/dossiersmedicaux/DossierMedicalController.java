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
import edu.ilisi.cabinet.services.dossiersmedicaux.ConsultationService;
import edu.ilisi.cabinet.services.dossiersmedicaux.DossierMedicalService;
import springfox.documentation.annotations.ApiIgnore;

@RequestMapping("/dossiermedical")
@RestController
@CrossOrigin
public class DossierMedicalController {

	@Autowired
	private DossierMedicalService dmService;

	@Autowired
	private ConsultationService cnService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<DossierMedical>> getAllDossiersMedicaux() {
		List<DossierMedical> dossierMedicals = dmService.getAllDossierMedicaux();
		if (dossierMedicals.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(dossierMedicals, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<DossierMedical> addDossierMedical(@RequestBody Patient input) {
		DossierMedical dossierMedical = new DossierMedical();
		dossierMedical.setPatient(input);
		dossierMedical.setDateCreation(new Date());
		dmService.addDossieMecial(dossierMedical);
		return new ResponseEntity<>(dossierMedical, HttpStatus.CREATED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<HttpStatus> deleteDossierMedical(@PathVariable Long id) {
		dmService.deleteDossierMedical(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<DossierMedical> updateDossierMedical(@RequestBody DossierMedical dossierMedical) {
		dmService.updateDossierMedical(dossierMedical);
		return new ResponseEntity<>(dossierMedical, HttpStatus.ACCEPTED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<DossierMedical> getDossierMedicalById(@PathVariable Long id) {

		DossierMedical dossierMedical = dmService.getDossierMedical(id);
		if (dossierMedical == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(dossierMedical, HttpStatus.OK);

	}

	@RequestMapping(value = "/{id}/consultation", method = RequestMethod.POST)
	public ResponseEntity<Long> addConsultationToDossierMedical(@PathVariable Long id,
			@RequestBody Consultation consultation) {
		Long idConsulLong = dmService.addConsultation(id, consultation);
		if (idConsulLong != null)
			return new ResponseEntity<>(idConsulLong, HttpStatus.CREATED);
		return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);

	}

	@ApiIgnore
	@RequestMapping(value = "/{id}/consultation", method = RequestMethod.PUT)
	public ResponseEntity<Consultation> updateConsultatiobnDossierMedical(@PathVariable DossierMedical id,
			@RequestBody Consultation consultation) {
		consultation.setDossierMedical(id);
		consultation = cnService.updateConsultation(consultation);
		return new ResponseEntity<>(consultation, HttpStatus.CREATED);

	}

	@RequestMapping(value = "/{id}/consultation", method = RequestMethod.GET)
	public ResponseEntity<List<Consultation>> getConsultationsOfDossierMedical(@PathVariable Long id) {
		List<Consultation> consultations = dmService.getDossierMedical(id).getConsultations();
		if (consultations.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(consultations, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}/consultation/{idConsultation}", method = RequestMethod.GET)
	public ResponseEntity<Consultation> getDetailsConsultationsOfDossierMedical(@PathVariable Long id,
			@PathVariable Long idConsultation) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", "/consultation/" + idConsultation);
		return new ResponseEntity<>(headers, HttpStatus.MOVED_PERMANENTLY);
	}
	
	@RequestMapping(value = "/username/{username}", method = RequestMethod.GET)
  public ResponseEntity<DossierMedical> getDossierMedicalByUsername(@PathVariable String username) {
	  DossierMedical dossierMedical = dmService.getDossierMedicalByUsername(username);
    if (dossierMedical==null) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    return new ResponseEntity<>(dossierMedical, HttpStatus.OK);
  }
}
