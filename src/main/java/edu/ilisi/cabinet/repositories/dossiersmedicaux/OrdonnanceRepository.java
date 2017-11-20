package edu.ilisi.cabinet.repositories.dossiersmedicaux;

import org.springframework.data.repository.CrudRepository;

import edu.ilisi.cabinet.model.dossiersmedicaux.Ordonnance;

public interface OrdonnanceRepository extends CrudRepository<Ordonnance, Long> {

	public Ordonnance findTopByOrderByDateOrdonnaceDesc();
	
}
