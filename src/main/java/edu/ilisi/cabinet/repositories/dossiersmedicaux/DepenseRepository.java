package edu.ilisi.cabinet.repositories.dossiersmedicaux;

import edu.ilisi.cabinet.model.dossiersmedicaux.Depense;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface DepenseRepository extends CrudRepository<Depense,Long>{
   // public  List<Depense> getDepensesByDateYear(int year);
    List<Depense> findAllByDateBetween(Date begin , Date end);
}
