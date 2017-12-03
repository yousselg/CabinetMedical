package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.ilisi.cabinet.model.actors.Patient;
import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Maladie {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id_maladie;
	private String libele;
	private String description;

	@JsonIgnore
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "maladie_patient", joinColumns = @JoinColumn(name = "idmaladie") , inverseJoinColumns = @JoinColumn(name = "idpatient") )
	private List<Patient> patients;
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "maladie_symptome", joinColumns = @JoinColumn(name = "idmaladie") , inverseJoinColumns = @JoinColumn(name = "idsymptome") )
	private List<Symptome> symptomes;

}