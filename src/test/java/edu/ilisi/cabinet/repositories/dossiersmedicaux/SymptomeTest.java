/**
 * 
 */
package edu.ilisi.cabinet.repositories.dossiersmedicaux;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.ilisi.cabinet.model.dossiersmedicaux.Symptome;

/**
 * @author Home
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SymptomeTest {
	
	@Autowired
	private SymptomeRepository repo;
	private Symptome symptome = new Symptome();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		symptome.setLibele("SIDA");
		symptome.setDescription("SIDA MODIRA BISSI7A");
		symptome = repo.save(symptome);
		System.out.println(symptome.getClass());
	}

	@Test
	public void save() {
		
		symptome = repo.save(symptome);
		assertNotNull(symptome.getId_symptome());
	}
	
	@Test
	public void update() {
		symptome.setLibele("AIDS");
		symptome = repo.save(symptome);
		assertEquals(symptome.getLibele(), "AIDS");
	}
	
	@Test
	public void getAll() {
		assertNotNull(repo.findAll());
	}
	
	@Test
	public void delete() {
		repo.delete(symptome);
		assertFalse(repo.findById(symptome.getId_symptome()).isPresent());
	}

}
