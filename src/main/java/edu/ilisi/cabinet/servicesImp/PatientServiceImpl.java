package edu.ilisi.cabinet.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.actors.Patient;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.PatientRepository;
import edu.ilisi.cabinet.services.PatientService;

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
