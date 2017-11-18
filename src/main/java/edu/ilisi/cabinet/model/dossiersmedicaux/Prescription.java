package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.Date;

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
	private Date quand;
	private Integer combien;
	@Lob
	private String description;
	@ManyToOne(cascade = CascadeType.REFRESH)
	private Medicament medicament;

}