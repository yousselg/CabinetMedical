package edu.ilisi.cabinet.controllers.dossiersmedicaux;

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

import edu.ilisi.cabinet.model.dossiersmedicaux.Maladie;
import edu.ilisi.cabinet.services.dossiersmedicaux.MaladieService;

@RequestMapping("/maladie")
@RestController
@CrossOrigin
public class MaladieController {

	@Autowired
	private MaladieService maladieService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Maladie>> getAllMaladies() {
		List<Maladie> maladies = (List<Maladie>) maladieService.getAllMaladies();
		if (maladies.isEmpty()) {
			return new ResponseEntity<List<Maladie>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Maladie>>(maladies, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteMaladie(@PathVariable Long id) {
		maladieService.deleteMaladie(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> updateMaladie(@RequestBody Maladie maladie) {
		maladieService.updateMaladie(maladie);
		return new ResponseEntity<Maladie>(maladie, HttpStatus.ACCEPTED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getMaladieById(@PathVariable Long id) {
		Maladie maladie = maladieService.getMaladie(id);
		if (maladie == null)
			return new ResponseEntity<Maladie>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<Maladie>(maladie, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addMaladie(@RequestBody Maladie maladie) {
		maladieService.addMaladie(maladie);
		return new ResponseEntity<Maladie>(maladie, HttpStatus.ACCEPTED);

	}
}
