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

import edu.ilisi.cabinet.model.actors.Docteur;
import edu.ilisi.cabinet.services.actors.DocteurService;

@RequestMapping("/docteur")
@RestController
@CrossOrigin
public class DocteurController {

	@Autowired
	private DocteurService docteurService;

	

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<HttpStatus> deleteDocteur(@PathVariable Long id) {
		docteurService.deleteDocteur(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
  public ResponseEntity<Docteur> updateDocteur(@RequestBody Docteur docteur) {
    docteurService.addDocteur(docteur);
    return new ResponseEntity<>(docteur, HttpStatus.ACCEPTED);

  }
	
	@RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<Docteur> addDocteur(@RequestBody Docteur docteur) {
    docteurService.addDocteur(docteur);
    return new ResponseEntity<>(docteur, HttpStatus.ACCEPTED);

  }

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Docteur> getDocteurById(@PathVariable Long id) {
		Docteur docteur = docteurService.getDocteur(id);
		if (docteur == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(docteur, HttpStatus.OK);

	}
	
	@RequestMapping(value="",method = RequestMethod.GET)
	public ResponseEntity<List<Docteur>> listAllDocteurs() {
		List<Docteur> docteurs =  docteurService.getAllDocteurs();
		if (docteurs.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(docteurs, HttpStatus.OK);
	}
	
}
