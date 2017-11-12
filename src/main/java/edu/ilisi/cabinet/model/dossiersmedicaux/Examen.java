package edu.ilisi.cabinet.model.dossiersmedicaux;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@Entity
public class Examen {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_examen;
	private String description;
	@ManyToOne
	private TypeExamen type_Examen;
	@ManyToOne
	private Consultation consultation;

}