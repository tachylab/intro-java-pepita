package entrenador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import alimentos.Alpiste;
import entrenables.Dron;
import entrenables.RobotTerrestre;
import entrenables.aves.Golondrina;
import entrenables.aves.Gorrion;

public class EntrenadorTest {

	Entrenador roque = new Entrenador();
	Golondrina pepita = new Golondrina();
	Gorrion pepon = new Gorrion();
	RobotTerrestre robotTerrestre = new RobotTerrestre();
	Dron dron = new Dron();
	Alpiste alpiste = new Alpiste();
	
	@BeforeEach
	void setUp() {
		roque.agregarEntrenado(pepita);
		roque.agregarEntrenado(pepon);
		roque.agregarEntrenado(dron);
		roque.agregarEntrenado(robotTerrestre);
	}

	@Test
	void testAlimentar() {
		assertEquals(30, pepon.getEnergia());
		assertEquals(100, pepita.getEnergia());
		roque.alimentar(alpiste);
		assertEquals(40, pepon.getEnergia());
		assertEquals(120, pepita.getEnergia());
	}
	
	@Test
	void testEntrenar() {
		assertEquals(30, pepon.getEnergia());
		assertEquals(100, pepita.getEnergia());
		assertEquals(100, dron.getPorcentajeBateria());
		assertEquals(100, robotTerrestre.getCombustible());
		roque.entrenar(3);
		assertEquals(4, pepon.getEnergia());
		assertEquals(87, pepita.getEnergia());
		assertEquals(94, dron.getPorcentajeBateria());
		assertEquals(87, robotTerrestre.getCombustible());
	}
}
