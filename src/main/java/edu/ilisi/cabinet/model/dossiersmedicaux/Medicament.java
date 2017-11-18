package edu.ilisi.cabinet.model.dossiersmedicaux;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@Entity
public class Medicament {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMedicament;
	private String libelle;
	private String description;

	@JsonIgnore
	@OneToMany(cascade=CascadeType.REFRESH)
	private List<Prescription> prescriptions;

}