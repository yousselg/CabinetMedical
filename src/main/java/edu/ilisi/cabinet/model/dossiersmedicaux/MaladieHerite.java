package edu.ilisi.cabinet.model.dossiersmedicaux;

import javax.persistence.*;

import edu.ilisi.cabinet.model.actors.Patient;
import lombok.Data;

import java.util.List;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data @Entity
public class MaladieHerite extends Maladie {

	private String source_maladie;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "maladie_herite_patient", joinColumns = @JoinColumn(name = "idmaladieherite") , inverseJoinColumns = @JoinColumn(name = "idpatient") )
	private List<Patient> patients;

}