package edu.ilisi.cabinet.model.consultationadistance;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import edu.ilisi.cabinet.model.actors.Docteur;
import edu.ilisi.cabinet.model.actors.Patient;
import lombok.Data;

@Data
@Entity
public class ConsultationDistance{
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long idConsultationDistance;
  @Temporal(TemporalType.TIMESTAMP)
  private Date dateConsultation;
  @ManyToOne(cascade = { CascadeType.REFRESH })
  private Docteur docteur;
  @ManyToOne(cascade = { CascadeType.REFRESH })
  private Patient patient;
  private Integer etat = 0;
  @Lob
  private String message;


}
