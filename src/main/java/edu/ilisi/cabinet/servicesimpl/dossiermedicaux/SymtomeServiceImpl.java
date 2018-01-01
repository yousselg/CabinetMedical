package edu.ilisi.cabinet.servicesimpl.dossiermedicaux;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.dossiersmedicaux.Symptome;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.SymptomeRepository;
import edu.ilisi.cabinet.services.dossiersmedicaux.SymptomeService;

@Service
public class SymtomeServiceImpl implements SymptomeService{

    @Autowired
    private SymptomeRepository symptomeRepository;

    @Override
    public void addSymptome(Symptome symptome) {
    	symptomeRepository.save(symptome);
    }
    
    @Override
    public void updateSymptome(Symptome symptome) {
    	symptomeRepository.save(symptome);
    }

    @Override
    public Symptome getSymptome(Long id) {
        return symptomeRepository.findOne(id);
    }

	@Override
	public List<Symptome> getAllSymptomes() {
		return (List<Symptome>) symptomeRepository.findAll();
	}

	@Override
	public void deleteSymptome(Long id) {
		symptomeRepository.delete(id);
	}

}
