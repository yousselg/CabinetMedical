package edu.ilisi.cabinet.controllers.actors;

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
import edu.ilisi.cabinet.services.actors.PatientService;

@RequestMapping("/patient")
@RestController
@CrossOrigin
public class PatientController {

	@Autowired
	private PatientService patientService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Patient>> listAllPatients() {
		List<Patient> patients =  patientService.getAllPatients();
		if (patients.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(patients, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<HttpStatus> deletePatient(@PathVariable Long id) {
		patientService.deletePatient(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
  public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient) {
    patientService.addPatient(patient);
    return new ResponseEntity<>(patient, HttpStatus.ACCEPTED);

  }
	
	@RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {
    patientService.addPatient(patient);
    return new ResponseEntity<>(patient, HttpStatus.ACCEPTED);

  }

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
		Patient patient = patientService.getPatient(id);
		if (patient == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(patient, HttpStatus.OK);

	}
	
}
