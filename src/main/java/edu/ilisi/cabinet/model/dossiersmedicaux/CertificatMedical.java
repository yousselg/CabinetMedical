package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@Entity
public class CertificatMedical {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_certificat_medical;
	private Date date_debut;
	private int nombre_jour;
	private String observation;
	@OneToOne
	private Consultation consultation;


}