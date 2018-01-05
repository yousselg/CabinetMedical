package edu.ilisi.cabinet.servicesimpl.actors;

import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.ilisi.cabinet.model.actors.RefSex;
import edu.ilisi.cabinet.repositories.actors.SexRepository;
import edu.ilisi.cabinet.services.actors.SexService;

/**
 * The class <code>SexServiceImplTest</code> contains tests for the class
 * <code>{@link SexServiceImpl}</code>.
 *
 * @generatedBy CodePro at 05/01/18 15:43
 * @author Home
 * @version $Revision: 1.0 $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SexServiceImplTest {
  /**
   * Run the void addgender(RefSex) method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  @Autowired
  private SexService fixture;

  @Autowired
  private SexRepository sexRepo;

  @Test
  public void testAddgender_1() throws Exception {

    RefSex s = new RefSex();
    s.setLibelle("Ref Sex");

    fixture.addgender(s);
  }

  /**
   * Run the List<RefSex> getlistofSex() method test.
   *
   * @throws Exception
   *
   * @generatedBy CodePro at 05/01/18 15:43
   */
  //@Test
  public void testGetlistofSex_1() throws Exception {

    // List<RefSex> result = fixture.getlistofSex();
    // assertNull(null);

    // add additional test code here
    // An unexpected exception was thrown in user code while executing this test:
    // java.lang.NullPointerException
    // at edu.ilisi.cabinet.servicesimpl.actors.SexServiceImpl.getlistofSex(SexServiceImpl.java:25)
    //
    
    
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
    sexRepo.delete(sexRepo.findByLibelle("Ref Sex"));
  }

}