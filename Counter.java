package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public int cantidadDeNumerosPares() {
		int contador = 0;
		for (int num : numeros) {
			if (num % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
	
	public int cantidadDeNumerosImpares() {
		int contador = 0;
		for (int num : numeros) {
			if (num % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }
	
	public int contarMultiplosDe(int numero) {
        int contador = 0;
        for (int num : numeros) {
            if (num % numero == 0) {
                contador++;
            }
        }
        return contador;
    }
}
