package edu.ilisi.cabinet.services;

import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;

import java.util.List;

public interface DossierMedicalService {

	public void addDossieMecial(DossierMedical dossierMedical);

	public List<DossierMedical> getAllDossierMedicaux();

	public void deleteDossierMedical(Long id);

	public void updateDossierMedical(DossierMedical dossierMedical);

	public DossierMedical getDossierMedical(Long id);
}
