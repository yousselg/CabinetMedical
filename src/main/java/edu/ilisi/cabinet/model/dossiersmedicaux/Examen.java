package edu.ilisi.cabinet.model.dossiersmedicaux;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@Entity
public class Examen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idExamen;
	private String description;
	@ManyToOne(cascade = CascadeType.REFRESH)
	private TypeExamen typeExamen;
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.REFRESH)
	private Consultation consultation;

}