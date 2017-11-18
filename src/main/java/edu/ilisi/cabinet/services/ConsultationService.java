package edu.ilisi.cabinet.services;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;

import java.util.List;

public interface ConsultationService {

	public void addConsultation(Consultation Consultation);

	public List<Consultation> getAllConsultations();

	public void deleteConsultation(Long id);

	public void updateConsultation(Consultation Consultation);

	public Consultation getConsultation(Long id);
}
