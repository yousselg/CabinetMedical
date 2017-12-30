package edu.ilisi.cabinet.controllers.rendezvous;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.ilisi.cabinet.model.rendezvous.RendezVous;
import edu.ilisi.cabinet.services.rendezvous.RendezVousService;


@RequestMapping("/rendezVous")
@RestController
@CrossOrigin
public class RendezVousController {

	@Autowired
	private RendezVousService rendezVousService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<RendezVous>> getAllRendezVous() {
		List<RendezVous> rendezVouss = (List<RendezVous>) rendezVousService.getAllRendezVous();
		if (rendezVouss.isEmpty()) {
			return new ResponseEntity<List<RendezVous>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<RendezVous>>(rendezVouss, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getRendezVousById(@PathVariable Long id) {
		RendezVous rendezVous = rendezVousService.getRendezVous(id);
		if (rendezVous == null)
			return new ResponseEntity<RendezVous>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<RendezVous>(rendezVous, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/mois/{mois}", method = RequestMethod.GET)
	public ResponseEntity<?> getRendezVousByMois(@PathVariable  @DateTimeFormat(pattern="yyyy-MM-dd") Date mois) {
		List<RendezVous> rendezVous = rendezVousService.getRendezVousMois(mois);
		if (rendezVous == null)
			return new ResponseEntity<RendezVous>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<RendezVous>>(rendezVous, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/jour/{jour}", method = RequestMethod.GET)
	public ResponseEntity<?> getRendezVousByDate(@PathVariable @DateTimeFormat(pattern="yyyy-MM-dd") Date jour) {
		List<RendezVous> rendezVous = rendezVousService.getRendezVousJour(jour);
		if (rendezVous == null)
			return new ResponseEntity<RendezVous>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<RendezVous>>(rendezVous, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addRendezVous(@RequestBody RendezVous rendezVous) {
		rendezVousService.addRendezVous(rendezVous);
		return new ResponseEntity<RendezVous>(rendezVous, HttpStatus.ACCEPTED);

	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> updateRendezVous(@RequestBody RendezVous rendezVous) {
		rendezVousService.updateRendezVous(rendezVous);
		return new ResponseEntity<RendezVous>(rendezVous, HttpStatus.ACCEPTED);

	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteRendezVous(@PathVariable Long id) {
		rendezVousService.deleteRendezVous(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
