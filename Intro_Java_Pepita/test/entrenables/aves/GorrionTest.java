package entrenables.aves;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import alimentos.*;

class GorrionTest {

	Gorrion pepon = new Gorrion();
	Alpiste alpiste = new Alpiste();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testComer() {
		assertEquals(30, pepon.getEnergia());
		pepon.comer(alpiste);
		assertEquals(40, pepon.getEnergia());
	}
	
	@Test
	void testVolar() throws Exception {
		pepon.volar(3);
		assertEquals(4, pepon.getEnergia());
		assertThrows(RuntimeException.class, () -> pepon.volar(1));
	}

}
