package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import edu.ilisi.cabinet.model.actors.Docteur;
import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@Entity
public class Consultation {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_consultation;
	private Date date_consultation;
	private Integer duree;
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "Consultation_symptome", joinColumns = @JoinColumn(name = "idConsultation") , inverseJoinColumns = @JoinColumn(name = "idsymptome") )
	private List<Symptome> symptomes;
	@ManyToOne
	private Docteur docteur;
	@ManyToOne
	private Etat etat;
	@ManyToOne
	private Examen examen;

	@ManyToOne(fetch = FetchType.EAGER)
	private DossierMedical dossiermedical ;

}