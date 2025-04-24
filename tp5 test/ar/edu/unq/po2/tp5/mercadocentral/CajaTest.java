package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CajaTest {
	Caja cajaRegistradora;
	Producto producto;
	ProductoDeCooperativa productoCoop;

	@BeforeEach
	void setUp() {
		cajaRegistradora = new Caja();
		producto = new Producto(150.0, 2);
		productoCoop = new ProductoDeCooperativa(100.0, 3);
	}

	@Test
	void testRegistrarUnProductoIncrementaMontoYReduceStock() {
		cajaRegistradora.registrarUnProducto(producto);
		assertEquals(1, producto.getStock());
		assertEquals(150.0, cajaRegistradora.getMontoTotalAPagar());
	}

	@Test
	void testRegistrarProductoDeCooperativaAplicaDescuento() {
		cajaRegistradora.registrarUnProducto(productoCoop);
		assertEquals(2, productoCoop.getStock());
		assertEquals(90.0, cajaRegistradora.getMontoTotalAPagar()); // Es correcto que de 90 como resultado de  getMontoTotalAPagar porque cada test se ejecuta de manera 
																	// asilada en J unit, por ende el precio del anterior prducto no es tenido en cuenta.
	}

	@Test
	void testRegistrarProductoSinStockLanzaExcepcion() {
		producto.setStock(0);
		assertThrows(IllegalStateException.class, () -> {
			cajaRegistradora.registrarUnProducto(producto);
		});
	}

	@Test
	void testRegistrarMultiplesProductos() {
		List<Producto> productos = Arrays.asList(producto, productoCoop);
		cajaRegistradora.registrarPoductos(productos);
		assertEquals(1, producto.getStock());
		assertEquals(2, productoCoop.getStock());
		assertEquals(240.0, cajaRegistradora.getMontoTotalAPagar()); // 150 + 10
	}
	
	@Test
	void testRegistrarDosProductosSumaAmbosPrecios() { // En este test si es tenido en cuenta ya que en el mismo se ponen los dos prodcutos.
	    cajaRegistradora.registrarUnProducto(producto);      // 150.0
	    cajaRegistradora.registrarUnProducto(productoCoop);  // 90.0

	    assertEquals(240.0, cajaRegistradora.getMontoTotalAPagar());
	}

}

	

