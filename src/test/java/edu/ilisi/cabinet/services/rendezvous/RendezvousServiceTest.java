package edu.ilisi.cabinet.services.rendezvous;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
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

@RunWith(SpringRunner.class)
@SpringBootTest
public class RendezvousServiceTest {

	@Autowired
	private RendezVousService rendezvousService;
	private List<RendezVous> list = new ArrayList<RendezVous>();

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() throws Exception {
		RendezVous rendezVous = null;
		for (int i = 0; i < 10; i++) {
			rendezVous = new RendezVous();
			rendezVous.setDate(new Date("2017/01/01"));
			list.add(rendezvousService.addRendezVous(rendezVous));
		}
	}

	@After
	public void cleanUp() throws Exception {
		for(RendezVous rendezVous:list)
			rendezvousService.deleteRendezVous(rendezVous.getIdRendezVous());
	}

	@Test
	public void testGetRendezVousMois() {
		@SuppressWarnings("deprecation")
		List<RendezVous> rendezvous = rendezvousService.getRendezVousMois(new Date("2017/01/01"));
		assertThat(rendezvous.size()).isGreaterThanOrEqualTo(10);
	}

	@Test
	public void testGetRendezVousJour() {
		@SuppressWarnings("deprecation")
		List<RendezVous> rendezvous = rendezvousService.getRendezVousJour(new Date("2017/01/01"));
		assertThat(rendezvous.size()).isGreaterThanOrEqualTo(10);
	}

}
