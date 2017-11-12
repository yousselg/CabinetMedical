package edu.ilisi.cabinet.repositories.dossiersmedicaux;

import org.springframework.data.repository.CrudRepository;

import edu.ilisi.cabinet.model.actors.Personne;

public interface PersonneRepository<T extends Personne> extends CrudRepository<T,Long> {

	
}
