package edu.ilisi.cabinet.model.actors;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.rendezvous.RendezVous;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "idPersonne")
public class Docteur extends Personne {
	public Docteur() {
		consultations = new HashSet<>();
		listRendezVous = new HashSet<>();
	}

	@JsonIgnore
	@OneToMany(fetch=FetchType.EAGER,mappedBy = "docteur", cascade = CascadeType.ALL)
	private Set<Consultation> consultations;

	@JsonIgnore
	@OneToMany(fetch=FetchType.EAGER,mappedBy = "docteur", cascade = CascadeType.ALL)
	private Set<RendezVous> listRendezVous;
	
	
}