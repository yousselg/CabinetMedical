package edu.ilisi.cabinet.servicesImpl.dossiermedicaux;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.DossierMedicalRepository;
import edu.ilisi.cabinet.services.dossiersmedicaux.DossierMedicalService;

@Service
public class DossierMedicalServiceImpl implements DossierMedicalService {

    @Autowired
    private DossierMedicalRepository dmRepository;

    @Override
    public void addDossieMecial(DossierMedical dossierMedical) {
    	dmRepository.save(dossierMedical);
    }

    @Override
    public List<DossierMedical> getAllDossierMedicaux() {
        return (List<DossierMedical>) dmRepository.findAll();
    }

	@Override
	public void deleteDossierMedical(Long id) {
		dmRepository.delete(id);
	}

	@Override
	public void updateDossierMedical(DossierMedical dossierMedical) {
		dmRepository.save(dossierMedical);
	}

	@Override
	public DossierMedical getDossierMedical(Long id) {
		return dmRepository.findOne(id);
	}

	@Override
	public void addConsultation(Long id,Consultation consultation) {
		DossierMedical dossierMedical = getDossierMedical(id);
		if(dossierMedical!=null){
			consultation.setDossierMedical(dossierMedical);
			dossierMedical.getConsultations().add(consultation);
			updateDossierMedical(dossierMedical);
		}
	}
}
