package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:56
 */
@Data @Entity
public class Prescription {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_prescription;
	private Integer nbre_fois;
	private Date quand;
	private Integer combien;
	@Lob
	private String description;
	@ManyToOne
	private Medicament medicament;

}