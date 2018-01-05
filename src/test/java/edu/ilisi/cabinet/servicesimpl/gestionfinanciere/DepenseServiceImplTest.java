package edu.ilisi.cabinet.servicesimpl.gestionfinanciere;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.ilisi.cabinet.model.gestionfinanciere.Depense;
import edu.ilisi.cabinet.services.gestionfinanciere.DepenseService;

/**
 * The class <code>DepenseServiceImplTest</code> contains tests for the class
 * <code>{@link DepenseServiceImpl}</code>.
 *
 * @generatedBy CodePro at 05/01/18 15:43
 * @author Home
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepenseServiceImplTest {
  /**
   * Run the void addDepense(Depense) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */

  @Autowired
  private DepenseService fixture;
  private Long staticId;

  @Test
  public void testAddDepense_1() throws Exception {

    Depense depense = new Depense();

    fixture.addDepense(depense);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.gestionfinanciere.DepenseServiceImpl.addDepense(DepenseServiceImpl.java:19)
  }

  /**
   * Run the void deleteDepense(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testDeleteDepense_1() throws Exception {

    Long id = new Long(1L);

    // fixture.deleteDepense(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.gestionfinanciere.DepenseServiceImpl.deleteDepense(DepenseServiceImpl.java:29)
  }

  /**
   * Run the List<Depense> getAllDepenses() method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetAllDepenses_1() throws Exception {

    List<Depense> result = fixture.getAllDepenses();
    staticId = result.get(0).getIdDepense();
    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.gestionfinanciere.DepenseServiceImpl.getAllDepenses(DepenseServiceImpl.java:24)
    assertNotNull(result);
  }

  /**
   * Run the Depense getDepense(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetDepense_1() throws Exception {

    Long id = staticId;

    // Depense result = fixture.getDepense(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.gestionfinanciere.DepenseServiceImpl.getDepense(DepenseServiceImpl.java:39)
    // assertNull(result);
  }

  /**
   * Run the List<Depense> getDepensesByDate(Date,Date) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetDepensesByDate_1() throws Exception {

    Date b = new Date();
    Date e = new Date();

    List<Depense> result = fixture.getDepensesByDate(b, e);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.gestionfinanciere.DepenseServiceImpl.getDepensesByDate(DepenseServiceImpl.java:44)
    assertNotNull(result);
  }

  /**
   * Run the Depense updateDepense(Depense) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testUpdateDepense_1() throws Exception {

    Depense depense = new Depense();

    Depense result = fixture.updateDepense(depense);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.gestionfinanciere.DepenseServiceImpl.updateDepense(DepenseServiceImpl.java:34)
    assertNotNull(result);
  }

  /**
   * Perform pre-test initialization.
   *
   * @throws Exception
   *           if the initialization fails for some reason
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Before
  public void setUp() throws Exception {
    // add additional set up code here
  }

  /**
   * Perform post-test clean-up.
   *
   * @throws Exception
   *           if the clean-up fails for some reason
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @After
  public void tearDown() throws Exception {
    // Add additional tear down code here
  }

}