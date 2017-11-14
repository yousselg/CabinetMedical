package edu.ilisi.cabinet.controllers;

import edu.ilisi.cabinet.model.actors.RefSex;
import edu.ilisi.cabinet.services.SexService;
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

    @RequestMapping( method = RequestMethod.GET)
    public ResponseEntity<List<RefSex>> getAll() {

        List<RefSex> genders = (List<RefSex>) service.getlistofSex();
        if(genders.isEmpty()){
            return new ResponseEntity<List<RefSex>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<RefSex>>(genders, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST )
    public ResponseEntity<?> add(@RequestBody RefSex input) {
        service.addgender(input);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}
