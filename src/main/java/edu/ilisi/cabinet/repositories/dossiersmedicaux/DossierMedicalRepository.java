package edu.ilisi.cabinet.repositories.dossiersmedicaux;

import org.springframework.data.repository.CrudRepository;

import edu.ilisi.cabinet.model.actors.Patient;
import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;

public interface DossierMedicalRepository extends CrudRepository<DossierMedical, Long> {
  
  DossierMedical findByPatient(Patient patient);
	
}
