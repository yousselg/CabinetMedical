package edu.ilisi.cabinet.model.actors;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:56
 */
@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_personne;
	private String nom;
	private String prenom;
	private String email;
	private String CIN;
	@Temporal(TemporalType.DATE)
	private Date date_naissance;

}