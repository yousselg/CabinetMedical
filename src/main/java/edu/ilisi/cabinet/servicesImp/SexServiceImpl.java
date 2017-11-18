package edu.ilisi.cabinet.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.actors.RefSex;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.SexRepository;
import edu.ilisi.cabinet.services.SexService;

@Service
public class SexServiceImpl implements SexService {

    @Autowired
    private SexRepository Repository;

    @Override
    public void addgender(RefSex s) {
        Repository.save(s);
    }

    @Override
    public List<RefSex> getlistofSex() {
        return (List<RefSex>)Repository.findAll();
    }
}
