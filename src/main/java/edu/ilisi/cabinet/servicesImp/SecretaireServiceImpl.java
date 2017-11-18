package edu.ilisi.cabinet.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.actors.Secretaire;
import edu.ilisi.cabinet.repositories.dossiersmedicaux.SecretaireRepository;
import edu.ilisi.cabinet.services.SecretaireService;

@Service

public class SecretaireServiceImpl implements SecretaireService {

	@Autowired
	private SecretaireRepository secretaireRepository;

	@Override
	public void addSecretaire(Secretaire secretaire) {
		secretaireRepository.save(secretaire);
	}

	@Override
	public Secretaire getSecretaire(Long id) {
		return secretaireRepository.findOne(id);
	}

	@Override
	public void deleteSecretaire(Long id) {
		secretaireRepository.delete(id);
	}

	@Override
	public List<Secretaire> getAllSecretaires() {
		return (List<Secretaire>) secretaireRepository.findAll();
	}
}
