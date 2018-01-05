package edu.ilisi.cabinet.servicesimpl.actors;

import java.util.List;
import edu.ilisi.cabinet.model.actors.Patient;
import edu.ilisi.cabinet.services.actors.PatientService;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * The class <code>PatientServiceImplTest</code> contains tests for the class
 * <code>{@link PatientServiceImpl}</code>.
 *
 * @generatedBy CodePro at 05/01/18 15:43
 * @author Home
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceImplTest {
  /**
   * Run the void addPatient(Patient) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */

  @Autowired
  private PatientService fixture;
  
  private static Long id;

  @Test
  public void testAddPatient_1() throws Exception {

    Patient patient = new Patient();

    fixture.addPatient(patient);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.actors.PatientServiceImpl.addPatient(PatientServiceImpl.java:21)
  }

  /**
   * Run the void deletePatient(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testDeletePatient_1() throws Exception {

    Long id = new Long(1L);

    //fixture.deletePatient(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.actors.PatientServiceImpl.deletePatient(PatientServiceImpl.java:31)
  }

  /**
   * Run the List<Patient> getAllPatients() method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetAllPatients_1() throws Exception {

    List<Patient> result = fixture.getAllPatients();
    id=result.get(0).getIdPersonne();
    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.actors.PatientServiceImpl.getAllPatients(PatientServiceImpl.java:36)
    assertNotNull(result);
  }

  /**
   * Run the Patient getPatient(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetPatient_1() throws Exception {

    //Long id = new Long(14L);

    Patient result = fixture.getPatient(id);
    
    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.actors.PatientServiceImpl.getPatient(PatientServiceImpl.java:26)
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