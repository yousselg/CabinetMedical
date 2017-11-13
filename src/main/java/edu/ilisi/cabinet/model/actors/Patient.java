package edu.ilisi.cabinet.model.actors;

import java.util.List;

import javax.persistence.*;

import edu.ilisi.cabinet.model.dossiersmedicaux.Maladie;
import edu.ilisi.cabinet.model.dossiersmedicaux.MaladieHerite;
import edu.ilisi.cabinet.model.dossiersmedicaux.Ordonnance;

/**
 * @author Home+
 *
 *
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Entity
public class Patient extends Personne {

	@ManyToMany(mappedBy = "patients")
	private List<MaladieHerite> maladieHerites;
	@ManyToOne
	private Ref_sex ref_sex;

	public List<MaladieHerite> getMaladieHerites() {
		return maladieHerites;
	}

	public void setMaladieHerites(List<MaladieHerite> maladieHerites) {
		this.maladieHerites = maladieHerites;
	}

	public Ref_sex getRef_sex() {
		return ref_sex;
	}

	public void setRef_sex(Ref_sex ref_sex) {
		this.ref_sex = ref_sex;
	}
}