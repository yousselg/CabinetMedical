package edu.ilisi.cabinet.services.dossiersmedicaux;

import java.util.List;

import edu.ilisi.cabinet.model.dossiersmedicaux.Medicament;

public interface MedicamentService {

	public void addMedicament(Medicament medicament);

	public List<Medicament> getAllMedicaments();

	public void deleteMedicament(Long id);

	public Medicament updateMedicament(Medicament medicament);

	public Medicament getMedicament(Long id);
	
}
