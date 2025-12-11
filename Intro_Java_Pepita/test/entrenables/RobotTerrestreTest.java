package entrenables;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RobotTerrestreTest {

	RobotTerrestre robotTerrestre = new RobotTerrestre();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEntrenar() throws Exception {
		assertEquals(100, robotTerrestre.getCombustible());
		robotTerrestre.entrenar(20);
		assertEquals(70, robotTerrestre.getCombustible());
	}

	@Test
	void testEntrenarException() throws Exception {
		assertEquals(100, robotTerrestre.getCombustible());
		assertThrows(RuntimeException.class, () -> robotTerrestre.entrenar(91));
	}
	
	
}
