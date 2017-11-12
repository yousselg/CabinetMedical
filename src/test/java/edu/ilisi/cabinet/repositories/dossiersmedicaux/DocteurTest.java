/**
 * 
 */
package edu.ilisi.cabinet.repositories.dossiersmedicaux;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.ilisi.cabinet.model.actors.Docteur;

/**
 * @author Home
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DocteurTest {
	
	@Autowired
	private DocteurRepository repo;
	private Docteur docteur = new Docteur();

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
		System.out.println(docteur.getClass());
	}

	@Test
	public void save() {
		docteur.setNom("Kabarousse");
		docteur.setPrenom("saad");
		docteur.setCIN("XXXXX");
		docteur.setEmail("s.kabarousse@ilisi.edu");
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
		assertFalse(repo.findById(docteur.getId_personne()).isPresent());
	}

}
