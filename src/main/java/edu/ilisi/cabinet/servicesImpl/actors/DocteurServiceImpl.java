package edu.ilisi.cabinet.servicesImpl.actors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.actors.Docteur;
import edu.ilisi.cabinet.repositories.actors.DocteurRepository;
import edu.ilisi.cabinet.services.actors.DocteurService;

@Service

public class DocteurServiceImpl implements DocteurService {

	@Autowired
	private DocteurRepository docteurRepository;

	@Override
	public void addDocteur(Docteur docteur) {
		docteurRepository.save(docteur);
	}

	@Override
	public Docteur getDocteur(Long id) {
		return docteurRepository.findOne(id);
	}

	@Override
	public void deleteDocteur(Long id) {
		docteurRepository.delete(id);
	}

	@Override
	public List<Docteur> getAllDocteurs() {
		return (List<Docteur>) docteurRepository.findAll();
	}
}
