package edu.ilisi.cabinet.services.actors;

import java.util.List;

import edu.ilisi.cabinet.model.actors.Patient;

public interface PatientService {

	public void addPatient(Patient patient);

	public Patient getPatient(Long id);
	
	public void deletePatient(Long id);

	public List<Patient> getAllPatients();
}
