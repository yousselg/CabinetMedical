package edu.ilisi.cabinet.model.rendezvous;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import edu.ilisi.cabinet.model.actors.Docteur;
import edu.ilisi.cabinet.model.actors.Patient;
import lombok.Data;

@Data
@Entity
public class RendezVous implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2806948200090341012L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRendezVous;

	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE })
	private Patient patient;
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE })
	private Docteur docteur;
	/**
	 * 0: En attente 1: Validé 2: Annulé
	 */
	private Integer Etat;
	private Date date;
	private Time heure;

}
