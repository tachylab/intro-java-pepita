package alimentos;

import java.util.*;
import java.util.stream.Collectors;


public class Combo {

	private Set<Alimento> alimentos;
	
	Combo() {
		this.alimentos = new HashSet<Alimento>();
	}
	
	
	public Set<Alimento> getAlimentos() {
		return alimentos;
	}
	
	public void añadirAlimento(Alimento alimento) {
		alimentos.add(alimento);
	}
	
	public int energiaQueAporta() {
		return alimentos.stream().
				mapToInt(alimento -> alimento.energiaQueAporta()).
				sum();
	}
	
	public Set<Alimento> alimentosQueAportanMasQue(int energia) {
		return alimentos.stream().
				filter(alimento -> alimento.energiaQueAporta() > energia).
				collect(Collectors.toSet());
	}
	
	public boolean hayAlMenosUnAlimentoQueAportaMasQue(int energia) {
		return alimentos.stream().
				anyMatch(alimento -> alimento.energiaQueAporta() > energia);
	}
	
	public boolean todosLosAlimientosAportanMasQue(int energia) {
		return alimentos.stream().
				allMatch(alimento -> alimento.energiaQueAporta() > energia);
	}
}
