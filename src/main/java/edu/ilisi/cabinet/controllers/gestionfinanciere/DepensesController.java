package edu.ilisi.cabinet.controllers.gestionfinanciere;

import java.util.Date;
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

import edu.ilisi.cabinet.model.gestionfinanciere.Depense;
import edu.ilisi.cabinet.services.gestionfinanciere.DepenseService;

@RequestMapping("/depenses")
@RestController
@CrossOrigin
public class DepensesController {
    @Autowired
    private DepenseService depenseService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Depense>> getAllDepenses() {
        List<Depense> depenses = depenseService.getAllDepenses();
        if (depenses.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(depenses, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<HttpStatus> deleteDepense(@PathVariable Long id) {
        depenseService.deleteDepense(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Depense> updateDepense(@RequestBody Depense depense) {
        depenseService.updateDepense(depense);
        return new ResponseEntity<>(depense, HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Depense> getDepenseById(@PathVariable Long id) {
        Depense depense = depenseService.getDepense(id);
        if (depense == null)
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(depense, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Depense> addDepense(@RequestBody Depense depense) {
        depense.setDate(new Date());
        depenseService.addDepense(depense);
        return new ResponseEntity<>(depense, HttpStatus.ACCEPTED);

    }
}
