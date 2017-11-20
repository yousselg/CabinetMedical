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

import edu.ilisi.cabinet.model.dossiersmedicaux.Symptome;
import edu.ilisi.cabinet.services.dossiersmedicaux.SymptomeService;

@RequestMapping("/symptome")
@RestController
@CrossOrigin
public class SymptomeController {

	@Autowired
	private SymptomeService symptomeService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Symptome>> getAllSymptomes() {
		List<Symptome> symptomes = (List<Symptome>) symptomeService.getAllSymptomes();
		if (symptomes.isEmpty()) {
			return new ResponseEntity<List<Symptome>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Symptome>>(symptomes, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteSymptome(@PathVariable Long id) {
		symptomeService.deleteSymptome(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addSymptome(@RequestBody Symptome symptome) {
		symptomeService.addSymptome(symptome);
		return new ResponseEntity<Symptome>(symptome, HttpStatus.ACCEPTED);

	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> updateSymptome(@RequestBody Symptome symptome) {
		symptomeService.updateSymptome(symptome);
		return new ResponseEntity<Symptome>(symptome, HttpStatus.ACCEPTED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getSymptomeById(@PathVariable Long id) {
		Symptome symptome = symptomeService.getSymptome(id);
		if (symptome == null) {
			return new ResponseEntity<Symptome>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Symptome>(symptome, HttpStatus.OK);
	}
	
}
