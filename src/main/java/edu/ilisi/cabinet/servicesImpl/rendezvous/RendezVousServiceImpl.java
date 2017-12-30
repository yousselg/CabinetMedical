package edu.ilisi.cabinet.servicesImpl.rendezvous;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.rendezvous.RendezVous;
import edu.ilisi.cabinet.repositories.rendezvous.RendezvousRepository;
import edu.ilisi.cabinet.services.rendezvous.RendezVousService;

@Service
public class RendezVousServiceImpl implements RendezVousService {

	@Autowired
	private RendezvousRepository rendezVousRepository;

	@Override
	public RendezVous addRendezVous(RendezVous rendezVous) {
		return rendezVousRepository.save(rendezVous);
	}

	@Override
	public List<RendezVous> getAllRendezVous() {
		return (List<RendezVous>) rendezVousRepository.findAll();
	}

	@Override
	public void deleteRendezVous(Long id) {
		rendezVousRepository.delete(id);
	}

	@Override
	public RendezVous updateRendezVous(RendezVous rendezVous) {
		return rendezVousRepository.save(rendezVous);
	}

	@Override
	public RendezVous getRendezVous(Long id) {
		return rendezVousRepository.findOne(id);
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<RendezVous> getRendezVousMois(Date mois) {
		return rendezVousRepository.findByMois(mois.getMonth()+1);
	}

	@Override
	public List<RendezVous> getRendezVousJour(Date jour) {
		return rendezVousRepository.findByDate(jour);
	}

}