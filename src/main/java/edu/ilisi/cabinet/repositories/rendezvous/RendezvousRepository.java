package edu.ilisi.cabinet.repositories.rendezvous;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import edu.ilisi.cabinet.model.rendezvous.RendezVous;

public interface RendezvousRepository extends CrudRepository<RendezVous, Long> {
	
	@Query("SELECT r FROM RendezVous r WHERE YEAR(r.date) = ?1 AND MONTH(r.date) = ?2")
	List<RendezVous> findByMois(Integer annee,Integer mois);

	List<RendezVous> findByDate(Date dateJour);
}
