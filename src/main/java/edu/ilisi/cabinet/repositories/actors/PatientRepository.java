package edu.ilisi.cabinet.repositories.actors;

import org.springframework.data.repository.CrudRepository;

import edu.ilisi.cabinet.model.actors.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {

	
}
