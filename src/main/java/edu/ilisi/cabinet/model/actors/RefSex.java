package edu.ilisi.cabinet.model.actors;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Rome
 * @version 1.0
 * @created 12-nov.-2017 01:01:56
 */
@Entity
public class RefSex implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7447554705881231937L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_sexe;
	private String libelle;

	public Long getId_sexe() {
		return id_sexe;
	}

	public void setId_sexe(Long id_sexe) {
		this.id_sexe = id_sexe;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}