package edu.ilisi.cabinet.servicesimpl.dossiermedicaux;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.dossiersmedicaux.Maladie;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.MaladieHeriteRepository;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.MaladieRepository;
import edu.ilisi.cabinet.services.dossiersmedicaux.MaladieService;

@Service
public class MaladieServiceImpl implements MaladieService{

	@Autowired
    private MaladieRepository maladieRepository;
	
	@Autowired
    private MaladieHeriteRepository maladieHeriteRepository;

    @Override
    public void addMaladie(Maladie maladie) {
    	if(maladie instanceof Maladie)
    		maladieRepository.save(maladie);
    	else
    		maladieHeriteRepository.save(maladie);
    }
    
    @Override
    public Maladie updateMaladie(Maladie maladie) {
    	if(maladie instanceof Maladie)
    		return maladieRepository.save(maladie);
    	else
    		return maladieHeriteRepository.save(maladie);
    }

    @Override
    public Maladie getMaladie(Long id) {
        return maladieRepository.findOne(id);
    }

	@Override
	public List<Maladie> getAllMaladies() {
		return (List<Maladie>) maladieRepository.findAll();
	}

	@Override
	public void deleteMaladie(Long id) {
		maladieRepository.delete(id);
	}

}
