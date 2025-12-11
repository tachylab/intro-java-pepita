package alimentos;

public class ManzanaVerde extends Manzana {
	
	
	ManzanaVerde(int madurez) {
		super.setMadurez(madurez);
	}
	
	
	ManzanaVerde() {
		super.setMadurez(2);
	}
	
	@Override
	public int energiaQueAporta() {
		return super.energiaQueAporta() / 2;
	}
}
