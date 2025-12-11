package entrenables;
import alimentos.Alimento;

public interface Entrenables {

	public abstract void entrenar(int distancia) throws Exception;
	
	public abstract void comer(Alimento alimento);
	
}
