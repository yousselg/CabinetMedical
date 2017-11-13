/**
 * 
 */
package edu.ilisi.cabinet.repositories.dossiersmedicaux;

import static org.junit.Assert.*;

import org.hamcrest.core.IsNot;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ilisi.cabinet.model.actors.Docteur;

/**
 * @author Home
 *
 */
public class DocteurTest {
	
	@Autowired
	private DocteurRepository repo;
	private Docteur docteur = new Docteur();
	private Long idDocteur = null ;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		docteur.setNom("Kabarousse");
		docteur.setPrenom("saad");
		docteur.setCIN("XXXXX");
		docteur.setEmail("s.kabarousse@ilisi.edu");
		docteur = repo.save(docteur);
	}

	@Test
	public void save() {
		
		docteur = repo.save(docteur);
		assertNotNull(docteur.getId_personne());
	}
	
	@Test
	public void update() {
		docteur.setNom("youssef");
		docteur = repo.save(docteur);
		assertEquals(docteur.getNom(), "youssef");
	}
	
	@Test
	public void getAll() {
		assertNotNull(repo.findAll());
	}
	
	@Test
	public void delete() {
		System.out.println(docteur);
		repo.delete(docteur);
		assertNull(repo.findById(docteur.getId_personne()));
	}

}
