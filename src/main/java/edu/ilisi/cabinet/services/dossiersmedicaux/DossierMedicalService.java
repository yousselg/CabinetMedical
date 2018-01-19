package edu.ilisi.cabinet.services.dossiersmedicaux;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;

import java.util.List;

public interface DossierMedicalService {

  void addDossieMecial(DossierMedical dossierMedical);

  List<DossierMedical> getAllDossierMedicaux();

  void deleteDossierMedical(Long id);

  DossierMedical updateDossierMedical(DossierMedical dossierMedical);

  DossierMedical getDossierMedical(Long id);

  Long addConsultation(Long id,Consultation consultation);
  
  DossierMedical getDossierMedicalByUsername(String username);
}
