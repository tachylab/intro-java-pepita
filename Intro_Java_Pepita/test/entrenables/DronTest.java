package entrenables;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DronTest {

	Dron dron = new Dron();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEntrenar() throws Exception {
		assertEquals(100, dron.getPorcentajeBateria());
		dron.entrenar(20);
		assertEquals(60, dron.getPorcentajeBateria());
		assertThrows(RuntimeException.class, () -> dron.entrenar(31));
	}
	
	@Test
	void testEntrenarException() throws Exception {
		assertEquals(100, dron.getPorcentajeBateria());
		assertThrows(RuntimeException.class, () -> dron.entrenar(51));
	}

}
