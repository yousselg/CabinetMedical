package edu.ilisi.cabinet.services.dossiersmedicaux;

import java.util.Date;
import java.util.List;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.Ordonnance;

public interface ConsultationService {

  void addConsultation(Consultation consultation);

  List<Consultation> getAllConsultations();

  void deleteConsultation(Long id);

  Consultation updateConsultation(Consultation consultation);

  Consultation getConsultation(Long id);

  Long addOrdonnace(Long id, Ordonnance ordonnance);

  List<Consultation> getConsultationsByYear(Date d, Date f);

}
