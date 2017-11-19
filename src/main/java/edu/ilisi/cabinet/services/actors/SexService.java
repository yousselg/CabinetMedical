package edu.ilisi.cabinet.services.actors;

import edu.ilisi.cabinet.model.actors.RefSex;

import java.util.List;

public interface SexService {

	public List<RefSex> getlistofSex();

	public void addgender(RefSex s);
}
