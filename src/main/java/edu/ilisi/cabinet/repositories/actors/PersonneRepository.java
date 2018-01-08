package edu.ilisi.cabinet.repositories.actors;

import org.springframework.data.repository.CrudRepository;

import edu.ilisi.cabinet.model.actors.Personne;

public interface PersonneRepository<T extends Personne> extends CrudRepository<T,Long> {

	Personne findByUsername(String username);
  
}
