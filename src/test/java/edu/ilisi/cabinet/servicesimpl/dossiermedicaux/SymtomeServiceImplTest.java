package edu.ilisi.cabinet.servicesimpl.dossiermedicaux;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.ilisi.cabinet.model.dossiersmedicaux.Symptome;
import edu.ilisi.cabinet.services.dossiersmedicaux.SymptomeService;

/**
 * The class <code>SymtomeServiceImplTest</code> contains tests for the class
 * <code>{@link SymtomeServiceImpl}</code>.
 *
 * @generatedBy CodePro at 05/01/18 15:43
 * @author Home
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SymtomeServiceImplTest {
  /**
   * Run the void addSymptome(Symptome) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */

  @Autowired
  private SymptomeService fixture;
  private static Long staticId;

  @Test
  public void testAddSymptome_1() throws Exception {

    Symptome symptome = new Symptome();

    fixture.addSymptome(symptome);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.SymtomeServiceImpl.addSymptome(SymtomeServiceImpl.java:20)
  }

  /**
   * Run the void deleteSymptome(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testDeleteSymptome_1() throws Exception {

    Long id = new Long(1L);

    // fixture.deleteSymptome(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.SymtomeServiceImpl.deleteSymptome(SymtomeServiceImpl.java:40)
  }

  /**
   * Run the List<Symptome> getAllSymptomes() method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetAllSymptomes_1() throws Exception {

    List<Symptome> result = fixture.getAllSymptomes();
    // staticId = result.get(0).getIdSymptome();

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.SymtomeServiceImpl.getAllSymptomes(SymtomeServiceImpl.java:35)
    // assertNotNull(result);
  }

  /**
   * Run the Symptome getSymptome(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetSymptome_1() throws Exception {

    Long id = staticId;

    // Symptome result = fixture.getSymptome(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.SymtomeServiceImpl.getSymptome(SymtomeServiceImpl.java:30)
    // assertNotNull(result);
  }

  /**
   * Run the void updateSymptome(Symptome) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testUpdateSymptome_1() throws Exception {

    Symptome symptome = new Symptome();

    fixture.updateSymptome(symptome);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.SymtomeServiceImpl.updateSymptome(SymtomeServiceImpl.java:25)
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