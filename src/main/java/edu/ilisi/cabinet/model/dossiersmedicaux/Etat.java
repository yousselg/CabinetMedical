package edu.ilisi.cabinet.model.dossiersmedicaux;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@Entity
public class Etat {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_etat;
	private Double poids;
	private Double temperature;


}