package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

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

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long idDossierMedical;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;

	@Column(name = "consultation_id")
	@OneToMany(fetch = FetchType.EAGER , mappedBy = "dossierMedical",cascade = CascadeType.PERSIST)
	private List<Consultation> consultations= new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;


}