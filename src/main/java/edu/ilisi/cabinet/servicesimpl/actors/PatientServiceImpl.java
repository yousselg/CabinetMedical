package edu.ilisi.cabinet.servicesimpl.actors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.actors.Patient;
import edu.ilisi.cabinet.repositories.actors.PatientRepository;
import edu.ilisi.cabinet.services.actors.PatientService;

@Service

public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public void addPatient(Patient patient) {
		patientRepository.save(patient);
	}

	@Override
	public Patient getPatient(Long id) {
		return patientRepository.findOne(id);
	}

	@Override
	public void deletePatient(Long id) {
		patientRepository.delete(id);
	}

	@Override
	public List<Patient> getAllPatients() {
		return (List<Patient>) patientRepository.findAll();
	}
}
