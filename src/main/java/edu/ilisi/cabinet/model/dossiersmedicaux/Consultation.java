package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConsultation;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateConsultation;
	private Float poid;
	private Float temperature;
	private Float montant_payee;
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinTable(name = "Consultation_symptome", joinColumns = @JoinColumn(name = "idConsultation") , inverseJoinColumns = @JoinColumn(name = "idSymptome") )
	private List<Symptome> symptomes;
	@ManyToOne(cascade = { CascadeType.REFRESH})
	private Docteur docteur;
	@JsonIgnore
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private Examen examen;
	@OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private Ordonnance ordonnance;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.REFRESH)
	private DossierMedical dossierMedical;
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private TypeConsultation typeConsultation;
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinTable(name = "Consultation_maladie", joinColumns = @JoinColumn(name = "idConsultation") , inverseJoinColumns = @JoinColumn(name = "idMaladie") )
	private List<Maladie> maladies;
	private Integer etat = 0;

}