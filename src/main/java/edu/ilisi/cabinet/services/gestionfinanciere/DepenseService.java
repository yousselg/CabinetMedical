package edu.ilisi.cabinet.services.gestionfinanciere;

import java.util.Date;
import java.util.List;

import edu.ilisi.cabinet.model.gestionfinanciere.Depense;

public interface DepenseService {
	public void addDepense(Depense depense);

	public List<Depense> getAllDepenses();

	public void deleteDepense(Long id);

	public Depense updateDepense(Depense depense);

	public Depense getDepense(Long id);

	public List<Depense> getDepensesByDate(Date b, Date e);
}
