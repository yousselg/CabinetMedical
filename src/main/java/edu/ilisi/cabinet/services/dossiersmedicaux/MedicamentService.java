package edu.ilisi.cabinet.services.dossiersmedicaux;

import java.util.List;

import edu.ilisi.cabinet.model.dossiersmedicaux.Medicament;

public interface MedicamentService {

	public void addMedicament(Medicament Medicament);

	public List<Medicament> getAllMedicaments();

	public void deleteMedicament(Long id);

	public Medicament updateMedicament(Medicament Medicament);

	public Medicament getMedicament(Long id);
	
}
