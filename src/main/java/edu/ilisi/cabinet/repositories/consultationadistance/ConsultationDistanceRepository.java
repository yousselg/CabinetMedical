package edu.ilisi.cabinet.repositories.consultationadistance;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.ilisi.cabinet.model.actors.Docteur;
import edu.ilisi.cabinet.model.actors.Patient;
import edu.ilisi.cabinet.model.consultationadistance.ConsultationDistance;

@Repository
public interface ConsultationDistanceRepository extends CrudRepository<ConsultationDistance, Long> {
  
  List<ConsultationDistance> findByPatient(Patient patient);
  
  List<ConsultationDistance> findByDocteur(Docteur docteur);
}
