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
		List<Patient> patients = (List<Patient>) patientService.getAllPatients();
		if (patients.isEmpty()) {
			return new ResponseEntity<List<Patient>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Patient>>(patients, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<?> deletePatient(@PathVariable Long id) {
		patientService.deletePatient(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> updatePatient(@RequestBody Patient patient) {
		patientService.addPatient(patient);
		return new ResponseEntity<Patient>(patient, HttpStatus.ACCEPTED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getPatientById(@PathVariable Long id) {
		Patient patient = patientService.getPatient(id);
		if (patient != null) {
			return new ResponseEntity<List<Patient>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);

	}
	
}
