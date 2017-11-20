package edu.ilisi.cabinet.repositories.dossiersmedicaux;

import org.springframework.data.repository.CrudRepository;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;

public interface ConsultationRepository extends CrudRepository<Consultation, Long> {
	public Consultation findTopByOrderByDateConsultationDesc();
}
