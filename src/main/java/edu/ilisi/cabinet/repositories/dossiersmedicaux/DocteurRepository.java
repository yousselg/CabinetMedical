package edu.ilisi.cabinet.repositories.dossiersmedicaux;

import org.springframework.data.repository.CrudRepository;

import edu.ilisi.cabinet.model.actors.Docteur;

public interface DocteurRepository extends CrudRepository<Docteur, Long> {

	
}
