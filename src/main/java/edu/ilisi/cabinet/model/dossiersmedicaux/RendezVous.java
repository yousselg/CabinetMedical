package edu.ilisi.cabinet.model.dossiersmedicaux;

import edu.ilisi.cabinet.model.actors.Docteur;
import edu.ilisi.cabinet.model.actors.Patient;
import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
@Data
@Entity
public class RendezVous {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idRendezVous;

    @OneToOne(cascade = CascadeType.ALL)
    private Patient patient;

    @ManyToOne(cascade = CascadeType.ALL)
    private Docteur docteur;
    private Integer Etat;
    private Date date;
    private Time heure;
}
