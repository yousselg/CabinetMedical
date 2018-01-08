package edu.ilisi.cabinet.services.actors;

import java.util.List;

import edu.ilisi.cabinet.model.actors.Docteur;

public interface DocteurService {

	Docteur addDocteur(Docteur docteur);

	Docteur getDocteur(Long id);
	
	void deleteDocteur(Long id);

	List<Docteur> getAllDocteurs();
}
