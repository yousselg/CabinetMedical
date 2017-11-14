package edu.ilisi.cabinet.model.actors;

import java.io.Serializable;
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
public class Patient extends Personne implements Serializable{

	@ManyToMany(mappedBy = "patients",cascade = CascadeType.PERSIST)
	private List<MaladieHerite> maladieHerites;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private RefSex ref_sex;

	public List<MaladieHerite> getMaladieHerites() {
		return maladieHerites;
	}

	public void setMaladieHerites(List<MaladieHerite> maladieHerites) {
		this.maladieHerites = maladieHerites;
	}

	public RefSex getRef_sex() {
		return ref_sex;
	}

	public void setRef_sex(RefSex ref_sex) {
		this.ref_sex = ref_sex;
	}

}