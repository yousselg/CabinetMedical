package edu.ilisi.cabinet.servicesImpl.dossiermedicaux;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.dossiersmedicaux.Medicament;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.MedicamentRepository;
import edu.ilisi.cabinet.services.dossiersmedicaux.MedicamentService;

@Service
public class MedicamentServiceImpl implements MedicamentService{

    @Autowired
    private MedicamentRepository medicamentRepository;

    @Override
    public void addMedicament(Medicament symptome) {
    	medicamentRepository.save(symptome);
    }
    
    @Override
    public Medicament updateMedicament(Medicament symptome) {
    	return medicamentRepository.save(symptome);
    }

    @Override
    public Medicament getMedicament(Long id) {
        return medicamentRepository.findOne(id);
    }

	@Override
	public List<Medicament> getAllMedicaments() {
		return (List<Medicament>) medicamentRepository.findAll();
	}

	@Override
	public void deleteMedicament(Long id) {
		medicamentRepository.delete(id);
	}

}
