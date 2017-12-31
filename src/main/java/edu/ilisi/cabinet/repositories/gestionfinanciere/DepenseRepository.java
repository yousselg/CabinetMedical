package edu.ilisi.cabinet.repositories.gestionfinanciere;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.ilisi.cabinet.model.gestionfinanciere.Depense;

public interface DepenseRepository extends CrudRepository<Depense, Long> {
	List<Depense> findAllByDateBetween(Date begin, Date end);
}
