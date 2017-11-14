package edu.ilisi.cabinet.servicesImp;

import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.DossierMedicalRepository;
import edu.ilisi.cabinet.services.DossierMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DossierMedicalServiceImpl implements DossierMedicalService {

    @Autowired
    private DossierMedicalRepository Repository;

    @Override
    public void addDossieMecial(DossierMedical dossierMedical) {
        Repository.save(dossierMedical);
    }

    @Override
    public List<DossierMedical> getAllDossierMedicaux() {
        return (List<DossierMedical>) Repository.findAll();
    }

    @Override
    public void deleteDossierMedical(DossierMedical dossierMedical) {
        Repository.delete(dossierMedical);
    }

    @Override
    public void updateDossierMedical(DossierMedical dossierMedical) {
        Repository.save(dossierMedical);
    }

    @Override
    public DossierMedical getDossierMedical(Long id) {
        return Repository.findOne((Long )id);
    }
}
