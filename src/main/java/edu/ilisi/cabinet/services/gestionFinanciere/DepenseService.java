package edu.ilisi.cabinet.services.gestionFinanciere;

import java.util.Date;
import java.util.List;

import edu.ilisi.cabinet.model.gestionFinanciere.Depense;

public interface DepenseService {
    public void addDepense(Depense Depense);

    public List<Depense> getAllDepenses();

    public void deleteDepense(Long id);

    public Depense updateDepense(Depense Depense);

    public Depense getDepense(Long id);
    public List<Depense> getDepensesByDate(Date b , Date e);
}
