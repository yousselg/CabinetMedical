package edu.ilisi.cabinet.model.dossiersmedicaux;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:56
 */
@Data @Entity
public class Prescription {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long idPrescription;
	private Integer nbreFois;
	private String quand;
	private Integer quantite;
	private String periode;
	@Lob
	private String description;
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private Medicament medicament;
	

}