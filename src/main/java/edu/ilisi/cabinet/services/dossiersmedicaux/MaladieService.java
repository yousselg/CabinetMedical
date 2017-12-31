package edu.ilisi.cabinet.services.dossiersmedicaux;

import java.util.List;

import edu.ilisi.cabinet.model.dossiersmedicaux.Maladie;

public interface MaladieService {

	public void addMaladie(Maladie maladie);

	public List<Maladie> getAllMaladies();

	public void deleteMaladie(Long id);

	public Maladie updateMaladie(Maladie maladie);

	public Maladie getMaladie(Long id);
	
}
