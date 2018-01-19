package edu.ilisi.cabinet.controllers.consultationadistance;

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

import edu.ilisi.cabinet.model.consultationadistance.ConsultationDistance;
import edu.ilisi.cabinet.services.consultationadistance.ConsultationDistanceService;

@RequestMapping("/consultationdistance")
@RestController
@CrossOrigin
public class ConsultationDistanceController {

	@Autowired
	private ConsultationDistanceService consultationDistanceService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ConsultationDistance>> getAllConsultationDistances() {
		List<ConsultationDistance> consultationDistances = consultationDistanceService.getAllConsultationDistances();
		if (consultationDistances.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(consultationDistances, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<HttpStatus> deleteConsultationDistance(@PathVariable Long id) {
		consultationDistanceService.deleteConsultationDistance(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<ConsultationDistance> updateConsultationDistance(@RequestBody ConsultationDistance consultationDistance) {
		consultationDistanceService.updateConsultationDistance(consultationDistance);
		return new ResponseEntity<>(consultationDistance, HttpStatus.ACCEPTED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ResponseEntity<ConsultationDistance> getConsultationDistanceById(@PathVariable Long id) {
    ConsultationDistance consultationDistance = consultationDistanceService.getConsultationDistance(id);
    if (consultationDistance == null)
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    return new ResponseEntity<>(consultationDistance, HttpStatus.OK);
  }
	
	@RequestMapping(value = "/patient/{idPatient}", method = RequestMethod.GET)
  public ResponseEntity<List<ConsultationDistance>> getConsultationDistanceByIdPatient(@PathVariable Long idPatient) {
    List<ConsultationDistance> consultationDistance = consultationDistanceService.getConsultationDistanceByPatient(idPatient);
    if (consultationDistance == null)
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    return new ResponseEntity<>(consultationDistance, HttpStatus.OK);
  }
	
	@RequestMapping(value = "/docteur/{idDocteur}", method = RequestMethod.GET)
  public ResponseEntity<List<ConsultationDistance>> getConsultationDistanceByIdDocteur(@PathVariable Long idDocteur) {
    List<ConsultationDistance> consultationDistance = consultationDistanceService.getConsultationDistanceByDocteur(idDocteur);
    if (consultationDistance == null)
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    return new ResponseEntity<>(consultationDistance, HttpStatus.OK);
  }

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<ConsultationDistance> addConsultationDistance(@RequestBody ConsultationDistance consultationDistance) {
		consultationDistanceService.addConsultationDistance(consultationDistance);
		return new ResponseEntity<>(consultationDistance, HttpStatus.ACCEPTED);

	}
}
