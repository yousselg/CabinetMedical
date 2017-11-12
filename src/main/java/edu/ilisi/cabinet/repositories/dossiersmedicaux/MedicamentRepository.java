package edu.ilisi.cabinet.repositories.dossiersmedicaux;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.ilisi.cabinet.model.dossiersmedicaux.Medicament;

@Repository
public interface MedicamentRepository extends CrudRepository<Medicament, Long> {

	
}
