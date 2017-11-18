package edu.ilisi.cabinet.model.actors;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import edu.ilisi.cabinet.model.dossiersmedicaux.Maladie;
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
@PrimaryKeyJoinColumn(referencedColumnName="idPersonne")
@EqualsAndHashCode(callSuper=false)
public class Patient extends Personne{

	@ManyToMany(mappedBy = "patients",cascade = CascadeType.PERSIST)
	private List<Maladie> maladies;
	@ManyToOne(cascade = CascadeType.REFRESH)
	private RefSex refSex;



}