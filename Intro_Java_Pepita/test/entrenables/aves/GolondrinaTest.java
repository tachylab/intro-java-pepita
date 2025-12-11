package entrenables.aves;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class GolondrinaTest {
	
	Golondrina pepita = new Golondrina();

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testVolar() throws Exception {
		assertEquals(100, pepita.getEnergia());
		pepita.volar(30);
		assertEquals(60, pepita.getEnergia());
	}
	
	@Test
	void testVolarException() throws Exception {
		assertEquals(100, pepita.getEnergia());
		assertThrows(RuntimeException.class, () -> pepita.volar(100));
	}
}
