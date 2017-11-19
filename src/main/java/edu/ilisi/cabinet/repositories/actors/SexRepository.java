package edu.ilisi.cabinet.repositories.actors;

import edu.ilisi.cabinet.model.actors.RefSex;
import org.springframework.data.repository.CrudRepository;

public interface SexRepository extends CrudRepository<RefSex, Long> {
	
	public RefSex findByLibelle(String libelle);
}
