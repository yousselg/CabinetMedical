package edu.ilisi.cabinet.controllers.gestionfinanciere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.gestionfinanciere.Depense;
import edu.ilisi.cabinet.services.dossiersmedicaux.ConsultationService;
import edu.ilisi.cabinet.services.gestionfinanciere.DepenseService;

@RequestMapping("/report")
@RestController
@CrossOrigin
public class ReportingController {
    @Autowired
    private DepenseService depenseService;
    @Autowired
    private ConsultationService consultationService;
    @SuppressWarnings("deprecation")
    @RequestMapping(value = "/{year}",method = RequestMethod.GET)
    public ResponseEntity<List<?>> getRecetteAndDepense(@PathVariable int year) {
		List<Depense>depenses= depenseService.getDepensesByDate(new Date(year + "/01"+"/01") ,new Date(year + "/12"+"/31") );
        List<Consultation> consultations = consultationService.getConsultationsByYear(new Date(year + "/01"+"/01") ,new Date(year + "/12"+"/31"));
        int [] deps = new int[12];
        int [] rec = new int[12];
        int [] profit = new int[12];
        int [] pie = new int[3];
        Arrays.fill(deps,0);
        Arrays.fill(rec,0);
        Arrays.fill(pie,0);
        Iterator<?> it = depenses.iterator();
        Depense dep;
        while (it.hasNext()){
            dep=(Depense) it.next();
            deps[Integer.parseInt(dep.getDate().toString().split("-")[1])-1]+=dep.getMontant();
            pie[1]+=dep.getMontant();
        }
         it = consultations.iterator();
        Consultation c;
        while (it.hasNext()){
            c=(Consultation) it.next();
            rec[Integer.parseInt(c.getDateConsultation().toString().split("-")[1])-1]+=c.getMontant_payee();
            pie[0]+=c.getMontant_payee();
        }
        for(int i = 0 ; i< 12 ; i++) {
            profit[i] = rec[i] - deps[i];
            pie[2]+=profit[i];
        }
        List<int[]> data = new ArrayList<>();
        data.add(0,rec);
        data.add(1,deps);
        data.add(2,profit);
        data.add(3,pie);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
