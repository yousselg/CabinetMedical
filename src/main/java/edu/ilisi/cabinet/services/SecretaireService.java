package edu.ilisi.cabinet.services;

import java.util.List;

import edu.ilisi.cabinet.model.actors.Secretaire;

public interface SecretaireService {

	public void addSecretaire(Secretaire secretaire);

	public Secretaire getSecretaire(Long id);

	public void deleteSecretaire(Long id);

	public List<Secretaire> getAllSecretaires();
}
