package edu.ilisi.cabinet.model.actors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Rome
 * @version 1.0
 * @created 12-nov.-2017 01:01:56
 */
@Data @Entity 
public class Ref_sex {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_sexe;
	private String libelle;


}