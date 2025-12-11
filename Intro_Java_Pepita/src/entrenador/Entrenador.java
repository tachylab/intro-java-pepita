package entrenador;

import java.util.*;

import entrenables.Entrenables;
import alimentos.*;

public class Entrenador {
	
	private Set<Entrenables> entrenados;
	
	Entrenador() {
		this.entrenados = new HashSet<Entrenables>();
	}
	
	public Set<Entrenables> getAves() {
		return entrenados;
	}
	
	public void agregarEntrenado(Entrenables entrenado) {
		this.entrenados.add(entrenado);
	}
	
	public void alimentar(Alimento alimento) {
		entrenados.stream().forEach(entrenable -> entrenable.comer(alimento));
	}

	public void entrenar(int distancia) {
		entrenados.stream().forEach(entrenable -> {
			try {
				entrenable.entrenar(distancia);
			} catch (Exception e) {
				throw new RuntimeException("Las aves no tienen suficiente energia");
			}
		});
	}
}