package edu.ilisi.cabinet.model.actors;

import java.io.Serializable;

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
@Data
@Entity
public class RefSex implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7447554705881231937L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSexe;
	private String libelle;

}