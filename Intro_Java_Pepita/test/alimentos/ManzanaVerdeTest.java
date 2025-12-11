package alimentos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entrenables.aves.Golondrina;

class ManzanaVerdeTest {

	Golondrina pepita = new Golondrina();
	ManzanaVerde manzanaVerde = new ManzanaVerde();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMadurezBase() {
		assertEquals(2, manzanaVerde.getMadurez());
	}
	
	@Test
	void testAporteEnergetico() {
		assertEquals(100, pepita.getEnergia());
		pepita.comer(manzanaVerde);
		assertEquals(105, pepita.getEnergia());
	}

}
