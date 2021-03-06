package edu.ilisi.cabinet.services.rendezvous;

import java.util.List;

import edu.ilisi.cabinet.model.rendezvous.RendezVous;

public interface RendezVousService {

	public RendezVous addRendezVous(RendezVous rendezvous);

	public List<RendezVous> getAllRendezVous();

	public void deleteRendezVous(Long id);

	public RendezVous updateRendezVous(RendezVous rendezvous);

	public RendezVous getRendezVous(Long id);

	public List<RendezVous> getRendezVousMois(Integer annee,Integer mois);

	public List<RendezVous> getRendezVousJour(Integer annee,Integer mois,Integer jour);

}
