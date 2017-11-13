package edu.ilisi.cabinet.repositories.dossiersmedicaux;

import edu.ilisi.cabinet.model.actors.Docteur;
import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import org.springframework.data.repository.CrudRepository;

public interface ConsultationRepository extends CrudRepository<Consultation, Long> {
}
