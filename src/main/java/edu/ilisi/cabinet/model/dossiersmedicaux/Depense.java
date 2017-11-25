package edu.ilisi.cabinet.model.dossiersmedicaux;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Depense {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idDepense;
    private String libelle;
    private Float montant;
    private Date date;
}
