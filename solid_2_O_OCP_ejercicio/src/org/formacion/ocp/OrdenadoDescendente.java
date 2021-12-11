package org.formacion.ocp;

import java.util.ArrayList;
import java.util.List;

public class OrdenadoDescendente implements Orden {

	public OrdenadoDescendente() {
		// TODO Auto-generated constructor stub
	}

	public List<Integer> primos(int limit) {
		List<Integer> primos = new ArrayList<>();
		for (int i = limit - 1; i >= 2; i--) {
			if (esPrimo(i)) {
				primos.add(i);
			}
		}
		return primos;
	}

	private boolean esPrimo (int candidato) {
		for (int i = 2; i < candidato; i++) {
			if (candidato % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
