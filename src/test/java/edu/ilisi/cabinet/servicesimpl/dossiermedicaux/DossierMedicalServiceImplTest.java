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

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.DossierMedical;
import edu.ilisi.cabinet.services.dossiersmedicaux.DossierMedicalService;

/**
 * The class <code>DossierMedicalServiceImplTest</code> contains tests for the class
 * <code>{@link DossierMedicalServiceImpl}</code>.
 *
 * @generatedBy CodePro at 05/01/18 15:43
 * @author Home
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DossierMedicalServiceImplTest {
  /**
   * Run the Long addConsultation(Long,Consultation) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */

  @Autowired
  private DossierMedicalService fixture;

  @Test
  public void testAddConsultation_1() throws Exception {

    Long id = new Long(1L);
    Consultation consultation = new Consultation();

    Long result = fixture.addConsultation(id, consultation);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.DossierMedicalServiceImpl.getDossierMedical(DossierMedicalServiceImpl.java:46)
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.DossierMedicalServiceImpl.addConsultation(DossierMedicalServiceImpl.java:51)
    assertNotNull(result);
  }

  /**
   * Run the Long addConsultation(Long,Consultation) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testAddConsultation_2() throws Exception {

    Long id = new Long(1L);
    Consultation consultation = new Consultation();

    Long result = fixture.addConsultation(id, consultation);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.DossierMedicalServiceImpl.getDossierMedical(DossierMedicalServiceImpl.java:46)
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.DossierMedicalServiceImpl.addConsultation(DossierMedicalServiceImpl.java:51)
    assertNotNull(result);
  }

  /**
   * Run the void addDossieMecial(DossierMedical) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testAddDossieMecial_1() throws Exception {

    DossierMedical dossierMedical = new DossierMedical();

    fixture.addDossieMecial(dossierMedical);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.DossierMedicalServiceImpl.addDossieMecial(DossierMedicalServiceImpl.java:26)
  }

  /**
   * Run the void deleteDossierMedical(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testDeleteDossierMedical_1() throws Exception {

    Long id = new Long(1L);

    //fixture.deleteDossierMedical(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.DossierMedicalServiceImpl.deleteDossierMedical(DossierMedicalServiceImpl.java:36)
  }

  /**
   * Run the List<DossierMedical> getAllDossierMedicaux() method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetAllDossierMedicaux_1() throws Exception {

    List<DossierMedical> result = fixture.getAllDossierMedicaux();

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.DossierMedicalServiceImpl.getAllDossierMedicaux(DossierMedicalServiceImpl.java:31)
    assertNotNull(result);
  }

  /**
   * Run the DossierMedical getDossierMedical(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetDossierMedical_1() throws Exception {

    Long id = new Long(1L);

    DossierMedical result = fixture.getDossierMedical(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.DossierMedicalServiceImpl.getDossierMedical(DossierMedicalServiceImpl.java:46)
    assertNotNull(result);
  }

  /**
   * Run the DossierMedical updateDossierMedical(DossierMedical) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testUpdateDossierMedical_1() throws Exception {

    DossierMedical dossierMedical = new DossierMedical();

    DossierMedical result = fixture.updateDossierMedical(dossierMedical);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.DossierMedicalServiceImpl.updateDossierMedical(DossierMedicalServiceImpl.java:41)
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