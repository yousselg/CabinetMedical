package edu.ilisi.cabinet.controllers.actors;

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

import edu.ilisi.cabinet.model.actors.Secretaire;
import edu.ilisi.cabinet.services.actors.SecretaireService;

@RequestMapping("/secretaire")
@RestController
@CrossOrigin
public class SecretaireController {

	@Autowired
	private SecretaireService secretaireService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Secretaire>> getAllSecretaires() {
		List<Secretaire> secretaires = secretaireService.getAllSecretaires();
		if (secretaires.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(secretaires, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<HttpStatus> deleteSecretaire(@PathVariable Long id) {
		secretaireService.deleteSecretaire(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Secretaire> updateSecretaire(@RequestBody Secretaire secretaire) {
		secretaireService.addSecretaire(secretaire);
		return new ResponseEntity<>(secretaire, HttpStatus.ACCEPTED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Secretaire> getSecretaireById(@PathVariable Long id) {
		Secretaire secretaire = secretaireService.getSecretaire(id);
		if (secretaire == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(secretaire, HttpStatus.OK);

	}

}
