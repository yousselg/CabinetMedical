package edu.ilisi.cabinet.model.dossiersmedicaux;

import javax.persistence.Entity;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data @Entity
public class MaladieHerite extends Maladie {

	private String source_maladie;


}