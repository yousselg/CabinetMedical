package edu.ilisi.cabinet.services.dossiersmedicaux;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;

import java.util.List;

public interface DossierMedicalService {

	public void addDossieMecial(DossierMedical dossierMedical);

	public List<DossierMedical> getAllDossierMedicaux();

	public void deleteDossierMedical(Long id);

	public void updateDossierMedical(DossierMedical dossierMedical);

	public DossierMedical getDossierMedical(Long id);
	
	public void addConsultation(Long id,Consultation consultation);
}
