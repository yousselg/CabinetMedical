package edu.ilisi.cabinet.servicesimpl.actors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.actors.Secretaire;
import edu.ilisi.cabinet.repositories.actors.SecretaireRepository;
import edu.ilisi.cabinet.services.actors.SecretaireService;

@Service

public class SecretaireServiceImpl implements SecretaireService {

  @Autowired
  private SecretaireRepository secretaireRepository;

  @Autowired
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  @Override
  public void addSecretaire(Secretaire secretaire) {
    secretaire.setUsername(secretaire.getEmail());
    secretaire.setPassword(bCryptPasswordEncoder.encode(secretaire.getCIN()));
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
