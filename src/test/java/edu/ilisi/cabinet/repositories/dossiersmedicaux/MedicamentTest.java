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

import edu.ilisi.cabinet.model.dossiersmedicaux.Medicament;

/**
 * @author Home
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MedicamentTest {
	
	@Autowired
	MedicamentRepository repo;
	
	private Medicament medicament = new Medicament();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		medicament.setLibelle("Doliprane");
		medicament.setDescription("Doliprane pout tlm");
		System.err.println("ehllo");
		medicament = repo.save(medicament);
		System.out.println(medicament.getClass());
	}

	@Test
	public void save() {
		
		medicament = repo.save(medicament);
		assertNotNull(medicament.getId_medicament());
	}
	
	@Test
	public void update() {
		medicament.setLibelle("AIDS");
		medicament = repo.save(medicament);
		assertEquals(medicament.getLibelle(), "AIDS");
	}
	
	@Test
	public void getAll() {
		assertNotNull(repo.findAll());
	}
	
	@Test
	public void delete() {
		repo.delete(medicament);
		assertFalse(repo.findById(medicament.getId_medicament()).isPresent());
	}

}
