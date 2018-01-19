package edu.ilisi.cabinet.services.consultationadistance;

import java.util.List;

import edu.ilisi.cabinet.model.consultationadistance.ConsultationDistance;

public interface ConsultationDistanceService {
  
  public void addConsultationDistance(ConsultationDistance consultationDistance);

  public List<ConsultationDistance> getAllConsultationDistances();

  public void deleteConsultationDistance(Long id);

  public ConsultationDistance updateConsultationDistance(ConsultationDistance consultationDistance);

  public ConsultationDistance getConsultationDistance(Long id);
  
  public List<ConsultationDistance> getConsultationDistanceByPatient(Long idPatient);
  
  public List<ConsultationDistance> getConsultationDistanceByDocteur(Long idDocteur);

}
