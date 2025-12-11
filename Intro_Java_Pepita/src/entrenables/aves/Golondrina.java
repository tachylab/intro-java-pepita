package entrenables.aves;

public class Golondrina extends Ave {
	
	public Golondrina() {
		super.setEnergia(100);
	}
	
	public Golondrina(int energia) {
		super.setEnergia(energia);
	}

	@Override
	protected int gastoBaseVolar() {
		return 10;
	}
	
	@Override
	protected int gastoVolarDistancia(int distancia) {
		return distancia;
	}
	
	
}
	
	
