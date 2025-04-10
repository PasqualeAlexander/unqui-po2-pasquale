package ar.edu.unq.po2.tp3.desarmandonumeros;

import java.util.ArrayList;
import java.lang.Math;

public class DesarmandoNumeros {
	private ArrayList<Integer> arrayDeNumeros;

	public DesarmandoNumeros(ArrayList<Integer> arrayDeEnteros) {
		this.arrayDeNumeros = arrayDeEnteros;
	}

	int cantidadDeDigitosPares(ArrayList<Integer> arrayDeEnteros) {
		int numeroConMasDigitosPares = 0; // Si todos son impares retorna 0
		for (int num : arrayDeEnteros) {
			numeroConMasDigitosPares = numeroConMasDigitosParesEntre(num, numeroConMasDigitosPares);
		}
		return numeroConMasDigitosPares;
	}

	int numeroConMasDigitosParesEntre(int unNumero, int otroNumero) {
		int contadorDePares1 = cantidadDeDigitosParesDe(unNumero);
		int contadorDePares2 = cantidadDeDigitosParesDe(otroNumero);
		if (contadorDePares1 >= contadorDePares2) {
			return unNumero;
		} else {
			return otroNumero;
		}
	}

	private int cantidadDeDigitosParesDe(int numero) {
		if (numero == 0)
			return 1; // 0 se considera un dígito par
		int contadorPares = 0;
		int num = Math.abs(numero); // Trabajamos con el valor absoluto para numeros negativos
		while (num > 0) {
			int digito = num % 10; // Obtengo el ultimo numero porque me da el resto de la division por 10
			if (digito % 2 == 0) {
				contadorPares++;
			}
			num = num / 10; // Aca saco el numero
		}
		return contadorPares;
	}
}