package edu.ilisi.cabinet.model.actors;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

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
public class Docteur extends Personne {

	@OneToMany
	private List<Consultation> consultations;
}