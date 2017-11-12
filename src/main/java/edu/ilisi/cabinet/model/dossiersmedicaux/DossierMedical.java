package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import edu.ilisi.cabinet.model.actors.Patient;
import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@Entity
public class DossierMedical {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_dossier_medical;
	private Date date_creation;
	
	@OneToOne
	private Patient patient;


}