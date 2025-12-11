package entrenables;

import alimentos.Alimento;

public class Dron implements Entrenables {

	private int porcentajeBateria;
	
	public Dron() {
		this.porcentajeBateria = 100;
	}
	
	public int getPorcentajeBateria() {
		return porcentajeBateria;
	}
	
	private void validarEntrenar(int distancia) throws Exception {
		if (!(porcentajeBateria >= distancia * 2)) {
			throw new RuntimeException("El dron no tiene bateria suficiente");
		}
	}
	
	public void entrenar(int distancia) throws Exception {
		validarEntrenar(distancia);
		porcentajeBateria -= distancia * 2;
	}

	@Override
	public void comer(Alimento alimento) {}
	
}
