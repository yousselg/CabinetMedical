package edu.ilisi.cabinet.services;

import java.util.List;

import edu.ilisi.cabinet.model.actors.Docteur;

public interface DocteurService {

	public void addDocteur(Docteur docteur);

	public Docteur getDocteur(Long id);
	
	public void deleteDocteur(Long id);

	public List<Docteur> getAllDocteurs();
}
