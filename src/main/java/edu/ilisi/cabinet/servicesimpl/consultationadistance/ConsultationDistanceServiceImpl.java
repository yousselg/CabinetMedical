package edu.ilisi.cabinet.servicesimpl.consultationadistance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.actors.Docteur;
import edu.ilisi.cabinet.model.actors.Patient;
import edu.ilisi.cabinet.model.consultationadistance.ConsultationDistance;
import edu.ilisi.cabinet.repositories.actors.DocteurRepository;
import edu.ilisi.cabinet.repositories.actors.PatientRepository;
import edu.ilisi.cabinet.repositories.consultationadistance.ConsultationDistanceRepository;
import edu.ilisi.cabinet.services.consultationadistance.ConsultationDistanceService;

@Service
public class ConsultationDistanceServiceImpl implements ConsultationDistanceService {

  @Autowired
  private ConsultationDistanceRepository consultationDistanceRepository;

  @Autowired
  private DocteurRepository docteurRepository;

  @Autowired
  private PatientRepository patientRepository;

  @Override
  public void addConsultationDistance(ConsultationDistance consultationDistance) {
    consultationDistanceRepository.save(consultationDistance);
  }

  @Override
  public ConsultationDistance updateConsultationDistance(
      ConsultationDistance consultationDistance) {
    return consultationDistanceRepository.save(consultationDistance);
  }

  @Override
  public ConsultationDistance getConsultationDistance(Long id) {
    return consultationDistanceRepository.findOne(id);
  }

  @Override
  public List<ConsultationDistance> getAllConsultationDistances() {
    return (List<ConsultationDistance>) consultationDistanceRepository.findAll();
  }

  @Override
  public void deleteConsultationDistance(Long id) {
    consultationDistanceRepository.delete(id);
  }

  @Override
  public List<ConsultationDistance> getConsultationDistanceByPatient(Long idPatient) {
    Patient patient = patientRepository.findOne(idPatient);
    return consultationDistanceRepository.findByPatient(patient);
  }

  @Override
  public List<ConsultationDistance> getConsultationDistanceByDocteur(Long idDocteur) {
    Docteur docteur = docteurRepository.findOne(idDocteur);
    return consultationDistanceRepository.findByDocteur(docteur);
  }

}
