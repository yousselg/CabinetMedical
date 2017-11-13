package edu.ilisi.cabinet.servicesImp;

import edu.ilisi.cabinet.model.actors.Patient;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.PatientRepository;
import edu.ilisi.cabinet.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository Repository;

    @Override
    public void addPatient(Patient patient) {
     Repository.save(patient);
    }
}
