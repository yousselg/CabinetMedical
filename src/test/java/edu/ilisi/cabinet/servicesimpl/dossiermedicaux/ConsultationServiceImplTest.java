package edu.ilisi.cabinet.servicesimpl.dossiermedicaux;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.ilisi.cabinet.model.dossiersmedicaux.Consultation;
import edu.ilisi.cabinet.model.dossiersmedicaux.Ordonnance;
import edu.ilisi.cabinet.services.dossiersmedicaux.ConsultationService;

/**
 * The class <code>ConsultationServiceImplTest</code> contains tests for the class
 * <code>{@link ConsultationServiceImpl}</code>.
 *
 * @generatedBy CodePro at 05/01/18 15:43
 * @author Home
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsultationServiceImplTest {
  /**
   * Run the void addConsultation(Consultation) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */

  @Autowired
  private ConsultationService fixture;
  private static Long staticId;

  @Test
  public void testAddConsultation_1() throws Exception {

    Consultation consultation = new Consultation();

    fixture.addConsultation(consultation);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.ConsultationServiceImpl.addConsultation(ConsultationServiceImpl.java:26)
  }

  /**
   * Run the Long addOrdonnace(Long,Ordonnance) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testAddOrdonnace_1() throws Exception {

    Long id = new Long(1L);
    Ordonnance ordonnance = new Ordonnance();

    Long result = fixture.addOrdonnace(id, ordonnance);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.ConsultationServiceImpl.getConsultation(ConsultationServiceImpl.java:36)
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.ConsultationServiceImpl.addOrdonnace(ConsultationServiceImpl.java:51)
    assertNotNull(result);
  }

  /**
   * Run the Long addOrdonnace(Long,Ordonnance) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testAddOrdonnace_2() throws Exception {

    Long id = new Long(1L);
    Ordonnance ordonnance = new Ordonnance();

    Long result = fixture.addOrdonnace(id, ordonnance);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.ConsultationServiceImpl.getConsultation(ConsultationServiceImpl.java:36)
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.ConsultationServiceImpl.addOrdonnace(ConsultationServiceImpl.java:51)
    assertNotNull(result);
  }

  /**
   * Run the void deleteConsultation(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testDeleteConsultation_1() throws Exception {

    Long id = new Long(1L);

    //fixture.deleteConsultation(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.ConsultationServiceImpl.deleteConsultation(ConsultationServiceImpl.java:46)
  }

  /**
   * Run the List<Consultation> getAllConsultations() method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetAllConsultations_1() throws Exception {

    List<Consultation> result = fixture.getAllConsultations();
    staticId = result.get(0).getIdConsultation();
    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.ConsultationServiceImpl.getAllConsultations(ConsultationServiceImpl.java:41)
    assertNotNull(result);
  }

  /**
   * Run the Consultation getConsultation(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetConsultation_1() throws Exception {

    Long id = staticId;

    Consultation result = fixture.getConsultation(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.ConsultationServiceImpl.getConsultation(ConsultationServiceImpl.java:36)
    assertNotNull(result);
  }

  /**
   * Run the List<Consultation> getConsultationsByYear(Date,Date) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetConsultationsByYear_1() throws Exception {

    Date d = new Date();
    Date f = new Date();

    List<Consultation> result = fixture.getConsultationsByYear(d, f);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.ConsultationServiceImpl.getConsultationsByYear(ConsultationServiceImpl.java:63)
    assertNotNull(result);
  }

  /**
   * Run the Consultation updateConsultation(Consultation) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testUpdateConsultation_1() throws Exception {

    Consultation consultation = new Consultation();

    Consultation result = fixture.updateConsultation(consultation);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.ConsultationServiceImpl.updateConsultation(ConsultationServiceImpl.java:31)
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