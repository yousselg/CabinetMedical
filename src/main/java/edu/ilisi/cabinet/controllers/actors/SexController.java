package edu.ilisi.cabinet.controllers.actors;

import edu.ilisi.cabinet.model.actors.RefSex;
import edu.ilisi.cabinet.services.actors.SexService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/gender")
@RestController
@CrossOrigin
public class SexController {
	@Autowired
	private SexService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<RefSex>> getAllGenders() {

		List<RefSex> genders = service.getlistofSex();
		if (genders.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(genders, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<HttpStatus> addGender(@RequestBody RefSex input) {
		service.addgender(input);
		return new ResponseEntity<>(HttpStatus.CREATED);

	}
}
