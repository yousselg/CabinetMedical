package edu.ilisi.cabinet.model.dossiersmedicaux;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class TypeConsultation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idTypeConsultation;
    private String libelle;
    private Float prix;
}
