package edu.ilisi.cabinet.model.actors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.ilisi.cabinet.model.dossiersmedicaux.Maladie;
import edu.ilisi.cabinet.model.rendezvous.RendezVous;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Home+
 *
 *
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "idPersonne")
@EqualsAndHashCode(callSuper = false)
public class Patient extends Personne {
	
	public Patient(){
		super();
		maladies = new ArrayList<>();
		listRendezVous = new HashSet<>();
	}

	@ManyToMany(mappedBy = "patients", cascade = CascadeType.PERSIST)
	private List<Maladie> maladies;
	@ManyToOne(cascade = CascadeType.REFRESH)
	private RefSex refSex;

	@JsonIgnore
	@OneToMany(fetch=FetchType.EAGER,mappedBy = "patient", cascade = CascadeType.ALL)
	private Set<RendezVous> listRendezVous;

}