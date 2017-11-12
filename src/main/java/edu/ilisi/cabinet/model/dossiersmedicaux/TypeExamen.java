package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:56
 */
@Data @Entity
public class TypeExamen {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_typeExamen;
	private String lebel;
	@OneToMany
	private List<Examen> examen;

}