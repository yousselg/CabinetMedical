package edu.ilisi.cabinet.model.actors;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import edu.ilisi.cabinet.model.dossiersmedicaux.Maladie;
import edu.ilisi.cabinet.model.dossiersmedicaux.MaladieHerite;
import edu.ilisi.cabinet.model.dossiersmedicaux.Ordonnance;
import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@Entity
public class Patient extends Personne {

	@ManyToMany(mappedBy = "patients")
	private List<MaladieHerite> maladieHerites;
	@ManyToOne
	private Ref_sex ref_sex;

}