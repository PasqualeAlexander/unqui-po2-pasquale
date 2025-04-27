package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTradicionalTest {
	ProductoTradicional producto;

	@BeforeEach
	void setUp() {
		producto = new ProductoTradicional(100.0, 5, "Arroz");
	}

	@Test
	void testGetPrecio() {
		assertEquals(100.0, producto.getPrecio());
	}

	@Test
	void testGetStock() {
		assertEquals(5, producto.getStock());
	}

	@Test
	void testDecrementarStockReduceElStockEn1() {
		producto.decrementarStock();
		assertEquals(4, producto.getStock());
	}

	@Test
	void testDecrementarStockLanzaExcepcionCuandoNoHayStock() {
		producto.setStock(0);
		assertThrows(IllegalStateException.class, () -> {
			producto.decrementarStock();
		});
	}

	@Test
	void testEsProductoDeCooperativaDevuelveFalse() {
		assertFalse(producto.getEsProductoDeCooperativa());
	}
}
