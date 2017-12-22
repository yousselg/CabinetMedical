package edu.ilisi.cabinet.controllers.gestionFinanciere;

import edu.ilisi.cabinet.model.gestionFinanciere.Depense;
import edu.ilisi.cabinet.services.gestionFinanciere.DepenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RequestMapping("/depenses")
@RestController
@CrossOrigin
public class DepensesController {
    @Autowired
    private DepenseService DepenseService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Depense>> getAllDepenses() {
        List<Depense> Depenses = (List<Depense>) DepenseService.getAllDepenses();
        if (Depenses.isEmpty()) {
            return new ResponseEntity<List<Depense>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Depense>>(Depenses, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteDepense(@PathVariable Long id) {
        DepenseService.deleteDepense(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> updateDepense(@RequestBody Depense depense) {
        DepenseService.updateDepense(depense);
        return new ResponseEntity<Depense>(depense, HttpStatus.ACCEPTED);

    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getDepenseById(@PathVariable Long id) {
        Depense depense = DepenseService.getDepense(id);
        if (depense == null)
            return new ResponseEntity<Depense>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<Depense>(depense, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addDepense(@RequestBody Depense depense) {
        depense.setDate(new Date());
        DepenseService.addDepense(depense);
        return new ResponseEntity<Depense>(depense, HttpStatus.ACCEPTED);

    }
}
