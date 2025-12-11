package alimentos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entrenables.aves.Golondrina;

class AlpisteTest {
	
	Alpiste alpiste = new Alpiste();
	Golondrina pepita = new Golondrina();

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAporteEnergetico() {
		assertEquals(100, pepita.getEnergia());
		pepita.comer(alpiste);
		assertEquals(120, pepita.getEnergia());
	}
}
