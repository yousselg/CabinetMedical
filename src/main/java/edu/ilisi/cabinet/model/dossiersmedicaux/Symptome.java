package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:56
 */
@Data
@Entity
public class Symptome {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSymptome;
	private String description;
	private String libele;
	@JsonIgnore
	@ManyToMany(mappedBy = "symptomes")
	private List<Maladie> maladie;

}