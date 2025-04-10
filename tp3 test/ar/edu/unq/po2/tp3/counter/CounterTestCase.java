package ar.edu.unq.po2.tp3.counter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;

	/**
	 * Crea un escenario de test básico, que consiste en un contador con 10 enteros
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
//Se crea el contador
		counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
		counter.agergaNmeroALaLista(1);
		counter.agergaNmeroALaLista(3);
		counter.agergaNmeroALaLista(5);
		counter.agergaNmeroALaLista(7);
		counter.agergaNmeroALaLista(9);
		counter.agergaNmeroALaLista(1);
		counter.agergaNmeroALaLista(1);
		counter.agergaNmeroALaLista(1);
		counter.agergaNmeroALaLista(1);
		counter.agergaNmeroALaLista(4);
	}

	/**
	 * Verifica la cantidad de pares
	 */
	@Test
	public void testEvenNumbers() {
		// Obteniendo las ocurrencias pares
		int amount = counter.cantidadDeNumerosPares();
		//Verifico que el amount sea el esperado
		assertEquals(amount, 1);
	}
}