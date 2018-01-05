package edu.ilisi.cabinet.servicesimpl.rendezvous;

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

import edu.ilisi.cabinet.model.rendezvous.RendezVous;
import edu.ilisi.cabinet.services.rendezvous.RendezVousService;

/**
 * The class <code>RendezVousServiceImplTest</code> contains tests for the class
 * <code>{@link RendezVousServiceImpl}</code>.
 *
 * @generatedBy CodePro at 05/01/18 15:43
 * @author Home
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RendezVousServiceImplTest {
  /**
   * Run the RendezVous addRendezVous(RendezVous) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */

  @Autowired
  private RendezVousService fixture;

  @Test
  public void testAddRendezVous_1() throws Exception {

    RendezVous rendezVous = new RendezVous();

    RendezVous result = fixture.addRendezVous(rendezVous);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.rendezvous.RendezVousServiceImpl.addRendezVous(RendezVousServiceImpl.java:21)
    assertNotNull(result);
  }

  /**
   * Run the void deleteRendezVous(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testDeleteRendezVous_1() throws Exception {

    Long id = new Long(1L);

    // fixture.deleteRendezVous(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.rendezvous.RendezVousServiceImpl.deleteRendezVous(RendezVousServiceImpl.java:31)
  }

  /**
   * Run the List<RendezVous> getAllRendezVous() method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetAllRendezVous_1() throws Exception {

    List<RendezVous> result = fixture.getAllRendezVous();

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.rendezvous.RendezVousServiceImpl.getAllRendezVous(RendezVousServiceImpl.java:26)
    assertNotNull(result);
  }

  /**
   * Run the RendezVous getRendezVous(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetRendezVous_1() throws Exception {

    Long id = new Long(1L);

    RendezVous result = fixture.getRendezVous(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.rendezvous.RendezVousServiceImpl.getRendezVous(RendezVousServiceImpl.java:41)
    // assertNotNull(result);
  }

  /**
   * Run the List<RendezVous> getRendezVousJour(Date) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetRendezVousJour_1() throws Exception {

    Date jour = new Date();

    List<RendezVous> result = fixture.getRendezVousJour(jour);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.rendezvous.RendezVousServiceImpl.getRendezVousJour(RendezVousServiceImpl.java:51)
    assertNotNull(result);
  }

  /**
   * Run the List<RendezVous> getRendezVousMois(Integer,Integer) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetRendezVousMois_1() throws Exception {

    Integer annee = new Integer(1);
    Integer mois = new Integer(1);

    List<RendezVous> result = fixture.getRendezVousMois(annee, mois);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.rendezvous.RendezVousServiceImpl.getRendezVousMois(RendezVousServiceImpl.java:46)
    assertNotNull(result);
  }

  /**
   * Run the RendezVous updateRendezVous(RendezVous) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testUpdateRendezVous_1() throws Exception {

    RendezVous rendezVous = new RendezVous();

    RendezVous result = fixture.updateRendezVous(rendezVous);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.rendezvous.RendezVousServiceImpl.updateRendezVous(RendezVousServiceImpl.java:36)
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