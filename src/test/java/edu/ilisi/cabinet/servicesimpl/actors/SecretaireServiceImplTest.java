package edu.ilisi.cabinet.servicesimpl.actors;

import java.util.List;
import edu.ilisi.cabinet.model.actors.Secretaire;
import edu.ilisi.cabinet.services.actors.SecretaireService;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * The class <code>SecretaireServiceImplTest</code> contains tests for the class
 * <code>{@link SecretaireServiceImpl}</code>.
 *
 * @generatedBy CodePro at 05/01/18 15:43
 * @author Home
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SecretaireServiceImplTest {
  /**
   * Run the void addSecretaire(Secretaire) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */

  @Autowired
  private SecretaireService fixture;

  @Test
  public void testAddSecretaire_1() throws Exception {

    Secretaire secretaire = new Secretaire();

    fixture.addSecretaire(secretaire);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.actors.SecretaireServiceImpl.addSecretaire(SecretaireServiceImpl.java:21)
  }

  /**
   * Run the void deleteSecretaire(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testDeleteSecretaire_1() throws Exception {

    Long id = new Long(1L);

    //fixture.deleteSecretaire(id);

    assertNull(fixture.getSecretaire(id));

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.actors.SecretaireServiceImpl.deleteSecretaire(SecretaireServiceImpl.java:31)
  }

  /**
   * Run the List<Secretaire> getAllSecretaires() method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetAllSecretaires_1() throws Exception {

    List<Secretaire> result = fixture.getAllSecretaires();

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.actors.SecretaireServiceImpl.getAllSecretaires(SecretaireServiceImpl.java:36)
    assertNotNull(result);
  }

  /**
   * Run the Secretaire getSecretaire(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetSecretaire_1() throws Exception {

    Long id = new Long(1L);

    Secretaire result = fixture.getSecretaire(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.actors.SecretaireServiceImpl.getSecretaire(SecretaireServiceImpl.java:26)
    //assertNotNull(result);
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