package edu.ilisi.cabinet.model.actors;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import edu.ilisi.cabinet.model.dossiersmedicaux.Maladie;
import edu.ilisi.cabinet.model.dossiersmedicaux.Ordonnance;
import lombok.Data;
import javax.persistence.*;

import edu.ilisi.cabinet.model.dossiersmedicaux.Maladie;
import edu.ilisi.cabinet.model.dossiersmedicaux.MaladieHerite;
import edu.ilisi.cabinet.model.dossiersmedicaux.Ordonnance;

@Data
@Entity
public class Patient extends Personne {

	@ManyToMany(mappedBy = "patients")
	private List<Maladie> maladie;
	@OneToMany(mappedBy="patient")
	private List<Ordonnance> ordonnance;
	@ManyToOne
	private Ref_sex ref_sex;

	private List<MaladieHerite> maladieHerites;
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