package edu.ilisi.cabinet.servicesimpl.dossiermedicaux;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.Ordonnance;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.ConsultationRepository;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.OrdonnanceRepository;
import edu.ilisi.cabinet.services.dossiersmedicaux.ConsultationService;

@Service
public class ConsultationServiceImpl implements ConsultationService{

    @Autowired
    private ConsultationRepository consultationRepository;
    
    @Autowired
    private OrdonnanceRepository ordonnanceRepository;

    @Override
    public void addConsultation(Consultation consultation) {
    	consultationRepository.save(consultation);
    }
    
    @Override
    public Consultation updateConsultation(Consultation consultation) {
    	return consultationRepository.save(consultation);
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

	@Override
	public Long addOrdonnace(Long id, Ordonnance ordonnance) {
		Consultation consultation = getConsultation(id);
		if(consultation!=null){
			consultation.setOrdonnance(ordonnance);
			ordonnance.setConsultation(consultation);
			updateConsultation(consultation);
			return ordonnanceRepository.findTopByOrderByDateOrdonnaceDesc().getIdOrdonnance();
		}
		return null;
	}

	@Override
	public List<Consultation> getConsultationsByYear(Date d, Date f) {
		return consultationRepository.findByDateConsultationBetween(d,f);
	}
}
