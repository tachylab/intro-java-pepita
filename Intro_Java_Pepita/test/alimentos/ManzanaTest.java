package alimentos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entrenables.aves.Golondrina;

class ManzanaTest {

	Golondrina pepita = new Golondrina();
	Manzana manzana = new Manzana(1);
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAporteEnergetico() {
		assertEquals(100, pepita.getEnergia());
		pepita.comer(manzana);
		assertEquals(105, pepita.getEnergia());
	}
	
	@Test
	void testMadurar() {
		assertEquals(1, manzana.getMadurez());
		manzana.madurar();
		assertEquals(2, manzana.getMadurez());
	}
	
	@Test
	void testManzanaMaduraMásEnergia() {
		manzana.madurar();
		pepita.comer(manzana);
		assertEquals(10, manzana.energiaQueAporta());
	}

}
