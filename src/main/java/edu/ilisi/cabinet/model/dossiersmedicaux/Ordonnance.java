package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import edu.ilisi.cabinet.model.actors.Patient;
import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@Entity
public class Ordonnance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idOrdonnance;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOrdonnace;
	@ManyToOne(cascade=CascadeType.REFRESH)
	private Patient patient;
	@OneToOne
	private Consultation consultation;

	@OneToMany
	private List<Prescription> prescriptions;

}