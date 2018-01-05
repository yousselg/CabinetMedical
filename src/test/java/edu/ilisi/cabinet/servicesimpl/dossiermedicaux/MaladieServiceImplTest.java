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

import edu.ilisi.cabinet.model.dossiersmedicaux.Maladie;
import edu.ilisi.cabinet.services.dossiersmedicaux.MaladieService;

/**
 * The class <code>MaladieServiceImplTest</code> contains tests for the class
 * <code>{@link MaladieServiceImpl}</code>.
 *
 * @generatedBy CodePro at 05/01/18 15:43
 * @author Home
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MaladieServiceImplTest {
  /**
   * Run the void addMaladie(Maladie) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */

  @Autowired
  private MaladieService fixture;

  @Test
  public void testAddMaladie_1() throws Exception {

    Maladie maladie = new Maladie();

    fixture.addMaladie(maladie);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.MaladieServiceImpl.addMaladie(MaladieServiceImpl.java:25)
  }

  /**
   * Run the void addMaladie(Maladie) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testAddMaladie_2() throws Exception {

    Maladie maladie = new Maladie();

    fixture.addMaladie(maladie);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.MaladieServiceImpl.addMaladie(MaladieServiceImpl.java:25)
  }

  /**
   * Run the void deleteMaladie(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testDeleteMaladie_1() throws Exception {

    Long id = new Long(1L);

    //fixture.deleteMaladie(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.MaladieServiceImpl.deleteMaladie(MaladieServiceImpl.java:50)
  }

  /**
   * Run the List<Maladie> getAllMaladies() method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetAllMaladies_1() throws Exception {

    List<Maladie> result = fixture.getAllMaladies();

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.MaladieServiceImpl.getAllMaladies(MaladieServiceImpl.java:45)
    assertNotNull(result);
  }

  /**
   * Run the Maladie getMaladie(Long) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testGetMaladie_1() throws Exception {

    Long id = new Long(1L);

    Maladie result = fixture.getMaladie(id);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.MaladieServiceImpl.getMaladie(MaladieServiceImpl.java:40)
    assertNotNull(result);
  }

  /**
   * Run the Maladie updateMaladie(Maladie) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testUpdateMaladie_1() throws Exception {

    Maladie maladie = new Maladie();

    Maladie result = fixture.updateMaladie(maladie);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.MaladieServiceImpl.updateMaladie(MaladieServiceImpl.java:33)
    assertNotNull(result);
  }

  /**
   * Run the Maladie updateMaladie(Maladie) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Test
  public void testUpdateMaladie_2() throws Exception {

    Maladie maladie = new Maladie();

    Maladie result = fixture.updateMaladie(maladie);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at
    // edu.ilisi.cabinet.servicesimpl.dossiermedicaux.MaladieServiceImpl.updateMaladie(MaladieServiceImpl.java:33)
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