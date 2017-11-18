package edu.ilisi.cabinet.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.ConsultationRepository;
import edu.ilisi.cabinet.services.ConsultationService;

@Service
public class ConsultationServiceImpl implements ConsultationService{

    @Autowired
    private ConsultationRepository consultationRepository;

    @Override
    public void addConsultation(Consultation consultation) {
    	consultationRepository.save(consultation);
    }
    
    @Override
    public void updateConsultation(Consultation consultation) {
    	consultationRepository.save(consultation);
    }

    @Override
    public Consultation getConsultation(Long id) {
        return consultationRepository.findOne(id);
    }

	@Override
	public List<Consultation> getAllConsultations() {
		return (List<Consultation>) consultationRepository.findAll();
	}

	@Override
	public void deleteConsultation(Long id) {
		consultationRepository.delete(id);
	}

}
