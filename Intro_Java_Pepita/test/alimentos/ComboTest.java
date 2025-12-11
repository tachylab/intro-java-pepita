package alimentos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComboTest {

	Combo combo = new Combo();
	Alpiste alpiste = new Alpiste();
	Manzana manzana = new Manzana();
	ManzanaVerde manzanaVerde = new ManzanaVerde();
	
	
	@BeforeEach
	void setUp() throws Exception {
		combo.añadirAlimento(alpiste);
		combo.añadirAlimento(manzana);
		combo.añadirAlimento(manzanaVerde);
	}

	@Test
	void testEnergiaAportada() {
		assertEquals(30, combo.energiaQueAporta());
	}
	
	@Test
	void testElementosQueAportanMasQue() {
		Set<Alimento> alimentoEsperado = new HashSet<Alimento>();
		alimentoEsperado.add(alpiste);
		assertEquals(alimentoEsperado, combo.alimentosQueAportanMasQue(10));
		alimentoEsperado.add(manzanaVerde);
		alimentoEsperado.add(manzana);
		assertEquals(alimentoEsperado, combo.alimentosQueAportanMasQue(4));
	}
	
	@Test
	void testHayAlimentosQueAportanMasQue() {
		assertTrue(combo.hayAlMenosUnAlimentoQueAportaMasQue(5));
		assertFalse(combo.hayAlMenosUnAlimentoQueAportaMasQue(21));
	}
	
	@Test
	void testTodosLosAlimentosAportanMasQue() {
		assertTrue(combo.todosLosAlimientosAportanMasQue(4));
		assertFalse(combo.todosLosAlimientosAportanMasQue(5));
	}

}
