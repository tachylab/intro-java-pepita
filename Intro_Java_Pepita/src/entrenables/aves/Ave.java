package entrenables.aves;
import alimentos.*;
import entrenables.Entrenables;


public abstract class Ave implements Entrenables {

	protected int energia;
	
	public int getEnergia() {
		return energia;
	}
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public void comer (Alimento alimento) {
		energia += alimento.energiaQueAporta();
	}
	
	public void entrenar(int distancia) throws Exception {
		this.volar(distancia);
	}
	
	public void volar(int distancia) throws Exception {
		validarVolar(distancia);
		energia -= gastoBaseVolar() + gastoVolarDistancia(distancia);
	}
	
	protected abstract int gastoBaseVolar();
	
	protected abstract int gastoVolarDistancia(int distancia);
	
	public boolean puedeVolar(int distancia) {
		return energia >= gastoBaseVolar() + distancia;
	}
	
	protected void validarVolar(int distancia) throws Exception {
		if (! this.puedeVolar(distancia)) {
			throw new RuntimeException("Pepita no tiene energia suficiente para recorrer esa distancia");
		}
	}
	
}
