package edu.ilisi.cabinet.servicesImp;

import com.sun.org.apache.regexp.internal.RE;
import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.ConsultationRepository;
import edu.ilisi.cabinet.services.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationServiceImpl implements ConsultationService{

    @Autowired
    private ConsultationRepository Repository;

    @Override
    public void addConsultation(Consultation consultation) {
        Repository.save(consultation);
    }

    @Override
    public List<Consultation> getAllDossierMedicaux() {
        return(List<Consultation>) Repository.findAll();
    }

    @Override
    public void deleteConsultation(Consultation consultation) {
        Repository.delete(consultation);
    }

    @Override
    public void updateConsultation(Consultation consultation) {
        Repository.save(consultation);
    }

    @Override
    public Consultation getConsultation(Long id) {
        return Repository.findById((Long )id).get();
    }

}
