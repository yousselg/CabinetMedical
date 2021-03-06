package edu.ilisi.cabinet.servicesimpl.dossiermedicaux;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.actors.Patient;
import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;
import edu.ilisi.cabinet.repositories.actors.PatientRepository;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.ConsultationRepository;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.DossierMedicalRepository;
import edu.ilisi.cabinet.services.dossiersmedicaux.DossierMedicalService;

@Service
public class DossierMedicalServiceImpl implements DossierMedicalService {

  @Autowired
  private DossierMedicalRepository dmRepository;

  @Autowired
  private ConsultationRepository cnRepository;
  
  @Autowired
  private PatientRepository patientRepository;

  @Override
  public void addDossieMecial(DossierMedical dossierMedical) {
    dmRepository.save(dossierMedical);
  }

  @Override
  public List<DossierMedical> getAllDossierMedicaux() {
    return (List<DossierMedical>) dmRepository.findAll();
  }

  @Override
  public void deleteDossierMedical(Long id) {
    dmRepository.delete(id);
  }

  @Override
  public DossierMedical updateDossierMedical(DossierMedical dossierMedical) {
    return dmRepository.save(dossierMedical);
  }

  @Override
  public DossierMedical getDossierMedical(Long id) {
    return dmRepository.findOne(id);
  }

  @Override
  public Long addConsultation(Long id, Consultation consultation) {
    DossierMedical dossierMedical = getDossierMedical(id);
    if (dossierMedical != null) {
      consultation.setDateConsultation(new Date());
      consultation.setDossierMedical(dossierMedical);
      dossierMedical.getConsultations().add(consultation);
      updateDossierMedical(dossierMedical);
      return cnRepository.findTopByOrderByDateConsultationDesc().getIdConsultation();
    }
    return null;
  }

  @Override
  public DossierMedical getDossierMedicalByUsername(String username) {
    Patient patient = (Patient) patientRepository.findByUsername(username);
    return dmRepository.findByPatient(patient);
  }
}
