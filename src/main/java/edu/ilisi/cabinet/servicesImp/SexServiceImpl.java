package edu.ilisi.cabinet.servicesImp;

import com.sun.org.apache.regexp.internal.RE;
import edu.ilisi.cabinet.model.actors.Ref_sex;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.SexRepository;
import edu.ilisi.cabinet.services.SexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SexServiceImpl implements SexService {

    @Autowired
    private SexRepository Repository;

    @Override
    public void addgender(Ref_sex s) {
        Repository.save(s);
    }

    @Override
    public List<Ref_sex> getlistofSex() {
        return (List<Ref_sex>)Repository.findAll();
    }
}
