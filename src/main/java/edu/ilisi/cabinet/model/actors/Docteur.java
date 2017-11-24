package edu.ilisi.cabinet.model.actors;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@PrimaryKeyJoinColumn(referencedColumnName="idPersonne")
public class Docteur extends Personne {
	public Docteur() {
		consultations = new ArrayList<Consultation>();
	}

	@JsonIgnore
	@OneToMany
	private List<Consultation> consultations;
}