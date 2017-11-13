package edu.ilisi.cabinet.services;


import edu.ilisi.cabinet.model.actors.Ref_sex;

import java.util.List;

public interface SexService {
    public List<Ref_sex> getlistofSex();
    public void addgender(Ref_sex s);
}
