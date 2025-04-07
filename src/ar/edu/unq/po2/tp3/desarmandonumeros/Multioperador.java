package ar.edu.unq.po2.tp3.desarmandonumeros;

import java.util.ArrayList;

public class Multioperador {
	ArrayList<Integer> arrayDeEnteros = new ArrayList<Integer>();

	public Multioperador(ArrayList<Integer> arrayDeEnteros) {
		super();
		this.arrayDeEnteros = arrayDeEnteros;
	}

	int sumaTodos(ArrayList<Integer> arrayASumar) {
		int acumulador = 0;
		for (int num : arrayASumar) {
			acumulador = acumulador + num;
		}
		return acumulador;
	}

	int restaTodos(ArrayList<Integer> arrayARestar) {
		int acumulador = 0;
		for (int num : arrayARestar) {
			acumulador = acumulador - num;
		}
		return acumulador;
	}

	int multATodos(ArrayList<Integer> arrayAMultiplicar) {
		int acumulador = 1;
		for (int num : arrayAMultiplicar) {
			acumulador = acumulador * num;
		}
		return acumulador;

	}
}

/*
 * Programe la clase Multioperador, que permite aplicar las operaciones de suma,
 * resta y multiplicación sobre ArrayLists de enteros. Es decir, poder sumar
 * todos los números que contiene, poder restar todos los números que contiene y
 * poder multiplicar a todos los números que contiene entré si.
 */