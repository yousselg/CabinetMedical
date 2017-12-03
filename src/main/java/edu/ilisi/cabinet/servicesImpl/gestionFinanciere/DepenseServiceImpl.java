package edu.ilisi.cabinet.servicesImpl.gestionFinanciere;

import edu.ilisi.cabinet.model.gestionFinanciere.Depense;
import edu.ilisi.cabinet.repositories.gestionFinanciere.DepenseRepository;
import edu.ilisi.cabinet.services.gestionFinanciere.DepenseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DepenseServiceImpl implements DepenseService {
    @Autowired
    private DepenseRepository depenseRepository;
    @Override
    public void addDepense(Depense depense) {
        depenseRepository.save(depense);
    }

    @Override
    public List<Depense> getAllDepenses() {
        return (List<Depense>) depenseRepository.findAll();
    }

    @Override
    public void deleteDepense(Long id) {
        depenseRepository.delete(id);
    }

    @Override
    public Depense updateDepense(Depense depense) {
        return depenseRepository.save(depense);
    }

    @Override
    public Depense getDepense(Long id) {
        return depenseRepository.findOne(id);
    }

    @Override
    public List<Depense> getDepensesByDate(Date b , Date e) {
         return depenseRepository.findAllByDateBetween(b,e);
    }
}
