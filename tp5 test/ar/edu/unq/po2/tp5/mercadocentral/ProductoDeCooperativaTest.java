package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoDeCooperativaTest {
	ProductoDeCooperativa producto;

	@BeforeEach
	void setUp() {
		producto = new ProductoDeCooperativa(200.0, 3, "Arroz");
	}

	@Test
	void testEsProductoDeCooperativaDevuelveTrue() {
		assertTrue(producto.getEsProductoDeCooperativa());
	}

	@Test
	void testPrecioConDescuentoEs90PorcientoMenor() {
		assertEquals(180.0, producto.getPrecio());
	}
}

