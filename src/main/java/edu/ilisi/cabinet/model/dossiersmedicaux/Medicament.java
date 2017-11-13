package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data @Entity
public class Medicament {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_medicament;
	private String libelle;
	private String description;

	@OneToMany
	private List<Prescription> prescriptions;

}