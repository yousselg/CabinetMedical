package edu.ilisi.cabinet.services.gestionfinanciere;

import java.util.Date;
import java.util.List;

import edu.ilisi.cabinet.model.gestionfinanciere.Depense;

public interface DepenseService {
  void addDepense(Depense depense);

  List<Depense> getAllDepenses();

  void deleteDepense(Long id);

  Depense updateDepense(Depense depense);

  Depense getDepense(Long id);

  List<Depense> getDepensesByDate(Date b, Date e);
}
