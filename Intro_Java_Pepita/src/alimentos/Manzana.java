package alimentos;

public class Manzana implements Alimento {

	private int madurez = 1;
	
	private static final int BASE = 5;
	
	Manzana(int madurez) {
		this.madurez = madurez;
	}
	
	
	Manzana() {
		
	}


	public int getMadurez() {
		return madurez;
	}

	public void setMadurez(int madurez) {
		this.madurez = madurez;
	}
	
	public void madurar() {
		madurez += 1;
	}

	public int energiaQueAporta() {
		return BASE * madurez;
	}
	
	
	
}
