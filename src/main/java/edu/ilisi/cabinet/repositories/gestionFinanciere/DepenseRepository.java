package edu.ilisi.cabinet.repositories.gestionFinanciere;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.ilisi.cabinet.model.gestionFinanciere.Depense;

public interface DepenseRepository extends CrudRepository<Depense,Long>{
   // public  List<Depense> getDepensesByDateYear(int year);
    List<Depense> findAllByDateBetween(Date begin , Date end);
}
