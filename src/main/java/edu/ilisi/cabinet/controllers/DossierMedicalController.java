package edu.ilisi.cabinet.controllers;

import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;
import edu.ilisi.cabinet.services.DossierMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/dossiermedical")
@RestController
@CrossOrigin
public class DossierMedicalController {
    @Autowired
    private DossierMedicalService service;
    @RequestMapping( method = RequestMethod.GET)
    public ResponseEntity<List<DossierMedical>> listAllProducts() {
        List<DossierMedical> dossierMedicals = (List<DossierMedical>) service.getAllDossierMedicaux();
        if(dossierMedicals.isEmpty()){
            return new ResponseEntity<List<DossierMedical>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<DossierMedical>>(dossierMedicals, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> add(@RequestBody DossierMedical input) {
        service.addDossieMecial(input);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@RequestBody DossierMedical dossierMedical)
    {
        service.deleteDossierMedical(dossierMedical);
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody DossierMedical dossierMedical)
    {
        service.updateDossierMedical(dossierMedical);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @RequestMapping( value = "/dossiermedical/{id}" , method = RequestMethod.GET )
    public ResponseEntity<?> get(@PathVariable Long id) {
        service.getDossierMedical(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
