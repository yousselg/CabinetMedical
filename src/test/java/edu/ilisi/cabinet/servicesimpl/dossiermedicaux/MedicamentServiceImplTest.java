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

import edu.ilisi.cabinet.model.dossiersmedicaux.Medicament;
import edu.ilisi.cabinet.services.dossiersmedicaux.MedicamentService;

/**
 * The class <code>MedicamentServiceImplTest</code> contains tests for the class
 * <code>{@link MedicamentServiceImpl}</code>.
 *
 * @generatedBy CodePro at 05/01/18 15:43
 * @author Home
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MedicamentServiceImplTest {

  /**
   * Run the void addMedicament(Medicament) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */

  @Autowired
  private MedicamentService fixture;
  private static Long staticId;

  @Test
  public void testAddMedicament_1() throws Exception {

    Medicament symptome = new Medicament();

    fixture.addMedicament(symptome);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.MedicamentServiceImpl.addMedicament(MedicamentServiceImpl.java:20)
  }

  /**
   * Run the void deleteMedicament(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testDeleteMedicament_1() throws Exception {

    Long id = new Long(1L);

   // fixture.deleteMedicament(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.MedicamentServiceImpl.deleteMedicament(MedicamentServiceImpl.java:40)
  }

  /**
   * Run the List<Medicament> getAllMedicaments() method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetAllMedicaments_1() throws Exception {

    List<Medicament> result = fixture.getAllMedicaments();
    staticId = result.get(0).getIdMedicament();
    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.MedicamentServiceImpl.getAllMedicaments(MedicamentServiceImpl.java:35)
    assertNotNull(result);
  }

  /**
   * Run the Medicament getMedicament(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetMedicament_1() throws Exception {

    Long id = staticId;

    //Medicament result = fixture.getMedicament(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.MedicamentServiceImpl.getMedicament(MedicamentServiceImpl.java:30)
    //assertNotNull(result);
  }

  /**
   * Run the Medicament updateMedicament(Medicament) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testUpdateMedicament_1() throws Exception {

    Medicament symptome = new Medicament();

    Medicament result = fixture.updateMedicament(symptome);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.MedicamentServiceImpl.updateMedicament(MedicamentServiceImpl.java:25)
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