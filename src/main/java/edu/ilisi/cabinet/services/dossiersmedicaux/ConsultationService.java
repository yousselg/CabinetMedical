package edu.ilisi.cabinet.services.dossiersmedicaux;

import java.util.Date;
import java.util.List;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.Ordonnance;

public interface ConsultationService {

	public void addConsultation(Consultation consultation);

	public List<Consultation> getAllConsultations();

	public void deleteConsultation(Long id);

	public Consultation updateConsultation(Consultation consultation);

	public Consultation getConsultation(Long id);
	
	public Long addOrdonnace(Long id,Ordonnance ordonnance);

	public List<Consultation>getConsultationsByYear(Date d , Date f);

}
