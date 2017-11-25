package edu.ilisi.cabinet.repositories.dossiersmedicaux;

import org.springframework.data.repository.CrudRepository;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;

import java.util.Date;
import java.util.List;

public interface ConsultationRepository extends CrudRepository<Consultation, Long> {
	public Consultation findTopByOrderByDateConsultationDesc();
	public List<Consultation> findByDateConsultationBetween(Date begin,Date end);
}
