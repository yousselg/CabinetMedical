package edu.ilisi.cabinet.services.dossiersmedicaux;

import edu.ilisi.cabinet.model.dossiersmedicaux.Depense;

import java.util.Date;
import java.util.List;

public interface DepenseService {
    public void addDepense(Depense Depense);

    public List<Depense> getAllDepenses();

    public void deleteDepense(Long id);

    public Depense updateDepense(Depense Depense);

    public Depense getDepense(Long id);
    public List<Depense> getDepensesByDate(Date b , Date e);
}
