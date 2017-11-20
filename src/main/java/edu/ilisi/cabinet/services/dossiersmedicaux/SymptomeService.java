package edu.ilisi.cabinet.services.dossiersmedicaux;

import edu.ilisi.cabinet.model.dossiersmedicaux.Symptome;

import java.util.List;

public interface SymptomeService {

	public void addSymptome(Symptome Symptome);

	public List<Symptome> getAllSymptomes();

	public void deleteSymptome(Long id);

	public void updateSymptome(Symptome Symptome);

	public Symptome getSymptome(Long id);
}
