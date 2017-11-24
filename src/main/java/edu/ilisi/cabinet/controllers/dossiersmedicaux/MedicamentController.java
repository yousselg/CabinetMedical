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

import edu.ilisi.cabinet.model.dossiersmedicaux.Medicament;
import edu.ilisi.cabinet.services.dossiersmedicaux.MedicamentService;

@RequestMapping("/medicament")
@RestController
@CrossOrigin
public class MedicamentController {

	@Autowired
	private MedicamentService medicamentService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Medicament>> getAllMedicaments() {
		List<Medicament> medicaments = (List<Medicament>) medicamentService.getAllMedicaments();
		if (medicaments.isEmpty()) {
			return new ResponseEntity<List<Medicament>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Medicament>>(medicaments, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteMedicament(@PathVariable Long id) {
		medicamentService.deleteMedicament(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> updateMedicament(@RequestBody Medicament medicament) {
		medicamentService.updateMedicament(medicament);
		return new ResponseEntity<Medicament>(medicament, HttpStatus.ACCEPTED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getMedicamentById(@PathVariable Long id) {
		Medicament medicament = medicamentService.getMedicament(id);
		if (medicament == null)
			return new ResponseEntity<Medicament>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<Medicament>(medicament, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addMedicament(@RequestBody Medicament medicament) {
		medicamentService.addMedicament(medicament);
		return new ResponseEntity<Medicament>(medicament, HttpStatus.ACCEPTED);

	}
}
