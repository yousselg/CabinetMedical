package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class DossierMedical {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDossierMedical;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;

	@Column(name = "consultation_id")
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "dossierMedical", cascade = CascadeType.ALL)
	private List<Consultation> consultations = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;

}