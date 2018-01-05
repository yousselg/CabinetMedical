package edu.ilisi.cabinet.servicesimpl.actors;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.ilisi.cabinet.model.actors.Docteur;
import edu.ilisi.cabinet.services.actors.DocteurService;

/**
 * The class <code>DocteurServiceImplTest</code> contains tests for the class
 * <code>{@link DocteurServiceImpl}</code>.
 *
 * @generatedBy CodePro at 05/01/18 15:43
 * @author Home
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DocteurServiceImplTest {
  /**
   * Run the void addDocteur(Docteur) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */

  @Autowired
  private DocteurService fixture;

  @Test
  public void testAddDocteur_1() throws Exception {

    Docteur docteur = new Docteur();

    fixture.addDocteur(docteur);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.actors.DocteurServiceImpl.addDocteur(DocteurServiceImpl.java:21)
  }

  /**
   * Run the void deleteDocteur(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testDeleteDocteur_1() throws Exception {

    Long id = new Long(1L);

    // fixture.deleteDocteur(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.actors.DocteurServiceImpl.deleteDocteur(DocteurServiceImpl.java:31)
  }

  /**
   * Run the List<Docteur> getAllDocteurs() method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetAllDocteurs_1() throws Exception {

    List<Docteur> result = fixture.getAllDocteurs();

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.actors.DocteurServiceImpl.getAllDocteurs(DocteurServiceImpl.java:36)
    assertNotNull(result);
  }

  /**
   * Run the Docteur getDocteur(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetDocteur_1() throws Exception {

    Long id = new Long(1L);

    Docteur result = fixture.getDocteur(fixture.getAllDocteurs().get(0).getIdPersonne());

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.actors.DocteurServiceImpl.getDocteur(DocteurServiceImpl.java:26)
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