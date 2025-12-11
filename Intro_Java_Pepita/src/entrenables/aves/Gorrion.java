package entrenables.aves;
import alimentos.*;


public class Gorrion extends Ave {
	
	public Gorrion() {
		super.setEnergia(30);
	}
	
	public Gorrion(int energia) {
		super.setEnergia(energia);
	}

	
	@Override
	protected int gastoBaseVolar() {
		return 20;
	}
	
	@Override
	public void comer(Alimento alimento) {
		energia += (alimento.energiaQueAporta() / 2);
	}

	@Override
	protected int gastoVolarDistancia(int distancia) {
		return 2 * distancia;
	}

}
