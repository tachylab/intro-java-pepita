package entrenables;

import alimentos.Alimento;

public class RobotTerrestre implements Entrenables {

	private int combustible;
	
	public RobotTerrestre() {
		this.combustible = 100;
	}
	
	public int getCombustible() {
		return combustible;
	}
	
	private void validarEntrenar(int distancia) throws Exception {
		if (!(combustible >= 10 + distancia)) {
			throw new RuntimeException("El Robot Terrestre no tiene combustible suficiente");
		}
	}
	
	public void entrenar(int distancia) throws Exception {
		validarEntrenar(distancia);
		combustible -= 10 + distancia;
	}

	@Override
	public void comer(Alimento alimento) {}
	
}
