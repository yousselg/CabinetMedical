package edu.ilisi.cabinet.controllers.rendezvous;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		List<RendezVous> rendezVouss =  rendezVousService.getAllRendezVous();
		if (rendezVouss.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(rendezVouss, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<RendezVous> getRendezVousById(@PathVariable Long id) {
		RendezVous rendezVous = rendezVousService.getRendezVous(id);
		if (rendezVous == null)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(rendezVous, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{annee}/{mois}", method = RequestMethod.GET)
	public ResponseEntity<List<RendezVous>> getRendezVousByMois(@PathVariable Integer annee,@PathVariable Integer mois) {
		List<RendezVous> rendezVous = rendezVousService.getRendezVousMois(annee,mois);
		if (rendezVous == null)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(rendezVous, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{annee}/{mois}/{jour}", method = RequestMethod.GET)
	// Old : @PathVariable @DateTimeFormat(pattern="yyyy-MM-dd") @ApiParam(value = "Format de parametre yyyy-MM-dd",format="yyyy-MM-dd",example="2017-01-01") Date jour
	public ResponseEntity<List<RendezVous>> getRendezVousByDate(@PathVariable Integer annee,@PathVariable Integer mois,@PathVariable Integer jour) {
		List<RendezVous> rendezVous = rendezVousService.getRendezVousJour(annee,mois,jour);
		if (rendezVous == null)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(rendezVous, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<RendezVous> addRendezVous(@RequestBody RendezVous rendezVous) {
		rendezVousService.addRendezVous(rendezVous);
		return new ResponseEntity<>(rendezVous, HttpStatus.ACCEPTED);

	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<RendezVous> updateRendezVous(@RequestBody RendezVous rendezVous) {
		rendezVousService.updateRendezVous(rendezVous);
		return new ResponseEntity<>(rendezVous, HttpStatus.ACCEPTED);

	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<HttpStatus> deleteRendezVous(@PathVariable Long id) {
		rendezVousService.deleteRendezVous(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
